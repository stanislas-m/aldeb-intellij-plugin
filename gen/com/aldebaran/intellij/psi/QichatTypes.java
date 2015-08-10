// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aldebaran.intellij.psi.impl.*;

public interface QichatTypes {

  IElementType CHOICE_LIST = new QichatElementType("CHOICE_LIST");
  IElementType CONCEPT = new QichatElementType("CONCEPT");
  IElementType CONCEPT_USAGE = new QichatElementType("CONCEPT_USAGE");
  IElementType HEADER = new QichatElementType("HEADER");
  IElementType OPTIONAL_CHOICE_LIST = new QichatElementType("OPTIONAL_CHOICE_LIST");
  IElementType PROPERTY = new QichatElementType("PROPERTY");
  IElementType PROPOSAL = new QichatElementType("PROPOSAL");
  IElementType TOPIC_HEADER = new QichatElementType("TOPIC_HEADER");
  IElementType TOPIC_LANGUAGE = new QichatElementType("TOPIC_LANGUAGE");

  IElementType BRACKET_LEFT = new QichatTokenType("[");
  IElementType BRACKET_RIGHT = new QichatTokenType("]");
  IElementType COLON = new QichatTokenType(":");
  IElementType COMMENT = new QichatTokenType("COMMENT");
  IElementType CRLF = new QichatTokenType("CRLF");
  IElementType CURLY_LEFT = new QichatTokenType("{");
  IElementType CURLY_RIGHT = new QichatTokenType("}");
  IElementType ID = new QichatTokenType("id");
  IElementType LINE_COMMENT = new QichatTokenType("line_comment");
  IElementType OP_EQ = new QichatTokenType("=");
  IElementType PAR_LEFT = new QichatTokenType("(");
  IElementType PAR_RIGHT = new QichatTokenType(")");
  IElementType QMARK = new QichatTokenType("?");
  IElementType SPACE = new QichatTokenType("space");
  IElementType STRING = new QichatTokenType("string");
  IElementType TILDE = new QichatTokenType("~");
  IElementType TOP_LANGUAGE = new QichatTokenType("top_language");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CHOICE_LIST) {
        return new QichatChoiceListImpl(node);
      }
      else if (type == CONCEPT) {
        return new QichatConceptImpl(node);
      }
      else if (type == CONCEPT_USAGE) {
        return new QichatConceptUsageImpl(node);
      }
      else if (type == HEADER) {
        return new QichatHeaderImpl(node);
      }
      else if (type == OPTIONAL_CHOICE_LIST) {
        return new QichatOptionalChoiceListImpl(node);
      }
      else if (type == PROPERTY) {
        return new QichatPropertyImpl(node);
      }
      else if (type == PROPOSAL) {
        return new QichatProposalImpl(node);
      }
      else if (type == TOPIC_HEADER) {
        return new QichatTopicHeaderImpl(node);
      }
      else if (type == TOPIC_LANGUAGE) {
        return new QichatTopicLanguageImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
