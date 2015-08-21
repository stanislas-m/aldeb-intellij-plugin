// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QichatCommand extends PsiElement {

  @Nullable
  QichatCall getCall();

  @Nullable
  QichatGotoReactivate getGotoReactivate();

  @Nullable
  QichatNextProposal getNextProposal();

  @Nullable
  QichatPCall getPCall();

  @Nullable
  QichatPreviousProposal getPreviousProposal();

  @Nullable
  QichatSCall getSCall();

  @Nullable
  QichatSameProposal getSameProposal();

}
