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

public class QichatConceptImpl extends ASTWrapperPsiElement implements QichatConcept {

  public QichatConceptImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitConcept(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QichatChoiceList> getChoiceListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QichatChoiceList.class);
  }

  @Override
  @NotNull
  public List<QichatConceptCall> getConceptCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QichatConceptCall.class);
  }

  @Override
  @NotNull
  public List<QichatOptionalItem> getOptionalItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QichatOptionalItem.class);
  }

  @Override
  @NotNull
  public List<QichatString> getStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QichatString.class);
  }

  @Override
  @NotNull
  public PsiElement getEol() {
    return findNotNullChildByType(EOL);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
