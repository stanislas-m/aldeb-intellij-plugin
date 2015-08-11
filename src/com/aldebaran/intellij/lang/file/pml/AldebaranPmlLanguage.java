package com.aldebaran.intellij.lang.file.pml;

import com.intellij.lang.Language;
import com.intellij.lang.xml.XMLLanguage;

public class AldebaranPmlLanguage extends Language {

    public static final AldebaranPmlLanguage INSTANCE = new AldebaranPmlLanguage();

    protected AldebaranPmlLanguage() {
        super(XMLLanguage.INSTANCE, "Aldebaran project", "application/xml");
    }
}
