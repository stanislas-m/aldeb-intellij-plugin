// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.lang.psi.*;

public class QichatPCallImpl extends ASTWrapperPsiElement implements QichatPCall {

  public QichatPCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitPCall(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public QichatCallCommandParameters getCallCommandParameters() {
    return findNotNullChildByClass(QichatCallCommandParameters.class);
  }

}
