package com.aldebaran.intellij.importing;

import com.intellij.openapi.extensions.ExtensionPointName;

public abstract class AldebaranImporter {
    public static ExtensionPointName<AldebaranImporter> EXTENSION_POINT_NAME = ExtensionPointName.create("com.aldebaran.intellij.importer");
}
