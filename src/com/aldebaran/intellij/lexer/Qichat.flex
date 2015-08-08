package com.aldebaran.intellij.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.aldebaran.intellij.psi.QichatTypes.*;

%%

%class QichatLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

SPACE=[ \t\n\x0B\f\r]+
LINE_COMMENT=#.*
TOP_LANGUAGE=frf|enu|jpg|esp
ID=([a-zA-Z_0-9]|-|_)+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return com.intellij.psi.TokenType.WHITE_SPACE; }

  ":"                 { return COLON; }
  "~"                 { return TILDE; }
  "?"                 { return QMARK; }
  "("                 { return PAR_LEFT; }
  ")"                 { return PAR_RIGHT; }
  "{"                 { return CURLY_LEFT; }
  "}"                 { return CURLY_RIGHT; }
  "["                 { return BRACKET_LEFT; }
  "]"                 { return BRACKET_RIGHT; }
  "="                 { return OP_EQ; }
  "COMMENT"           { return COMMENT; }
  "CRLF"              { return CRLF; }

  {SPACE}             { return SPACE; }
  {LINE_COMMENT}      { return LINE_COMMENT; }
  {TOP_LANGUAGE}      { return TOP_LANGUAGE; }
  {ID}                { return ID; }
  {STRING}            { return STRING; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}