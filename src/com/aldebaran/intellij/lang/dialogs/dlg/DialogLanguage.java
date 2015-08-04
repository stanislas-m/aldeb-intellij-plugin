package com.aldebaran.intellij.lang.dialogs.dlg;

import com.intellij.lang.Language;

public class DialogLanguage extends Language {

    public static final DialogLanguage INSTANCE = new DialogLanguage();

    protected DialogLanguage() {
        super("Aldebaran dialog", "text/plain");
    }
}
