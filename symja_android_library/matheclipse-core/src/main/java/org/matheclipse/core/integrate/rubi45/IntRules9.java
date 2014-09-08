package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules9 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Times(Power(pn,CN1),Subst(Int(Times(Plus(pa,Times(pb,x)),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(pd,x)),q)),x),x,Power(x,pn))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),ZeroQ(Plus(m,Times(CN1,pn),C1))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(Times(x_,Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Plus(c_,Times(pd_DEFAULT,Power(x_,pn_)))),CN1)),x_Symbol),
    Condition(Plus(Times(pa,Log(x),Power(Times(a,c),CN1)),Times(CN1,b,Plus(Times(pa,b),Times(CN1,a,pb)),Power(Times(a,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(Power(x,Plus(pn,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,pn))),CN1)),x)),Times(CN1,pd,Plus(Times(pb,c),Times(CN1,pa,pd)),Power(Times(c,Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(Power(x,Plus(pn,Times(CN1,C1))),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(FreeQ(List(a,b,c,pd,pa,pb,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Plus(c_,Times(pd_DEFAULT,Power(x_,pn_)))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,pn))),CN1)),x)),Times(Plus(Times(pb,c),Times(CN1,pa,pd)),Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Times(Power(x,m),Power(Plus(c,Times(pd,Power(x,pn))),CN1)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,pn)),Less(Less(CN1,m),pn)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(Times(x_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Sqrt(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))))),CN1)),x_Symbol),
    Condition(Plus(Times(pa,Power(a,CN1),Int(Power(Times(x,Sqrt(Plus(c,Times(pd,Power(x,pn))))),CN1),x)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(a,CN1),Int(Times(Power(x,Plus(pn,Times(CN1,C1))),Power(Times(Plus(a,Times(b,Power(x,pn))),Sqrt(Plus(c,Times(pd,Power(x,pn))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Sqrt(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))))),CN1)),x_Symbol),
    Condition(Plus(Times(pb,Power(b,CN1),Int(Times(Power(x,m),Power(Plus(c,Times(pd,Power(x,pn))),CN1D2)),x)),Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(b,CN1),Int(Times(Power(x,m),Power(Times(Plus(a,Times(b,Power(x,pn))),Sqrt(Plus(c,Times(pd,Power(x,pn))))),CN1)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),RationalQ(m,pn)),Less(Less(C0,Plus(m,C1)),pn)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),q)),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),Or(PositiveIntegerQ(p,q),And(And(IntegersQ(m,p,q),Greater(p,C0)),Equal(q,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),q),Power(Times(a,b,pn,Plus(p,C1)),CN1)),Times(Power(Times(a,b,pn,Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(Times(pa,b,pn,Plus(p,C1)),Times(Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)))),Times(pd,Plus(Times(pa,b,pn,Plus(p,C1)),Times(Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,Times(pn,q),C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(p,q)),Less(p,CN1)),Greater(q,C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(x,Plus(m,Times(CN1,pn),C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,C1)),Power(Times(b,pn,Plus(Times(b,c),Times(CN1,a,pd)),Plus(p,C1)),CN1)),Times(CN1,Power(Times(b,pn,Plus(Times(b,c),Times(CN1,a,pd)),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,pn))),Simp(Plus(Times(c,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,Times(CN1,pn),C1)),Times(Plus(Times(pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,Times(pn,q),C1)),Times(CN1,b,pn,Plus(Times(pb,c),Times(CN1,pa,pd)),Plus(p,C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),q)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,pn,p)),Less(Less(C0,pn),Plus(m,C1))),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pa,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),q),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,pn)),Simp(Plus(Times(c,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)),Times(pa,pn,Plus(Times(b,c,Plus(p,C1)),Times(a,pd,q))),Times(pd,Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)),Times(pa,b,pn,Plus(p,q,C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,p),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,pn,q)),Less(m,CN1)),Greater(pn,C0)),Greater(q,C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pb,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),q),Power(Times(b,Plus(m,Times(pn,Plus(p,q,C1)),C1)),CN1)),Times(Power(Times(b,Plus(m,Times(pn,Plus(p,q,C1)),C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)),Times(pa,b,pn,Plus(p,q,C1)))),Times(Plus(Times(pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)),Times(pb,pn,q,Plus(Times(b,c),Times(CN1,a,pd))),Times(pa,b,pd,pn,Plus(p,q,C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(q)),Greater(q,C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,C1)),Power(Times(a,pn,Plus(Times(b,c),Times(CN1,a,pd)),Plus(p,C1)),CN1)),Times(Power(Times(a,pn,Plus(Times(b,c),Times(CN1,a,pd)),Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1)),Times(pa,pn,Plus(Times(b,c),Times(CN1,a,pd)),Plus(p,C1)),Times(pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,Times(pn,Plus(p,q,C2)),C1),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),q)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pb,Power(x,Plus(m,Times(CN1,pn),C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,C1)),Power(Times(b,pd,Plus(m,Times(pn,Plus(p,q,C1)),C1)),CN1)),Times(CN1,Power(Times(b,pd,Plus(m,Times(pn,Plus(p,q,C1)),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,pn))),Simp(Plus(Times(a,pb,c,Plus(m,Times(CN1,pn),C1)),Times(Plus(Times(a,pb,pd,Plus(m,Times(pn,q),C1)),Times(CN1,b,Plus(Times(CN1,pb,c,Plus(m,Times(pn,p),C1)),Times(pa,pd,Plus(m,Times(pn,Plus(p,q,C1)),C1))))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),q)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,p,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,pn)),Less(Less(C0,pn),Plus(m,C1))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pa,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(q,C1)),Power(Times(a,c,Plus(m,C1)),CN1)),Times(Power(Times(a,c,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,pn)),Simp(Plus(Times(a,pb,c,Plus(m,C1)),Times(CN1,pa,Plus(Times(b,c),Times(a,pd)),Plus(m,pn,C1)),Times(CN1,pa,pn,Plus(Times(b,c,p),Times(a,pd,q))),Times(CN1,pa,b,pd,Plus(m,Times(pn,Plus(p,q,C2)),C1),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),q)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,p,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,pn_))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),q)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p,q),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Times(pb,c),Times(CN1,pa,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(v_,pn_))),Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(w_,pn_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(z_,pn_))),q_DEFAULT)),x_Symbol),
    Condition(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),CN1),Subst(Int(Times(Power(x,m),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(c,Times(pd,Power(x,pn))),q)),x),x,v)),And(And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p,q),x),LinearPairQ(u,v,x)),ZeroQ(Plus(v,Times(CN1,w)))),ZeroQ(Plus(v,Times(CN1,z)))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,pn_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_DEFAULT))),p_),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(pd,Times(c,Power(x,pn))),q),Power(Power(x,Times(pn,q)),CN1)),x),And(And(FreeQ(List(a,b,c,pd,pa,pb,pn,p),x),ZeroQ(Plus(pn,r))),IntegerQ(q)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,pn_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_DEFAULT))),p_),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Times(Power(x,Times(pn,q)),Power(Plus(c,Times(pd,Power(Power(x,pn),CN1))),q),Power(Power(Plus(pd,Times(c,Power(x,pn))),q),CN1),Int(Times(Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(pd,Times(c,Power(x,pn))),q),Power(Power(x,Times(pn,q)),CN1)),x)),And(And(FreeQ(List(a,b,c,pd,pa,pb,pn,p,q),x),ZeroQ(Plus(pn,r))),Not(IntegerQ(q))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,pn_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_DEFAULT))),p_),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(CN1,pn,q))),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(pd,Times(c,Power(x,pn))),q)),x),And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p),x),ZeroQ(Plus(pn,r))),IntegerQ(q)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,pn_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_DEFAULT))),p_),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Times(Power(x,Times(pn,q)),Power(Plus(c,Times(pd,Power(Power(x,pn),CN1))),q),Power(Power(Plus(pd,Times(c,Power(x,pn))),q),CN1),Int(Times(Power(x,Plus(m,Times(CN1,pn,q))),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn))),p),Power(Plus(pd,Times(c,Power(x,pn))),q)),x)),And(And(FreeQ(List(a,b,c,pd,pa,pb,m,pn,p,q),x),ZeroQ(Plus(pn,r))),Not(IntegerQ(q))))),
ISetDelayed(Int(Times(z_,Power(u_,p_DEFAULT),Power(v_,q_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),ExpandToSum(z,x),Power(ExpandToSum(u,x),p),Power(ExpandToSum(v,x),q)),x),And(And(And(And(FreeQ(List(m,p,q),x),BinomialQ(List(z,u,v),x)),ZeroQ(Plus(BinomialDegree(u,x),Times(CN1,BinomialDegree(v,x))))),ZeroQ(Plus(BinomialDegree(u,x),Times(CN1,BinomialDegree(z,x))))),Not(BinomialMatchQ(List(z,u,v),x)))))
  );
}