package com.aldebaran.intellij.lang.dialogs.dlg;

import com.intellij.lang.Language;

public class AldebaranDlgLanguage extends Language {

    public static final AldebaranDlgLanguage INSTANCE = new AldebaranDlgLanguage();

    protected AldebaranDlgLanguage() {
        super("Aldebaran dialog", "text/plain");
    }
}
