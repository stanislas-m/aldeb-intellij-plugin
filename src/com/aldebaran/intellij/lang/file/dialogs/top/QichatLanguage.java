package com.aldebaran.intellij.lang.file.dialogs.top;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QichatLanguage extends Language {

    public static final Language INSTANCE = new QichatLanguage();

    protected QichatLanguage() {
        super("Qichat", "text/plain");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Qichat";
    }

    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType() {
        return TopFileType.INSTANCE;
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
