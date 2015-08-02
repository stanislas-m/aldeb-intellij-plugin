package com.aldebaran.intellij.lang.xar;

import com.intellij.lang.Language;

public class AldebaranXarLanguage extends Language {

    public static final AldebaranXarLanguage INSTANCE = new AldebaranXarLanguage();

    protected AldebaranXarLanguage() {
        super("Aldebaran behavior", "application/xml");
    }
}
