// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QichatProposal extends PsiElement {

  @NotNull
  List<QichatChoiceList> getChoiceListList();

  @NotNull
  List<QichatConceptCall> getConceptCallList();

  @NotNull
  List<QichatOptionalItem> getOptionalItemList();

  @NotNull
  List<QichatTag> getTagList();

}
