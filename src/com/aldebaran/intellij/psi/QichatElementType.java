package com.aldebaran.intellij.psi;

import com.aldebaran.intellij.lang.dialogs.top.QichatLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class QichatElementType extends IElementType {
    public QichatElementType(@NotNull @NonNls String debugName) {
        super(debugName, QichatLanguage.INSTANCE);
    }
}
