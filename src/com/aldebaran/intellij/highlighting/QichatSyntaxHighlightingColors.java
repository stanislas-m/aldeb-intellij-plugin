package com.aldebaran.intellij.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class QichatSyntaxHighlightingColors {
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("QICHAT_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
}
