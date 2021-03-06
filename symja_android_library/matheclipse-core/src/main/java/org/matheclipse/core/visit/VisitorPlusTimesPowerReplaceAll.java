package org.matheclipse.core.visit;

import java.util.function.Function;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

/**
 * Replace all occurrences of expressions where the given <code>function.apply()</code> method returns a non
 * <code>F.NIL</code> value. The visitors <code>visit()</code> methods return <code>F.NIL</code> if no substitution
 * occurred.
 */
public class VisitorPlusTimesPowerReplaceAll extends VisitorReplaceAll {

	public VisitorPlusTimesPowerReplaceAll(Function<IExpr, IExpr> function) {
		super(function, 1);
	}

	public VisitorPlusTimesPowerReplaceAll(IAST ast) {
		super(ast, 1);
	}

	@Override
	public IExpr visit(IAST ast) {
		if (ast.isPlusTimesPower()) {
			return visitAST(ast);
		}
		IExpr temp = fFunction.apply(ast);
		if (temp.isPresent()) {
			return temp;
		}
		return F.NIL;
	}

	@Override
	protected IExpr visitAST(IAST ast) {
		if (ast.isPower()) {

		}
		IExpr temp;
		IAST result = F.NIL;
		if (ast.isPower()) {
			temp = ast.get(1).accept(this);
			if (temp.isPresent()) {
				// something was evaluated - return a new IAST:
				result = ast.copy();
				result.set(1, temp);
				return result;
			}
			return F.NIL;
		}
		int i = fOffset;
		int size = ast.size();
		while (i < size) {
			temp = ast.get(i).accept(this);
			if (temp.isPresent()) {
				// something was evaluated - return a new IAST:
				result = ast.copy();
				result.set(i++, temp);
				break;
			}
			i++;
		}
		if (result.isPresent()) {
			while (i < size) {
				temp = ast.get(i).accept(this);
				if (temp.isPresent()) {
					result.set(i, temp);
				}
				i++;
			}
		}
		return result;
	}
}
