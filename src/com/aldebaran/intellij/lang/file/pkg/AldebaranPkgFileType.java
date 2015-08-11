package com.aldebaran.intellij.lang.file.pkg;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.AldebaranIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranPkgFileType extends LanguageFileType {

    public static final AldebaranPkgFileType INSTANCE = new AldebaranPkgFileType();

    protected AldebaranPkgFileType() {
        super(AldebaranPkgLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Aldebaran Robot Package";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aldebaran Robot Package.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pkg";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AldebaranIcons.PkgFile;
    }
}
