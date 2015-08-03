package com.aldebaran.intellij.lang.pml;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.AldebaranIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranPmlFileType extends LanguageFileType {

    public static final AldebaranPmlFileType INSTANCE = new AldebaranPmlFileType();

    protected AldebaranPmlFileType() {
        super(AldebaranPmlLanguage.INSTANCE);
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @NotNull
    @Override
    public String getName() {
        return "Aldebaran Project";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aldebaran Project file language, used to build robot's pkg.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AldebaranIcons.PmlFile;
    }
}
