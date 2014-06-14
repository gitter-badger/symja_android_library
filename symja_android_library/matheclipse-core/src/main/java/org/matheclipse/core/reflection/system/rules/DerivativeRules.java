package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface DerivativeRules {
  final public static IAST RULES = List(
    ISet(Derivative(ArcCos),
      Function(Times(CN1,Power(Plus(C1,Times(CN1,Sqr(Slot1))),CN1D2)))),
    ISet(Derivative(ArcCosh),
      Function(Power(Plus(Sqr(Slot1),Times(CN1,C1)),CN1D2))),
    ISet(Derivative(ArcCot),
      Function(Times(CN1,Power(Plus(C1,Sqr(Slot1)),CN1)))),
    ISet(Derivative(ArcCoth),
      Function(Power(Plus(C1,Times(CN1,Sqr(Slot1))),CN1))),
    ISet(Derivative(ArcCsc),
      Function(Times(CN1,Power(Slot1,CN2),Power(Plus(C1,Times(CN1,Power(Slot1,CN2))),CN1D2)))),
    ISet(Derivative(ArcCsch),
      Function(Times(CN1,Power(Abs(Slot1),CN1),Power(Plus(C1,Sqr(Slot1)),CN1D2)))),
    ISet(Derivative(ArcSin),
      Function(Power(Plus(C1,Times(CN1,Sqr(Slot1))),CN1D2))),
    ISet(Derivative(ArcSinh),
      Function(Power(Plus(C1,Sqr(Slot1)),CN1D2))),
    ISet(Derivative(ArcTan),
      Function(Power(Plus(C1,Sqr(Slot1)),CN1))),
    ISet(Derivative(ArcTanh),
      Function(Power(Plus(C1,Times(CN1,Sqr(Slot1))),CN1))),
    ISet(Derivative(ArcSec),
      Function(Times(Power(Slot1,CN2),Power(Plus(C1,Times(CN1,Power(Slot1,CN2))),CN1D2)))),
    ISet(Derivative(ArcSech),
      Function(Times(CN1,Power(Slot1,CN1),Power(Plus(C1,Times(CN1,Sqr(Slot1))),CN1D2)))),
    ISet(Derivative(Log),
      Function(Power(Slot1,CN1))),
    ISet(Derivative(Cot),
      Function(Times(CN1,Power(Sin(Slot1),CN2)))),
    ISet(Derivative(Coth),
      Function(Times(CN1,Power(Sinh(Slot1),CN2)))),
    ISet(Derivative(Cos),
      Function(Times(CN1,Sin(Slot1)))),
    ISet(Derivative(Cosh),
      Function(Times(CN1,Sinh(Slot1)))),
    ISet(Derivative(Csc),
      Function(Times(CN1,Cot(Slot1),Csc(Slot1)))),
    ISet(Derivative(Csch),
      Function(Times(CN1,Coth(Slot1),Csch(Slot1)))),
    ISet(Derivative(Sin),
      Function(Cos(Slot1))),
    ISet(Derivative(Sinh),
      Function(Cosh(Slot1))),
    ISet(Derivative(Tan),
      Function(Power(Cos(Slot1),CN2))),
    ISet(Derivative(Tanh),
      Function(Power(Cosh(Slot1),CN2))),
    ISet(Derivative(Sec),
      Function(Times(Sec(Slot1),Tan(Slot1)))),
    ISet(Derivative(Sech),
      Function(Times(CN1,Tanh(Slot1),Sech(Slot1))))
  );
}