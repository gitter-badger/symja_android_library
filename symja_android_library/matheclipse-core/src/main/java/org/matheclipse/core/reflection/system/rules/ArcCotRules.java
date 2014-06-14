package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface ArcCotRules {
  final public static IAST RULES = List(
    ISet(ArcCot(C0),
      C0),
    ISet(ArcCot(C1),
      Times(C1D4,Pi)),
    ISet(ArcCot(CInfinity),
      C0),
    ISet(ArcCot(CNInfinity),
      C0),
    ISet(ArcCot(CComplexInfinity),
      C0)
  );
}