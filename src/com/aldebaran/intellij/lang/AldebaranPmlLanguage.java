package com.aldebaran.intellij.lang;

import com.intellij.lang.Language;

public class AldebaranPmlLanguage extends Language {

    public static final AldebaranPmlLanguage INSTANCE = new AldebaranPmlLanguage();

    protected AldebaranPmlLanguage() {
        super("Aldebaran project", "application/xml");
    }
}
