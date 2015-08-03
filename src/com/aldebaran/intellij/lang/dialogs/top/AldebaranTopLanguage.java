package com.aldebaran.intellij.lang.dialogs.top;

import com.intellij.lang.Language;

public class AldebaranTopLanguage extends Language {

    public static final AldebaranTopLanguage INSTANCE = new AldebaranTopLanguage();

    protected AldebaranTopLanguage() {
        super("Aldebaran dialog topic", "text/plain");
    }
}
