package com.aldebaran.intellij.lang.dialogs.top;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class TopFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(TopFileType.INSTANCE);
    }
}
