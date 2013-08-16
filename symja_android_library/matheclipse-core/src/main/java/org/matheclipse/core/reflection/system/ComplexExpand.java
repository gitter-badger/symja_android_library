package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.Im;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Re;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.integer;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.IFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.visit.VisitorExpr;

/**
 * Exponential definitions for trigonometric functions
 * 
 * See <a href="http://en.wikipedia.org/wiki/List_of_trigonometric_identities#Exponential_definitions">List of trigonometric
 * identities - Exponential definitions</a>
 */
public class ComplexExpand implements IFunctionEvaluator {

	public ComplexExpand() {
	}

	static class ComplexExpandVisitor extends VisitorExpr {
		public ComplexExpandVisitor() {
			super();
		}

		@Override
		public IExpr visit2(IExpr head, IExpr arg1) {
			IExpr x = arg1;
			IExpr result = arg1.accept(this);
			if (result != null) {
				x = result;
			}
			IExpr reX = Re(x);
			IExpr imX = Im(x);
			if (x.isSymbol()) {
				if (head.equals(Re)) {
					return x;
				}
				if (head.equals(Im)) {
					return F.C0;
				}
				reX = x;
				imX = F.C0;
			} else {
				reX = F.eval(Re(x));
				imX = F.eval(Im(x));
				IExpr temp = complexExpandNull(reX);
				if (temp != null) {
					reX = temp;
				}
				temp = complexExpandNull(imX);
				if (temp != null) {
					imX = temp;
				}
			}

			if (head.equals(Cos)) {
				// Cosh[Im[x]]*Cos[Re[x]]+I*Sinh[Im[x]]*Sin[Re[x]]
				return Plus(Times(Cosh(imX), Cos(reX)), Times(Times(CI, Sinh(imX)), Sin(reX)));
			}
			if (head.equals(Cot)) {
				// -(Sin[2*Re[x]]/(Cos[2*Re[x]]-Cosh[2*Im[x]]))+(I*Sinh[2*Im[x]])/(Cos[2*Re[x]]-Cosh[2*Im[x]])
				return Plus(
						Times(CN1,
								Times(Sin(Times(C2, reX)),
										Power(Plus(Cos(Times(C2, reX)), Times(CN1, Cosh(Times(C2, imX)))), CN1))),
						Times(Times(CI, Sinh(Times(C2, imX))),
								Power(Plus(Cos(Times(C2, reX)), Times(CN1, Cosh(Times(C2, imX)))), CN1)));
			}
			if (head.equals(Csc)) {
				// (-2 Cosh[Im[x]] Sin[Re[x]])/(Cos[2 Re[x]] - Cosh[2 Im[x]]) + ((2 I) Cos[Re[x]] Sinh[Im[x]])/(Cos[2 Re[x]] -
				// Cosh[2 Im[x]])
				return Plus(
						Times(Times(Times(integer(-2L), Cosh(imX)), Sin(reX)),
								Power(Plus(Cos(Times(C2, reX)), Times(CN1, Cosh(Times(C2, imX)))), CN1)),
						Times(Times(Times(Times(C2, CI), Cos(reX)), Sinh(imX)),
								Power(Plus(Cos(Times(C2, reX)), Times(CN1, Cosh(Times(C2, imX)))), CN1)));
			}
			if (head.equals(Sec)) {
				// (2 Cos[Re[x]] Cosh[Im[x]])/(Cos[2 Re[x]] + Cosh[2 Im[x]]) + ((2 I) Sin[Re[x]] Sinh[Im[x]])/(Cos[2 Re[x]] + Cosh[2
				// Im[x]])
				return Plus(
						Times(Times(Times(C2, Cos(reX)), Cosh(imX)),
								Power(Plus(Cos(Times(C2, reX)), Cosh(Times(C2, imX))), CN1)),
						Times(Times(Times(Times(C2, CI), Sin(reX)), Sinh(imX)),
								Power(Plus(Cos(Times(C2, reX)), Cosh(Times(C2, imX))), CN1)));
			}
			if (head.equals(Sin)) {
				// Cosh[Im[x]]*Sin[Re[x]]+I*Sinh[Im[x]]*Cos[Re[x]]
				return Plus(Times(Cosh(imX), Sin(reX)), Times(Times(CI, Sinh(imX)), Cos(reX)));
			}
			if (head.equals(Tan)) {
				// Sin[2*Re[x]]/(Cos[2*Re[x]] + Cosh[2*Im[x]]) + (I*Sinh[2*Im[x]])/(Cos[2*Re[x]] + Cosh[2*Im[x]])
				return Plus(Times(Sin(Times(C2, reX)), Power(Plus(Cos(Times(C2, reX)), Cosh(Times(C2, imX))), CN1)),
						Times(Times(CI, Sinh(Times(C2, imX))), Power(Plus(Cos(Times(C2, reX)), Cosh(Times(C2, imX))), CN1)));
			}
			if (result != null) {
				return $(head, result);
			}
			return null;
		}
	}

	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 1, 2);
		IExpr arg1 = ast.get(1);
		return complexExpand(arg1);
	}

	private static IExpr complexExpand(IExpr arg1) {
		IExpr result = complexExpandNull(arg1);
		if (result != null) {
			return result;
		}
		return arg1;
	}

	private static IExpr complexExpandNull(IExpr arg1) {
		ComplexExpandVisitor tteVisitor = new ComplexExpandVisitor();
		return arg1.accept(tteVisitor);
	}

	public IExpr numericEval(final IAST functionList) {
		return evaluate(functionList);
	}

	public void setUp(final ISymbol symbol) {
		symbol.setAttributes(ISymbol.LISTABLE);
	}

}