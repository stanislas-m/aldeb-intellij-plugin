// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aldebaran.intellij.psi.impl.*;

public interface QichatTypes {

  IElementType CALL = new QichatElementType("CALL");
  IElementType CALL_COMMAND_PARAMETERS = new QichatElementType("CALL_COMMAND_PARAMETERS");
  IElementType CHOICE_LIST = new QichatElementType("CHOICE_LIST");
  IElementType COMMAND = new QichatElementType("COMMAND");
  IElementType COMMAND_LINE = new QichatElementType("COMMAND_LINE");
  IElementType CONCEPT = new QichatElementType("CONCEPT");
  IElementType CONCEPT_CALL = new QichatElementType("CONCEPT_CALL");
  IElementType DIALOG_DEFINITION_LINE = new QichatElementType("DIALOG_DEFINITION_LINE");
  IElementType EVENT_INPUT = new QichatElementType("EVENT_INPUT");
  IElementType GOTO_REACTIVATE = new QichatElementType("GOTO_REACTIVATE");
  IElementType HEADER = new QichatElementType("HEADER");
  IElementType INCLUDE = new QichatElementType("INCLUDE");
  IElementType LANGUAGE_HEADER = new QichatElementType("LANGUAGE_HEADER");
  IElementType METHOD_CALL = new QichatElementType("METHOD_CALL");
  IElementType NEXT_PROPOSAL = new QichatElementType("NEXT_PROPOSAL");
  IElementType OPTIONAL_ITEM = new QichatElementType("OPTIONAL_ITEM");
  IElementType PARAMETERS_LIST = new QichatElementType("PARAMETERS_LIST");
  IElementType PREVIOUS_PROPOSAL = new QichatElementType("PREVIOUS_PROPOSAL");
  IElementType PROPOSAL = new QichatElementType("PROPOSAL");
  IElementType P_CALL = new QichatElementType("P_CALL");
  IElementType SAME_PROPOSAL = new QichatElementType("SAME_PROPOSAL");
  IElementType S_CALL = new QichatElementType("S_CALL");
  IElementType TAG = new QichatElementType("TAG");
  IElementType TOPIC_HEADER = new QichatElementType("TOPIC_HEADER");
  IElementType USER_RULE = new QichatElementType("USER_RULE");
  IElementType VARIABLE = new QichatElementType("VARIABLE");

  IElementType BACKSLASH = new QichatTokenType("\\\\");
  IElementType BRACKET_LEFT = new QichatTokenType("[");
  IElementType BRACKET_RIGHT = new QichatTokenType("]");
  IElementType CALL_FUNCTION = new QichatTokenType("call");
  IElementType CIRCONFLEX = new QichatTokenType("^");
  IElementType CLASS_NAME = new QichatTokenType("class_name");
  IElementType COLON = new QichatTokenType(":");
  IElementType COMMA = new QichatTokenType(",");
  IElementType COMMENT = new QichatTokenType("comment");
  IElementType CONCEPT_KEYWORD = new QichatTokenType("concept");
  IElementType CURLY_LEFT = new QichatTokenType("{");
  IElementType CURLY_RIGHT = new QichatTokenType("}");
  IElementType DOLLAR = new QichatTokenType("$");
  IElementType DOT = new QichatTokenType(".");
  IElementType EOL = new QichatTokenType("eol");
  IElementType EQUALS = new QichatTokenType("==");
  IElementType GOTO_REACTIVATE_FUNCTION = new QichatTokenType("gotoReactivate");
  IElementType ID = new QichatTokenType("id");
  IElementType INCLUDE_KEYWORD = new QichatTokenType("include");
  IElementType LANGUAGE_KEYWORD = new QichatTokenType("language");
  IElementType METHOD_NAME = new QichatTokenType("method_name");
  IElementType NEXT_PROPOSAL_FUNCTION = new QichatTokenType("nextProposal");
  IElementType NUMBER = new QichatTokenType("number");
  IElementType OP_EQ = new QichatTokenType("=");
  IElementType PARAMETER = new QichatTokenType("parameter");
  IElementType PAR_LEFT = new QichatTokenType("(");
  IElementType PAR_RIGHT = new QichatTokenType(")");
  IElementType PATH = new QichatTokenType("path");
  IElementType PCALL_FUNCTION = new QichatTokenType("pCall");
  IElementType PERCENT = new QichatTokenType("%");
  IElementType PREVIOUS_PROPOSAL_FUNCTION = new QichatTokenType("previousProposal");
  IElementType PROPOSAL_KEYWORD = new QichatTokenType("proposal");
  IElementType QMARK = new QichatTokenType("?");
  IElementType SAME_PROPOSAL_FUNCTION = new QichatTokenType("sameProposal");
  IElementType SCALL_FUNCTION = new QichatTokenType("sCall");
  IElementType SPACE = new QichatTokenType("space");
  IElementType STRING = new QichatTokenType("string");
  IElementType TILDE = new QichatTokenType("~");
  IElementType TOPIC_KEYWORD = new QichatTokenType("topic");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CALL) {
        return new QichatCallImpl(node);
      }
      else if (type == CALL_COMMAND_PARAMETERS) {
        return new QichatCallCommandParametersImpl(node);
      }
      else if (type == CHOICE_LIST) {
        return new QichatChoiceListImpl(node);
      }
      else if (type == COMMAND) {
        return new QichatCommandImpl(node);
      }
      else if (type == COMMAND_LINE) {
        return new QichatCommandLineImpl(node);
      }
      else if (type == CONCEPT) {
        return new QichatConceptImpl(node);
      }
      else if (type == CONCEPT_CALL) {
        return new QichatConceptCallImpl(node);
      }
      else if (type == DIALOG_DEFINITION_LINE) {
        return new QichatDialogDefinitionLineImpl(node);
      }
      else if (type == EVENT_INPUT) {
        return new QichatEventInputImpl(node);
      }
      else if (type == GOTO_REACTIVATE) {
        return new QichatGotoReactivateImpl(node);
      }
      else if (type == HEADER) {
        return new QichatHeaderImpl(node);
      }
      else if (type == INCLUDE) {
        return new QichatIncludeImpl(node);
      }
      else if (type == LANGUAGE_HEADER) {
        return new QichatLanguageHeaderImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new QichatMethodCallImpl(node);
      }
      else if (type == NEXT_PROPOSAL) {
        return new QichatNextProposalImpl(node);
      }
      else if (type == OPTIONAL_ITEM) {
        return new QichatOptionalItemImpl(node);
      }
      else if (type == PARAMETERS_LIST) {
        return new QichatParametersListImpl(node);
      }
      else if (type == PREVIOUS_PROPOSAL) {
        return new QichatPreviousProposalImpl(node);
      }
      else if (type == PROPOSAL) {
        return new QichatProposalImpl(node);
      }
      else if (type == P_CALL) {
        return new QichatPCallImpl(node);
      }
      else if (type == SAME_PROPOSAL) {
        return new QichatSameProposalImpl(node);
      }
      else if (type == S_CALL) {
        return new QichatSCallImpl(node);
      }
      else if (type == TAG) {
        return new QichatTagImpl(node);
      }
      else if (type == TOPIC_HEADER) {
        return new QichatTopicHeaderImpl(node);
      }
      else if (type == USER_RULE) {
        return new QichatUserRuleImpl(node);
      }
      else if (type == VARIABLE) {
        return new QichatVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
