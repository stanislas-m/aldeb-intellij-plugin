package com.aldebaran.intellij.lang.dialogs.dlg;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.AldebaranIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranDlgFileType extends LanguageFileType {

    public static final AldebaranDlgFileType INSTANCE = new AldebaranDlgFileType();

    protected AldebaranDlgFileType() {
        super(AldebaranDlgLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Aldebaran Dialog File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aldebaran Dialog File.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "dlg";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AldebaranIcons.DlgFile;
    }
}
