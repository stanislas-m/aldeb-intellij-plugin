package com.aldebaran.intellij.lang.dialogs.top;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.AldebaranIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranTopFileType extends LanguageFileType {

    public static final AldebaranTopFileType INSTANCE = new AldebaranTopFileType();

    protected AldebaranTopFileType() {
        super(AldebaranTopLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Aldebaran Dialog Topic File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aldebaran Dialog Topic File.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "top";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AldebaranIcons.TopFile;
    }
}
