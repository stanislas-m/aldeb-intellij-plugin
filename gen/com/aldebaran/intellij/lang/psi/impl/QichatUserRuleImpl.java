// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.lang.psi.*;

public class QichatUserRuleImpl extends ASTWrapperPsiElement implements QichatUserRule {

  public QichatUserRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitUserRule(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QichatCommandLine> getCommandLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QichatCommandLine.class);
  }

  @Override
  @NotNull
  public QichatEventInput getEventInput() {
    return findNotNullChildByClass(QichatEventInput.class);
  }

}