package com.aldebaran.intellij.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.aldebaran.QichatTypes;
import java.util.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.aldebaran.intellij.QichatParserDefinition.*;
%%


%{
  public _QichatLexer() {
    this((java.io.Reader)null);
  }
%}

%unicode
%class _QichatLexer
%implements FlexLexer, QichatTypes
%unicode
%public

%function advance
%type IElementType

%eof{
  return;
%eof}