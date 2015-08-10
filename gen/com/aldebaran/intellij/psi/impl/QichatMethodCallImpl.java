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

public class QichatMethodCallImpl extends ASTWrapperPsiElement implements QichatMethodCall {

  public QichatMethodCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitMethodCall(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public QichatParametersList getParametersList() {
    return findNotNullChildByClass(QichatParametersList.class);
  }

  @Override
  @NotNull
  public PsiElement getClassName() {
    return findNotNullChildByType(CLASS_NAME);
  }

  @Override
  @NotNull
  public PsiElement getMethodName() {
    return findNotNullChildByType(METHOD_NAME);
  }

}