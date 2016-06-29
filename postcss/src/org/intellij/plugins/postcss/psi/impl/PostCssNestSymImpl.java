package org.intellij.plugins.postcss.psi.impl;

import com.intellij.psi.impl.source.tree.CompositePsiElement;
import org.intellij.plugins.postcss.PostCssElementTypes;
import org.intellij.plugins.postcss.psi.PostCssNestSym;

public class PostCssNestSymImpl extends CompositePsiElement implements PostCssNestSym {
  protected PostCssNestSymImpl() {
    super(PostCssElementTypes.POST_CSS_NEST_SYM);
  }
}