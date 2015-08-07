package com.aldebaran.intellij.lang.dialogs.top;

import com.intellij.lang.Language;

public class QichatLanguage extends Language {

    public static final QichatLanguage INSTANCE = new QichatLanguage();

    protected QichatLanguage() {
        super("Aldebaran dialog topic", "text/plain");
    }
}
