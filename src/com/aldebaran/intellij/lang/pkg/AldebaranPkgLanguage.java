package com.aldebaran.intellij.lang.pkg;

import com.intellij.lang.Language;

public class AldebaranPkgLanguage extends Language {

    public static final AldebaranPkgLanguage INSTANCE = new AldebaranPkgLanguage();

    protected AldebaranPkgLanguage() {
        super("Aldebaran robot package", "application/zip");
    }
}
