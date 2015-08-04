package com.aldebaran.intellij.lang.dialogs.dlg;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class DlgFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(DialogFileType.INSTANCE);
    }
}
