package com.aldebaran.intellij.lang.psi;

import com.aldebaran.intellij.lang.file.dialogs.top.QichatLanguage;
import com.aldebaran.intellij.lang.file.dialogs.top.TopFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class QichatFile extends PsiFileBase {

    public QichatFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, QichatLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TopFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Qichat File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
