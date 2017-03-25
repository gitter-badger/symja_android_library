package org.matheclipse.core.builtin;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.BreakException;
import org.matheclipse.core.eval.exception.ConditionException;
import org.matheclipse.core.eval.exception.ContinueException;
import org.matheclipse.core.eval.exception.IterationLimitExceeded;
import org.matheclipse.core.eval.exception.NoEvalException;
import org.matheclipse.core.eval.exception.ReturnException;
import org.matheclipse.core.eval.exception.ThrowException;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.exception.WrappedException;
import org.matheclipse.core.eval.exception.WrongArgumentType;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.eval.util.Iterator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.generic.Functors;
import org.matheclipse.core.generic.interfaces.IIterator;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.patternmatching.IPatternMatcher;
import org.matheclipse.core.visit.ModuleReplaceAll;
import org.matheclipse.parser.client.math.MathException;

public final class Programming {
	final static Programming CONST = new Programming();

	static {
		F.Break.setEvaluator(new Break());
		F.Block.setEvaluator(new Block());
		F.Catch.setEvaluator(new Catch());
		F.CompoundExpression.setEvaluator(new CompoundExpression());
		F.Condition.setEvaluator(new Condition());
		F.Continue.setEvaluator(new Continue());
		F.Do.setEvaluator(new Do());
		F.For.setEvaluator(new For());
		F.If.setEvaluator(new If());
		F.Module.setEvaluator(new Module());
		F.Part.setEvaluator(new Part());
		F.Reap.setEvaluator(new Reap());
		F.Return.setEvaluator(new Return());
		F.Sow.setEvaluator(new Sow());
		F.Switch.setEvaluator(new Switch());
		F.Throw.setEvaluator(new Throw());
		F.Which.setEvaluator(new Which());
		F.While.setEvaluator(new While());

	}

	/**
	 * <p>
	 * <code>Break()</code> leaves a <code>Do</code>, <code>For</code> or
	 * <code>While</code> loop.
	 * </p>
	 * <p>
	 * See the online Symja function reference: <a href=
	 * "https://bitbucket.org/axelclk/symja_android_library/wiki/Symbols/Break">
	 * Break</a>
	 * </p>
	 *
	 */
	private final static class Break extends AbstractCoreFunctionEvaluator {

		public Break() {
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST0()) {
				throw BreakException.CONST;
			}
			Validate.checkSize(ast, 1);

			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	/**
	 * 
	 * <p>
	 * See the online Symja function reference: <a href=
	 * "https://bitbucket.org/axelclk/symja_android_library/wiki/Symbols/Block">
	 * Block</a>
	 * </p>
	 *
	 */
	private final static class Block extends AbstractCoreFunctionEvaluator {
		public Block() {
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkSize(ast, 3);

			if (ast.arg1().isList()) {
				final IAST blockVariablesList = (IAST) ast.arg1();
				return engine.evalBlock(ast.arg2(), blockVariablesList);
			}

			return F.NIL;
		}

