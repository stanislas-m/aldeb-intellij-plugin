package com.aldebaran.intellij.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class QichatLexerAdapter extends FlexAdapter {
    public QichatLexerAdapter() {
        super(new QichatLexer((Reader) null));
    }
}
