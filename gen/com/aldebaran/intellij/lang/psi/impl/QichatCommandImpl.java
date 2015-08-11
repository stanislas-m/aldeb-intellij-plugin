// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.lang.psi.*;

public class QichatCommandImpl extends ASTWrapperPsiElement implements QichatCommand {

  public QichatCommandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitCommand(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QichatCall getCall() {
    return findChildByClass(QichatCall.class);
  }

  @Override
  @Nullable
  public QichatGotoReactivate getGotoReactivate() {
    return findChildByClass(QichatGotoReactivate.class);
  }

  @Override
  @Nullable
  public QichatNextProposal getNextProposal() {
    return findChildByClass(QichatNextProposal.class);
  }

  @Override
  @Nullable
  public QichatPCall getPCall() {
    return findChildByClass(QichatPCall.class);
  }

  @Override
  @Nullable
  public QichatPreviousProposal getPreviousProposal() {
    return findChildByClass(QichatPreviousProposal.class);
  }

  @Override
  @Nullable
  public QichatSCall getSCall() {
    return findChildByClass(QichatSCall.class);
  }

  @Override
  @Nullable
  public QichatSameProposal getSameProposal() {
    return findChildByClass(QichatSameProposal.class);
  }

}
