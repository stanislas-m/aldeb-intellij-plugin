package com.aldebaran.intellij.lang.highlighting;

import com.aldebaran.intellij.lang.lexer.QichatLexerAdapter;
import com.aldebaran.intellij.lang.psi.QichatTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class QichatSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COMMENT = createTextAttributesKey("QICHAT_COMMENT", SyntaxHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("QICHAT_STRING", SyntaxHighlighterColors.STRING);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("QICHAT_KEYWORD", SyntaxHighlighterColors.KEYWORD);
    public static final TextAttributesKey TAG = createTextAttributesKey("QICHAT_TAG", SyntaxHighlighterColors.NUMBER);

    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("QICHAT_BAD_CHARACTER",
            new TextAttributes(Color.RED, null, null, null, Font.BOLD));

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] TAG_KEYS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new QichatLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(QichatTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(QichatTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(QichatTypes.TOPIC_KEYWORD) || tokenType.equals(QichatTypes.LANGUAGE_KEYWORD)
                || tokenType.equals(QichatTypes.INCLUDE_KEYWORD) || tokenType.equals(QichatTypes.CONCEPT_KEYWORD)
                || tokenType.equals(QichatTypes.PROPOSAL_KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(QichatTypes.TAG)) {
            return TAG_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
