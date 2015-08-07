package com.aldebaran.intellij;

import com.aldebaran.intellij.psi.QichatTokenType;
import com.intellij.json.JsonElementTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

import static com.aldebaran.intellij.QichatTypes.*;

public class QichatParserDefinition implements ParserDefinition {

    public static final IElementType LINE_COMMENT = new QichatTokenType("QICHAT_LINE_COMMENT");

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new QichatLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new QichatParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return QichatFileElementType.INSTANCE;
    }


    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING_LITERALS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return JsonElementTypes.Factory.createElement(node);
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new QichatFile(viewProvider);
    }

    @NotNull
    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
