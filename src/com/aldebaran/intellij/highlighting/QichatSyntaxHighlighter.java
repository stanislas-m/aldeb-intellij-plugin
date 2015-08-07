package com.aldebaran.intellij.highlighting;

import com.aldebaran.intellij.QichatParserDefinition;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.fileTypes.SyntaxHighlighterBase.pack;
import static com.aldebaran.intellij.highlighting.QichatSyntaxHighlightingColors.*;

public class QichatSyntaxHighlighter implements SyntaxHighlighter {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        fillMap(ATTRIBUTES, LINE_COMMENT, QichatParserDefinition.LINE_COMMENT);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new QichatLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
