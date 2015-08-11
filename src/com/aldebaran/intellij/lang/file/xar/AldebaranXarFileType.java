package com.aldebaran.intellij.lang.file.xar;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.AldebaranIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranXarFileType extends LanguageFileType {

    public static final AldebaranXarFileType INSTANCE = new AldebaranXarFileType();

    protected AldebaranXarFileType() {
        super(AldebaranXarLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Aldebaran Behavior File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aldebaran Behavior File.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "xar";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AldebaranIcons.XarFile;
    }
}
