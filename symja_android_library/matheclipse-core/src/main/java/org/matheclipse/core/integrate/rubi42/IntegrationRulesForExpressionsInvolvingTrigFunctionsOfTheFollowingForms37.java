package org.matheclipse.core.integrate.rubi42;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * IntegrationRules rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms37 { 
  public static IAST RULES = List( 
SetDelayed(Int(ArcTan(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(b,Plus(CI,Times(CN1,c),Times(CI,d)),Int(Times(x,Power(Plus(CI,Times(CN1,c),Times(CI,d),Times(Plus(Times(CN1,CI),c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(b,Plus(CI,c,Times(CN1,CI,d)),Int(Times(x,Power(Plus(Times(CN1,CI),Times(CN1,c),Times(CI,d),Times(Plus(CI,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))))),
SetDelayed(Int(ArcCot(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(CN1,b,Plus(CI,Times(CN1,c),Times(CI,d)),Int(Times(x,Power(Plus(CI,Times(CN1,c),Times(CI,d),Times(Plus(Times(CN1,CI),c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,b,Plus(CI,c,Times(CN1,CI,d)),Int(Times(x,Power(Plus(Times(CN1,CI),Times(CN1,c),Times(CI,d),Times(Plus(CI,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))))),
SetDelayed(Int(Times(ArcTan(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CN1,CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCot(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcTan(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(b,Plus(CI,Times(CN1,c),Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,Times(CN1,c),Times(CI,d),Times(Plus(Times(CN1,CI),c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(b,Plus(CI,c,Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Times(CN1,CI),Times(CN1,c),Times(CI,d),Times(Plus(CI,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCot(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CN1,b,Plus(CI,Times(CN1,c),Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,Times(CN1,c),Times(CI,d),Times(Plus(Times(CN1,CI),c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,b,Plus(CI,c,Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Times(CN1,CI),Times(CN1,c),Times(CI,d),Times(Plus(CI,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),C1))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(ArcTanh(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcTanh(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),Times(CI,b,Int(Times(x,Power(Plus(c,Times(CI,d),Times(c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcCoth(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcCoth(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),Times(CI,b,Int(Times(x,Power(Plus(c,Times(CI,d),Times(c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcTanh(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcTanh(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),Times(CI,b,Plus(C1,c,Times(CI,d)),Int(Times(x,Power(Plus(C1,c,Times(CI,d),Times(Plus(C1,c,Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Int(Times(x,Power(Plus(C1,Times(CN1,c),Times(CN1,CI,d),Times(Plus(C1,Times(CN1,c),Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcCoth(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcCoth(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),Times(CI,b,Plus(C1,c,Times(CI,d)),Int(Times(x,Power(Plus(C1,c,Times(CI,d),Times(Plus(C1,c,Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Int(Times(x,Power(Plus(C1,Times(CN1,c),Times(CN1,CI,d),Times(Plus(C1,Times(CN1,c),Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(Times(ArcTanh(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CI,d),Times(c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCoth(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CI,d),Times(c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcTanh(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Plus(C1,c,Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,c,Times(CI,d),Times(Plus(C1,c,Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,Times(CN1,c),Times(CN1,CI,d),Times(Plus(C1,Times(CN1,c),Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCoth(Plus(Times(Tan(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Plus(C1,c,Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,c,Times(CI,d),Times(Plus(C1,c,Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,Times(CN1,c),Times(CN1,CI,d),Times(Plus(C1,Times(CN1,c),Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(ArcTanh(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcTanh(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(CI,b,Int(Times(x,Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcCoth(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcCoth(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(CI,b,Int(Times(x,Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcTanh(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcTanh(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(CI,b,Plus(C1,c,Times(CN1,CI,d)),Int(Times(x,Power(Plus(C1,c,Times(CN1,CI,d),Times(CN1,Plus(C1,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CI,d)),Int(Times(x,Power(Plus(C1,Times(CN1,c),Times(CI,d),Times(CN1,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(ArcCoth(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,ArcCoth(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),Times(CI,b,Plus(C1,c,Times(CN1,CI,d)),Int(Times(x,Power(Plus(C1,c,Times(CN1,CI,d),Times(CN1,Plus(C1,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CI,d)),Int(Times(x,Power(Plus(C1,Times(CN1,c),Times(CI,d),Times(CN1,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))))),
SetDelayed(Int(Times(ArcTanh(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCoth(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Times(CN1,CI,d),Times(CN1,c,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcTanh(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Plus(C1,c,Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,c,Times(CN1,CI,d),Times(CN1,Plus(C1,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,Times(CN1,c),Times(CI,d),Times(CN1,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(ArcCoth(Plus(Times(Cot(Plus(Times($p(b,true),$p(x)),$p(a,true))),$p(d,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Plus(m,C1),CN1)),Times(CI,b,Plus(C1,c,Times(CN1,CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,c,Times(CN1,CI,d),Times(CN1,Plus(C1,c,Times(CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x)),Times(CN1,CI,b,Plus(C1,Times(CN1,c),Times(CI,d)),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(C1,Times(CN1,c),Times(CI,d),Times(CN1,Plus(C1,Times(CN1,c),Times(CN1,CI,d)),Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(Plus(c,Times(CN1,CI,d)),C2),Times(CN1,C1)))),RationalQ(m)),Greater(m,C0))))
  );
}