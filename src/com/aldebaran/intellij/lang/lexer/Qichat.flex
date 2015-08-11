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


LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

EOL=\n
SPACE=[ \t\n\x0B\f\r]
COMMENT=#.*
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:]([a-zA-Z_0-9]|_|-)*
PATH=([a-zA-Z_0-9]|_|-|"/"|\.)+

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "."                     { return DOT; }
  ":"                     { return COLON; }
  "~"                     { return TILDE; }
  "?"                     { return QMARK; }
  "("                     { return PAR_LEFT; }
  ")"                     { return PAR_RIGHT; }
  "{"                     { return CURLY_LEFT; }
  "}"                     { return CURLY_RIGHT; }
  "["                     { return BRACKET_LEFT; }
  "]"                     { return BRACKET_RIGHT; }
  "="                     { return OP_EQ; }
  "%"                     { return PERCENT; }
  "^"                     { return CIRCONFLEX; }
  "$"                     { return DOLLAR; }
  "\\\\"                  { return BACKSLASH; }
  "=="                    { return EQUALS; }
  ","                     { return COMMA; }
  "topic"                 { return TOPIC_KEYWORD; }
  "language"              { return LANGUAGE_KEYWORD; }
  "include"               { return INCLUDE_KEYWORD; }
  "concept"               { return CONCEPT_KEYWORD; }
  "proposal"              { return PROPOSAL_KEYWORD; }
  "pCall"                 { return PCALL_FUNCTION; }
  "sCall"                 { return SCALL_FUNCTION; }
  "call"                  { return CALL_FUNCTION; }
  "previousProposal"      { return PREVIOUS_PROPOSAL_FUNCTION; }
  "nextProposal"          { return NEXT_PROPOSAL_FUNCTION; }
  "sameProposal"          { return SAME_PROPOSAL_FUNCTION; }
  "gotoReactivate"        { return GOTO_REACTIVATE_FUNCTION; }
  "string"                { return STRING; }
  "class_name"            { return CLASS_NAME; }
  "method_name"           { return METHOD_NAME; }
  "parameter"             { return PARAMETER; }

  {EOL}                   { return EOL; }
  {SPACE}                 { return SPACE; }
  {COMMENT}               { return COMMENT; }
  {NUMBER}                { return NUMBER; }
  {ID}                    { return ID; }
  {PATH}                  { return PATH; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}