		@Override
		public void setUp(ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	/**
	 * <p>
	 * See the online Symja function reference: <a href=
	 * "https://bitbucket.org/axelclk/symja_android_library/wiki/Symbols/Catch">
	 * Catch</a>
	 * </p>
	 */
	private final static class Catch extends AbstractCoreFunctionEvaluator {

		public Catch() {
			super();
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkSize(ast, 2);
			try {
				return engine.evaluate(ast.arg1());
			} catch (final ThrowException e) {
				return e.getValue();
			}
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class CompoundExpression extends AbstractCoreFunctionEvaluator {

		public CompoundExpression() {
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.size() > 1) {
				for (int i = 1; i < ast.size() - 1; i++) {
					// as sideeffect evaluate the i-th argument
					engine.evaluate(ast.get(i));
				}
				return engine.evaluate(ast.get(ast.size() - 1));
			}
			return F.Null;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Condition extends AbstractCoreFunctionEvaluator {

		public Condition() {
			// default ctor
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST2()) {
				if (engine.evalTrue(ast.arg2())) {
					return engine.evaluate(ast.arg1());
				}
				if (engine.isEvalLHSMode()) {
					return F.NIL;
				}
				throw new ConditionException(ast);
			}
			Validate.checkSize(ast, 3);
			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Continue extends AbstractCoreFunctionEvaluator {

		public Continue() {
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST0()) {
				throw ContinueException.CONST;
			}
			Validate.checkSize(ast, 1);

			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
		}

	}

	/**
	 * 
	 */
	private final static class Do extends AbstractCoreFunctionEvaluator {
		public static class DoIterator {

			final List<? extends IIterator<IExpr>> fIterList;
			final EvalEngine fEngine;
			int fIndex;

			public DoIterator(final List<? extends IIterator<IExpr>> iterList, EvalEngine engine) {
				fIterList = iterList;
				fEngine = engine;
				fIndex = 0;
			}

			public IExpr doIt(IExpr input) {
				if (fIndex < fIterList.size()) {
					final IIterator<IExpr> iter = fIterList.get(fIndex);
					if (iter.setUp()) {
						try {
							fIndex++;
							while (iter.hasNext()) {
								try {
									iter.next();
									fEngine.evaluate(input);
								} catch (final ReturnException e) {
									return e.getValue();
								} catch (final BreakException e) {
									return F.Null;
								} catch (final ContinueException e) {
									continue;
								}

							}
						} finally {
							--fIndex;
							iter.tearDown();
						}
					}
					return F.Null;
				}
				return F.NIL;
			}
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkRange(ast, 3);
			try {
				final List<IIterator<IExpr>> iterList = new ArrayList<IIterator<IExpr>>();
				for (int i = 2; i < ast.size(); i++) {
					iterList.add(Iterator.create((IAST) ast.get(i), engine));
				}
				final DoIterator generator = new DoIterator(iterList, engine);
				return generator.doIt(ast.arg1());
			} catch (final ClassCastException e) {
				// the iterators are generated only from IASTs
			} catch (final NoEvalException e) {
			}
			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}
	}

	/**
	 * For[] loop
	 * 
	 * Example: For[$j = 1, $j <= 10, $j++, Print[$j]]
	 * 
	 */
	private final static class For extends AbstractCoreFunctionEvaluator {

		public For() {
			super();
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkRange(ast, 4, 5);
			final int iterationLimit = engine.getIterationLimit();
			int iterationCounter = 1;

			// For(start, test, incr, body)
			engine.evaluate(ast.arg1()); // start
			IExpr test = ast.arg2();
			IExpr incr = ast.arg3();
			IExpr body = F.Null;
			if (ast.size() == 5) {
				body = ast.arg4();
			}
			boolean exit = false;
			while (true) {
				try {
					if (!engine.evaluate(test).isTrue()) {
						exit = true;
						return F.Null;
					}
					if (ast.size() == 5) {
						engine.evaluate(body);
					}
					if (iterationLimit >= 0 && iterationLimit <= ++iterationCounter) {
						IterationLimitExceeded.throwIt(iterationCounter, ast);
					}
				} catch (final BreakException e) {
					exit = true;
					return F.Null;
				} catch (final ContinueException e) {
					if (iterationLimit >= 0 && iterationLimit <= ++iterationCounter) {
						IterationLimitExceeded.throwIt(iterationCounter, ast);
					}
					continue;
				} catch (final ReturnException e) {
					return e.getValue();
				} finally {
					if (!exit) {
						engine.evaluate(incr);
					}
				}
			}
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class If extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkRange(ast, 3, 5);

			final IExpr temp = engine.evaluate(ast.arg1());

			if (temp.isFalse()) {
				if (ast.size() >= 4) {
					return ast.arg3();
				}

				return F.Null;
			}

			if (temp.equals(F.True)) {
				return ast.arg2();
			}

			if (ast.size() == 5) {
				return ast.arg4();
			}

			return F.Null;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Module extends AbstractCoreFunctionEvaluator {
		/**
		 *
		 */
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkSize(ast, 3);

			if (ast.arg1().isList()) {
				IAST lst = (IAST) ast.arg1();
				IExpr arg2 = ast.arg2();
				return evalModule(lst, arg2, engine);
			}

			return F.NIL;
		}

		/**
		 * <code>Module[{variablesList}, rhs ]</code>
		 * 
		 * @param intializerList
		 * @param arg2
		 * @param engine
		 * @return
		 */
		private static IExpr evalModule(IAST intializerList, IExpr arg2, final EvalEngine engine) {
			final int moduleCounter = engine.incModuleCounter();
			final String varAppend = "$" + moduleCounter;
			final java.util.IdentityHashMap<ISymbol, ISymbol> moduleVariables = new IdentityHashMap<ISymbol, ISymbol>();

			try {
				rememberVariables(intializerList, varAppend, moduleVariables, engine);
				IExpr subst = arg2.accept(new ModuleReplaceAll(moduleVariables));
				if (subst.isPresent()) {
					return engine.evaluate(subst);
				}
				return arg2;
			} finally {
				engine.removeUserVariables(moduleVariables);
			}
		}

		@Override
		public void setUp(ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Part extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.size() >= 3) {
				IExpr arg1 = engine.evaluate(ast.arg1());
				if (arg1.isAST()) {
					IAST evaledAST = F.NIL;

					boolean numericMode = engine.isNumericMode();
					IExpr temp;
					try {
						int astSize = ast.size();
						for (int i = 2; i < astSize; i++) {
							temp = engine.evalLoop(ast.get(i));
							if (temp.isPresent()) {
								if (evaledAST.isPresent()) {
									evaledAST.set(i, temp);
								} else {
									evaledAST = ast.copy();
									evaledAST.addEvalFlags(ast.getEvalFlags() & IAST.IS_MATRIX_OR_VECTOR);
									evaledAST.set(i, temp);
								}
							}
						}
					} finally {
						engine.setNumericMode(numericMode);
					}
					if (evaledAST.isPresent()) {
						return getPart((IAST) arg1, evaledAST, 2, engine);
					}
					return getPart((IAST) arg1, ast, 2, engine);
				}
			}
			return F.NIL;
		}

		private IExpr getPart(final IAST arg1, final IAST ast, int pos, EvalEngine engine) {
			final IExpr arg2 = ast.get(pos);
			int p1 = pos + 1;
			if (arg2.isSignedNumber()) {
				final int indx = Validate.checkIntType(ast, pos, Integer.MIN_VALUE);
				IExpr ires = null;
				ires = getIndex(arg1, indx);
				if (p1 < ast.size()) {
					if (ires.isAST()) {
						return getPart((IAST) ires, ast, p1, engine);
					} else {
						throw new WrongArgumentType(ast, arg1, pos,
								"Wrong argument for Part[] function. Function or list expected.");
					}
				}
				return ires;
			} else if (arg2.isSpan()) {
				IAST span = (IAST) arg2;
				if (span.isAST2()) {
					final int indx1 = Validate.checkIntType(span, 1, Integer.MIN_VALUE);
					final int indx2;
					if (span.arg2().equals(F.All)) {
						indx2 = arg1.size() - 1;
					} else {
						indx2 = Validate.checkIntType(span, 2, Integer.MIN_VALUE);
					}

					IAST result = arg1.copyHead();
					int last = indx2;
					if (indx2 < 0) {
						last = arg1.size() + indx2;
					}
					for (int i = indx1; i <= last; i++) {
						result.append(arg1.get(i));
					}
					return result;
				}
			} else if (arg2.isList()) {
				IExpr temp = null;
				final IAST lst = (IAST) arg2;
				final IAST result = F.ListC(lst.size());

				for (int i = 1; i < lst.size(); i++) {
					final IExpr expr = lst.get(i);
					if (expr.isInteger()) {
						IExpr ires = null;

						final int indx = Validate.checkIntType(lst, i, Integer.MIN_VALUE);
						ires = getIndex(arg1, indx);
						if (ires == null) {
							return F.NIL;
						}
						if (p1 < ast.size()) {
							if (ires.isAST()) {
								temp = getPart((IAST) ires, ast, p1, engine);
								result.append(temp);
							} else {
								throw new WrongArgumentType(ast, arg1, pos,
										"Wrong argument for Part[] function. Function or list expected.");
							}
						} else {
							result.append(ires);
						}
					}
				}
				return result;
			}
			engine.printMessage(
					"Wrong argument for Part[] function: " + arg2.toString() + " selects no part expression.");
			return F.NIL;
		}

		/**
		 * Get the element stored at the given <code>position</code>.
		 * 
		 * @param ast
		 * @param position
		 * @return
		 */
		IExpr getIndex(IAST ast, int position) {
			if (position < 0) {
				position = ast.size() + position;
			}
			if ((position < 0) || (position >= ast.size())) {
				throw new WrappedException(new IndexOutOfBoundsException(
						"Part[] index " + position + " of " + ast.toString() + " is out of bounds."));
			}
			return ast.get(position);
		}
	}

	private final static class Reap extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkSize(ast, 2);

			IAST oldList = engine.getReapList();
			try {
				IAST result = F.List();
				IAST reapList = F.ListAlloc(10);
				engine.setReapList(reapList);
				IExpr expr = engine.evaluate(ast.arg1());
				result.append(expr);
				if (reapList.isAST0()) {
					result.append(F.List());
				} else {
					result.append(F.List(reapList));
				}
				return result;
			} finally {
				engine.setReapList(oldList);
			}

		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Return extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST0()) {
				throw new ReturnException();
			}
			if (ast.isAST1()) {
				throw new ReturnException(engine.evaluate(ast.arg1()));
			}
			Validate.checkRange(ast, 1, 2);

			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
		}

	}

	private final static class Sow extends AbstractCoreFunctionEvaluator {

		// public final static double DEFAULT_CHOP_DELTA = 10E-10;

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkSize(ast, 2);

			IAST reapList = engine.getReapList();
			IExpr expr = engine.evaluate(ast.arg1());
			if (reapList != null) {
				reapList.append(expr);
			}
			return expr;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Switch extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkRange(ast, 4);
			final IExpr arg1 = engine.evaluate(ast.arg1());
			IPatternMatcher matcher;
			for (int i = 2; i < ast.size(); i += 2) {
				matcher = engine.evalPatternMatcher(ast.get(i));
				if (matcher.test(arg1) && (i + 1 < ast.size())) {
					return engine.evaluate(ast.get(i + 1));
				}
			}
			return F.Null;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Throw extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST1()) {
				throw new ThrowException(engine.evaluate(ast.arg1()));
			}
			Validate.checkSize(ast, 2);

			return F.NIL;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class Which extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkEven(ast);

			for (int i = 1; i < ast.size(); i += 2) {
				IExpr temp = engine.evaluate(ast.get(i));
				if (temp.isFalse()) {
					continue;
				}
				if (temp.isTrue()) {
					if ((i + 1 < ast.size())) {
						return engine.evaluate(ast.get(i + 1));
					}
					continue;
				}
				if (i == 1) {
					return F.NIL;
				}
				return F.ast(ast, ast.head(), true, i, ast.size());
			}
			return F.Null;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	private final static class While extends AbstractCoreFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Validate.checkRange(ast, 2, 3);

			final int iterationLimit = engine.getIterationLimit();
			int iterationCounter = 1;
			// While(test, body)
			IExpr test = ast.arg1();
			IExpr body = F.Null;
			if (ast.isAST2()) {
				body = ast.arg2();
			}

			while (engine.evaluate(test).isTrue()) {
				try {
					if (ast.isAST2()) {
						engine.evaluate(body);
					}
					if (iterationLimit >= 0 && iterationLimit <= ++iterationCounter) {
						IterationLimitExceeded.throwIt(iterationCounter, ast);
					}
				} catch (final BreakException e) {
					return F.Null;
				} catch (final ContinueException e) {
					continue;
				} catch (final ReturnException e) {
					return e.getValue();
				}
			}

			return F.Null;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.HOLDALL);
		}

	}

