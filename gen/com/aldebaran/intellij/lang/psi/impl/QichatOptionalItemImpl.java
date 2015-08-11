// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aldebaran.intellij.lang.psi.*;

public class QichatOptionalItemImpl extends ASTWrapperPsiElement implements QichatOptionalItem {

  public QichatOptionalItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitOptionalItem(this);
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

}
