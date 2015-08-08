package com.aldebaran.intellij.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class QichatLexerAdapter extends FlexAdapter {
    public QichatLexerAdapter() {
        super(new QichatLexer((Reader) null));
    }
}
