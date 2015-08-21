// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aldebaran.intellij.lang.psi.QichatTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.lang.psi.*;

public class QichatDialogDefinitionLineImpl extends ASTWrapperPsiElement implements QichatDialogDefinitionLine {

  public QichatDialogDefinitionLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitDialogDefinitionLine(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QichatConcept getConcept() {
    return findChildByClass(QichatConcept.class);
  }

  @Override
  @Nullable
  public QichatProposal getProposal() {
    return findChildByClass(QichatProposal.class);
  }

  @Override
  @Nullable
  public QichatUserRule getUserRule() {
    return findChildByClass(QichatUserRule.class);
  }

}
