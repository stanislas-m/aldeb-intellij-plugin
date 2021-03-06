package com.aldebaran.intellij.lang.psi;

import com.aldebaran.intellij.lang.file.dialogs.top.QichatLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class QichatTokenType extends IElementType {
    public QichatTokenType(@NotNull String debug) {
        super(debug, QichatLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "QichatTokenType." + super.toString();
    }
}
