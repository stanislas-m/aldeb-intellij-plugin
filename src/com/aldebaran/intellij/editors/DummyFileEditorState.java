package com.aldebaran.intellij.editors;

import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;

class DummyFileEditorState implements FileEditorState {
    public static final FileEditorState DUMMY = new DummyFileEditorState();

    public boolean canBeMergedWith(FileEditorState otherState, FileEditorStateLevel level) {
        return false;
    }
}
