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

public class QichatHeaderImpl extends ASTWrapperPsiElement implements QichatHeader {

  public QichatHeaderImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QichatVisitor) ((QichatVisitor)visitor).visitHeader(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public QichatLanguageHeader getLanguageHeader() {
    return findNotNullChildByClass(QichatLanguageHeader.class);
  }

  @Override
  @NotNull
  public QichatTopicHeader getTopicHeader() {
    return findNotNullChildByClass(QichatTopicHeader.class);
  }

}