	/**
	 * Remember which local variable names (appended with the module counter) we
	 * use in the given <code>variablesMap</code>.
	 * 
	 * @param variablesList
	 *            initializer variables list from the <code>Module</code>
	 *            function
	 * @param varAppend
	 *            the module counter string which aer appended to the variable
	 *            names.
	 * @param variablesMap
	 *            the resulting module variables map
	 * @param engine
	 *            the evaluation engine
	 */
	private static void rememberVariables(IAST variablesList, final String varAppend,
			final java.util.Map<ISymbol, ISymbol> variablesMap, final EvalEngine engine) {
		ISymbol oldSymbol;
		ISymbol newSymbol;
		for (int i = 1; i < variablesList.size(); i++) {
			if (variablesList.get(i).isSymbol()) {
				oldSymbol = (ISymbol) variablesList.get(i);
				newSymbol = F.$s(oldSymbol.toString() + varAppend);
				variablesMap.put(oldSymbol, newSymbol);
				newSymbol.pushLocalVariable();
			} else {
				if (variablesList.get(i).isAST(F.Set, 3)) {
					final IAST setFun = (IAST) variablesList.get(i);
					if (setFun.arg1().isSymbol()) {
						oldSymbol = (ISymbol) setFun.arg1();
						newSymbol = F.$s(oldSymbol.toString() + varAppend);
						variablesMap.put(oldSymbol, newSymbol);
						IExpr rightHandSide = setFun.arg2();
						try {
							rightHandSide = engine.evaluate(rightHandSide);
						} catch (MathException me) {
							if (Config.DEBUG) {
								me.printStackTrace();
							}
						}
						newSymbol.pushLocalVariable(rightHandSide);
					}
				}
			}
		}
	}

