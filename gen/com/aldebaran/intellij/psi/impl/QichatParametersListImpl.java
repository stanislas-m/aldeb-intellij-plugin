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

public class QichatParametersListImpl extends ASTWrapperPsiElement implements QichatParametersList {

  public QichatParametersListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitParametersList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QichatParametersList getParametersList() {
    return findChildByClass(QichatParametersList.class);
  }

  @Override
  @Nullable
  public PsiElement getSpace() {
    return findChildByType(SPACE);
  }

}
