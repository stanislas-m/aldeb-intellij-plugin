package com.aldebaran.intellij.lang.file.dialogs.dlg;

import com.intellij.lang.Language;

public class DialogLanguage extends Language {

    public static final DialogLanguage INSTANCE = new DialogLanguage();

    protected DialogLanguage() {
        super("Aldebaran dialog", "text/plain");
    }
}
