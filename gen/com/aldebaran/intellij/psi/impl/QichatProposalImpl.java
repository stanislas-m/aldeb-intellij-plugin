// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aldebaran.intellij.psi.QichatTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.psi.*;

public class QichatProposalImpl extends ASTWrapperPsiElement implements QichatProposal {

  public QichatProposalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitProposal(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QichatChoiceList getChoiceList() {
    return findChildByClass(QichatChoiceList.class);
  }

  @Override
  @Nullable
  public QichatOptionalChoiceList getOptionalChoiceList() {
    return findChildByClass(QichatOptionalChoiceList.class);
  }

  @Override
  @Nullable
  public PsiElement getSpace() {
    return findChildByType(SPACE);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
