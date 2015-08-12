package com.aldebaran.intellij.lang.file.xar;

import com.intellij.lang.Language;
import com.intellij.lang.xml.XMLLanguage;

public class AldebaranXarLanguage extends Language {

    public static final AldebaranXarLanguage INSTANCE = new AldebaranXarLanguage();

    protected AldebaranXarLanguage() {
        super(XMLLanguage.INSTANCE, "Aldebaran behavior", "application/xml");
    }
}
