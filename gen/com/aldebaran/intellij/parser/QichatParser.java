// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.aldebaran.intellij.lang.psi.QichatTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class QichatParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CALL) {
      r = call(b, 0);
    }
    else if (t == CALL_COMMAND_PARAMETERS) {
      r = call_command_parameters(b, 0);
    }
    else if (t == CHOICE_LIST) {
      r = choice_list(b, 0);
    }
    else if (t == COMMAND) {
      r = command(b, 0);
    }
    else if (t == COMMAND_LINE) {
      r = command_line(b, 0);
    }
    else if (t == CONCEPT) {
      r = concept(b, 0);
    }
    else if (t == CONCEPT_CALL) {
      r = concept_call(b, 0);
    }
    else if (t == DIALOG_DEFINITION_LINE) {
      r = dialog_definition_line(b, 0);
    }
    else if (t == EVENT_INPUT) {
      r = event_input(b, 0);
    }
    else if (t == GOTO_REACTIVATE) {
      r = gotoReactivate(b, 0);
    }
    else if (t == HEADER) {
      r = header(b, 0);
    }
    else if (t == INCLUDE) {
      r = include(b, 0);
    }
    else if (t == LANGUAGE_HEADER) {
      r = language_header(b, 0);
    }
    else if (t == METHOD_CALL) {
      r = method_call(b, 0);
    }
    else if (t == NEXT_PROPOSAL) {
      r = nextProposal(b, 0);
    }
    else if (t == OPTIONAL_ITEM) {
      r = optional_item(b, 0);
    }
    else if (t == P_CALL) {
      r = pCall(b, 0);
    }
    else if (t == PARAMETERS_LIST) {
      r = parameters_list(b, 0);
    }
    else if (t == PREVIOUS_PROPOSAL) {
      r = previousProposal(b, 0);
    }
    else if (t == PROPOSAL) {
      r = proposal(b, 0);
    }
    else if (t == S_CALL) {
      r = sCall(b, 0);
    }
    else if (t == SAME_PROPOSAL) {
      r = sameProposal(b, 0);
    }
    else if (t == TAG) {
      r = tag(b, 0);
    }
    else if (t == TOPIC_HEADER) {
      r = topic_header(b, 0);
    }
    else if (t == USER_RULE) {
      r = user_rule(b, 0);
    }
    else if (t == VARIABLE) {
      r = variable(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // 'call' call_command_parameters
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    if (!nextTokenIs(b, CALL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALL_FUNCTION);
    r = r && call_command_parameters(b, l + 1);
    exit_section_(b, m, CALL, r);
    return r;
  }

  /* ********************************************************** */
  // '(' method_call ')'
  public static boolean call_command_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_command_parameters")) return false;
    if (!nextTokenIs(b, PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && method_call(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, CALL_COMMAND_PARAMETERS, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ((string|optional_item|concept_call) [space])+ ']'
  public static boolean choice_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list")) return false;
    if (!nextTokenIs(b, BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_LEFT);
    r = r && choice_list_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, CHOICE_LIST, r);
    return r;
  }

  // ((string|optional_item|concept_call) [space])+
  private static boolean choice_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_list_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!choice_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_list_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (string|optional_item|concept_call) [space]
  private static boolean choice_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_list_1_0_0(b, l + 1);
    r = r && choice_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string|optional_item|concept_call
  private static boolean choice_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = optional_item(b, l + 1);
    if (!r) r = concept_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean choice_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_1_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // pCall|sCall|call|previousProposal|nextProposal|sameProposal|gotoReactivate
  public static boolean command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<command>");
    r = pCall(b, l + 1);
    if (!r) r = sCall(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = previousProposal(b, l + 1);
    if (!r) r = nextProposal(b, l + 1);
    if (!r) r = sameProposal(b, l + 1);
    if (!r) r = gotoReactivate(b, l + 1);
    exit_section_(b, l, m, COMMAND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '^' command
  public static boolean command_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line")) return false;
    if (!nextTokenIs(b, CIRCONFLEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CIRCONFLEX);
    r = r && command(b, l + 1);
    exit_section_(b, m, COMMAND_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // 'concept' ':' '(' id ')'[space] ((string|choice_list|optional_item|concept_call)[space])+ eol
  public static boolean concept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept")) return false;
    if (!nextTokenIs(b, CONCEPT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCEPT_KEYWORD);
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, PAR_RIGHT);
    r = r && concept_5(b, l + 1);
    r = r && concept_6(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, CONCEPT, r);
    return r;
  }

  // [space]
  private static boolean concept_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_5")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // ((string|choice_list|optional_item|concept_call)[space])+
  private static boolean concept_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concept_6_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!concept_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "concept_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (string|choice_list|optional_item|concept_call)[space]
  private static boolean concept_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concept_6_0_0(b, l + 1);
    r = r && concept_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string|choice_list|optional_item|concept_call
  private static boolean concept_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = choice_list(b, l + 1);
    if (!r) r = optional_item(b, l + 1);
    if (!r) r = concept_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean concept_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_6_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // '~' id
  public static boolean concept_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_call")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TILDE);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, CONCEPT_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // concept|proposal|user_rule
  public static boolean dialog_definition_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dialog_definition_line")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<dialog definition line>");
    r = concept(b, l + 1);
    if (!r) r = proposal(b, l + 1);
    if (!r) r = user_rule(b, l + 1);
    exit_section_(b, l, m, DIALOG_DEFINITION_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'e' ':' id
  public static boolean event_input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_input")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<event input>");
    r = consumeToken(b, "e");
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, ID);
    exit_section_(b, l, m, EVENT_INPUT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'gotoReactivate' '(' id ')'
  public static boolean gotoReactivate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gotoReactivate")) return false;
    if (!nextTokenIs(b, GOTO_REACTIVATE_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GOTO_REACTIVATE_FUNCTION);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, GOTO_REACTIVATE, r);
    return r;
  }

  /* ********************************************************** */
  // topic_header language_header
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, TOPIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = topic_header(b, l + 1);
    r = r && language_header(b, l + 1);
    exit_section_(b, m, HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' ':' [space] path eol
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, INCLUDE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE_KEYWORD);
    r = r && consumeToken(b, COLON);
    r = r && include_2(b, l + 1);
    r = r && consumeTokens(b, 0, PATH, EOL);
    exit_section_(b, m, INCLUDE, r);
    return r;
  }

  // [space]
  private static boolean include_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'language' ':' [space] language_header_language eol
  public static boolean language_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "language_header")) return false;
    if (!nextTokenIs(b, LANGUAGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGUAGE_KEYWORD);
    r = r && consumeToken(b, COLON);
    r = r && language_header_2(b, l + 1);
    r = r && language_header_language(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, LANGUAGE_HEADER, r);
    return r;
  }

  // [space]
  private static boolean language_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "language_header_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'frf'|'enu'|'jpj'|'esp'
  static boolean language_header_language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "language_header_language")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "frf");
    if (!r) r = consumeToken(b, "enu");
    if (!r) r = consumeToken(b, "jpj");
    if (!r) r = consumeToken(b, "esp");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_name '.' method_name '(' parameters_list ')'
  public static boolean method_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call")) return false;
    if (!nextTokenIs(b, CLASS_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS_NAME);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, METHOD_NAME);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && parameters_list(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // 'nextProposal'
  public static boolean nextProposal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nextProposal")) return false;
    if (!nextTokenIs(b, NEXT_PROPOSAL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEXT_PROPOSAL_FUNCTION);
    exit_section_(b, m, NEXT_PROPOSAL, r);
    return r;
  }

  /* ********************************************************** */
  // '{' ((string|choice_list|concept_call) [space])+ '}'
  public static boolean optional_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_item")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && optional_item_1(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, OPTIONAL_ITEM, r);
    return r;
  }

  // ((string|choice_list|concept_call) [space])+
  private static boolean optional_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optional_item_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!optional_item_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optional_item_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (string|choice_list|concept_call) [space]
  private static boolean optional_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optional_item_1_0_0(b, l + 1);
    r = r && optional_item_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string|choice_list|concept_call
  private static boolean optional_item_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_item_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = choice_list(b, l + 1);
    if (!r) r = concept_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean optional_item_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_item_1_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'pCall' call_command_parameters
  public static boolean pCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pCall")) return false;
    if (!nextTokenIs(b, PCALL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PCALL_FUNCTION);
    r = r && call_command_parameters(b, l + 1);
    exit_section_(b, m, P_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // parameter|parameter ',' [space] parameters_list
  public static boolean parameters_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_list")) return false;
    if (!nextTokenIs(b, PARAMETER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER);
    if (!r) r = parameters_list_1(b, l + 1);
    exit_section_(b, m, PARAMETERS_LIST, r);
    return r;
  }

  // parameter ',' [space] parameters_list
  private static boolean parameters_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER);
    r = r && consumeToken(b, COMMA);
    r = r && parameters_list_1_2(b, l + 1);
    r = r && parameters_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean parameters_list_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_list_1_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'previousProposal'
  public static boolean previousProposal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "previousProposal")) return false;
    if (!nextTokenIs(b, PREVIOUS_PROPOSAL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PREVIOUS_PROPOSAL_FUNCTION);
    exit_section_(b, m, PREVIOUS_PROPOSAL, r);
    return r;
  }

  /* ********************************************************** */
  // 'proposal' ':' ((tag|string|choice_list|optional_item|concept_call)[space])+ eol
  public static boolean proposal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal")) return false;
    if (!nextTokenIs(b, PROPOSAL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROPOSAL_KEYWORD);
    r = r && consumeToken(b, COLON);
    r = r && proposal_2(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, PROPOSAL, r);
    return r;
  }

  // ((tag|string|choice_list|optional_item|concept_call)[space])+
  private static boolean proposal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = proposal_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!proposal_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "proposal_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (tag|string|choice_list|optional_item|concept_call)[space]
  private static boolean proposal_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = proposal_2_0_0(b, l + 1);
    r = r && proposal_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tag|string|choice_list|optional_item|concept_call
  private static boolean proposal_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = choice_list(b, l + 1);
    if (!r) r = optional_item(b, l + 1);
    if (!r) r = concept_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean proposal_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_2_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // root_item
  static boolean root(PsiBuilder b, int l) {
    return root_item(b, l + 1);
  }

  /* ********************************************************** */
  // !<<eof>> header (include|eol)* (dialog_definition_line|eol)*
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    if (!nextTokenIs(b, TOPIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_item_0(b, l + 1);
    r = r && header(b, l + 1);
    r = r && root_item_2(b, l + 1);
    r = r && root_item_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // (include|eol)*
  private static boolean root_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_item_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_item_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // include|eol
  private static boolean root_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include(b, l + 1);
    if (!r) r = consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dialog_definition_line|eol)*
  private static boolean root_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_item_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_item_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // dialog_definition_line|eol
  private static boolean root_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dialog_definition_line(b, l + 1);
    if (!r) r = consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'sCall' call_command_parameters
  public static boolean sCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sCall")) return false;
    if (!nextTokenIs(b, SCALL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCALL_FUNCTION);
    r = r && call_command_parameters(b, l + 1);
    exit_section_(b, m, S_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // 'sameProposal'
  public static boolean sameProposal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sameProposal")) return false;
    if (!nextTokenIs(b, SAME_PROPOSAL_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAME_PROPOSAL_FUNCTION);
    exit_section_(b, m, SAME_PROPOSAL, r);
    return r;
  }

  /* ********************************************************** */
  // '%' id [space]
  public static boolean tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag")) return false;
    if (!nextTokenIs(b, PERCENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERCENT);
    r = r && consumeToken(b, ID);
    r = r && tag_2(b, l + 1);
    exit_section_(b, m, TAG, r);
    return r;
  }

  // [space]
  private static boolean tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'topic' ':' [space] '~' id '()' eol
  public static boolean topic_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_header")) return false;
    if (!nextTokenIs(b, TOPIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOPIC_KEYWORD);
    r = r && consumeToken(b, COLON);
    r = r && topic_header_2(b, l + 1);
    r = r && consumeToken(b, TILDE);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, "()");
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, TOPIC_HEADER, r);
    return r;
  }

  // [space]
  private static boolean topic_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_header_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'u' ':' '(' event_input ')' [eol] (space)+ ((command_line [space])+ eol)+
  public static boolean user_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<user rule>");
    r = consumeToken(b, "u");
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && event_input(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    r = r && user_rule_5(b, l + 1);
    r = r && user_rule_6(b, l + 1);
    r = r && user_rule_7(b, l + 1);
    exit_section_(b, l, m, USER_RULE, r, false, null);
    return r;
  }

  // [eol]
  private static boolean user_rule_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_5")) return false;
    consumeToken(b, EOL);
    return true;
  }

  // (space)+
  private static boolean user_rule_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "user_rule_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ((command_line [space])+ eol)+
  private static boolean user_rule_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_rule_7_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!user_rule_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "user_rule_7", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (command_line [space])+ eol
  private static boolean user_rule_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_rule_7_0_0(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (command_line [space])+
  private static boolean user_rule_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_7_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_rule_7_0_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!user_rule_7_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "user_rule_7_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // command_line [space]
  private static boolean user_rule_7_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_7_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_line(b, l + 1);
    r = r && user_rule_7_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean user_rule_7_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_rule_7_0_0_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // '$' id [space]
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    r = r && consumeToken(b, ID);
    r = r && variable_2(b, l + 1);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // [space]
  private static boolean variable_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

}