	/**
	 * Check the (possible nested) module condition in pattern matcher without
	 * evaluating a result.
	 * 
	 * @param arg1
	 * @param arg2
	 * @param engine
	 * @return
	 */
	public static boolean checkModuleCondition(IExpr arg1, IExpr arg2, final EvalEngine engine) {
		if (arg1.isList()) {
			IAST intializerList = (IAST) arg1;
			final int moduleCounter = engine.incModuleCounter();
			final String varAppend = "$" + moduleCounter;
			final java.util.Map<ISymbol, ISymbol> moduleVariables = new IdentityHashMap<ISymbol, ISymbol>();

			try {
				rememberVariables(intializerList, varAppend, moduleVariables, engine);
				IExpr result = F.subst(arg2, Functors.rules(moduleVariables));
				if (result.isCondition()) {
					return checkCondition(result.getAt(1), result.getAt(2), engine);
				} else if (result.isModule()) {
					return checkModuleCondition(result.getAt(1), result.getAt(2), engine);
				}
			} finally {
				engine.removeUserVariables(moduleVariables);
			}
		}
		return true;
	}

	/**
	 * Check the (possible nested) condition in pattern matcher without
	 * evaluating a result.
	 * 
	 * @param arg1
	 * @param arg2
	 * @param engine
	 * @return
	 */
	public static boolean checkCondition(IExpr arg1, IExpr arg2, final EvalEngine engine) {
		if (engine.evalTrue(arg2)) {
			if (arg1.isCondition()) {
				return checkCondition(arg1.getAt(1), arg1.getAt(2), engine);
			} else if (arg2.isModule()) {
				return checkModuleCondition(arg2.getAt(1), arg2.getAt(2), engine);
			}
			return true;
		}
		return false;
	}

	public static Programming initialize() {
		return CONST;
	}

	private Programming() {

	}
}