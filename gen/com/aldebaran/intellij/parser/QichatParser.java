// This is a generated file. Not intended for manual editing.
package com.aldebaran.intellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.aldebaran.intellij.psi.QichatTypes.*;
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
    if (t == CHOICE_LIST) {
      r = choice_list(b, 0);
    }
    else if (t == CONCEPT) {
      r = concept(b, 0);
    }
    else if (t == CONCEPT_USAGE) {
      r = concept_usage(b, 0);
    }
    else if (t == HEADER) {
      r = header(b, 0);
    }
    else if (t == OPTIONAL_CHOICE_LIST) {
      r = optional_choice_list(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
    }
    else if (t == PROPOSAL) {
      r = proposal(b, 0);
    }
    else if (t == TOPIC_HEADER) {
      r = topic_header(b, 0);
    }
    else if (t == TOPIC_LANGUAGE) {
      r = topic_language(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return qichatFile(b, l + 1);
  }

  /* ********************************************************** */
  // '[' 1*((string|concept_usage) [space]) ']'
  public static boolean choice_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list")) return false;
    if (!nextTokenIs(b, BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_LEFT);
    r = r && choice_list_1(b, l + 1);
    r = r && choice_list_2(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, CHOICE_LIST, r);
    return r;
  }

  // 1*
  private static boolean choice_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "1")) break;
      if (!empty_element_parsed_guard_(b, "choice_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (string|concept_usage) [space]
  private static boolean choice_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_list_2_0(b, l + 1);
    r = r && choice_list_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string|concept_usage
  private static boolean choice_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = concept_usage(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean choice_list_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_list_2_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'concept:(' id ')' [space] string|choice_list|optional_choice_list
  public static boolean concept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<concept>");
    r = concept_0(b, l + 1);
    if (!r) r = choice_list(b, l + 1);
    if (!r) r = optional_choice_list(b, l + 1);
    exit_section_(b, l, m, CONCEPT, r, false, null);
    return r;
  }

  // 'concept:(' id ')' [space] string
  private static boolean concept_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "concept:(");
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, PAR_RIGHT);
    r = r && concept_0_3(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean concept_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_0_3")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // '~' id
  public static boolean concept_usage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_usage")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TILDE);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, CONCEPT_USAGE, r);
    return r;
  }

  /* ********************************************************** */
  // topic_header topic_language
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<header>");
    r = topic_header(b, l + 1);
    r = r && topic_language(b, l + 1);
    exit_section_(b, l, m, HEADER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' 1*((string|concept_usage) [space]) '}'
  public static boolean optional_choice_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_choice_list")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && optional_choice_list_1(b, l + 1);
    r = r && optional_choice_list_2(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, OPTIONAL_CHOICE_LIST, r);
    return r;
  }

  // 1*
  private static boolean optional_choice_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_choice_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, "1")) break;
      if (!empty_element_parsed_guard_(b, "optional_choice_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (string|concept_usage) [space]
  private static boolean optional_choice_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_choice_list_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optional_choice_list_2_0(b, l + 1);
    r = r && optional_choice_list_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string|concept_usage
  private static boolean optional_choice_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_choice_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = concept_usage(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean optional_choice_list_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_choice_list_2_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // concept|proposal
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property>");
    r = concept(b, l + 1);
    if (!r) r = proposal(b, l + 1);
    exit_section_(b, l, m, PROPERTY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'proposal:' [space] string|choice_list|optional_choice_list
  public static boolean proposal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<proposal>");
    r = proposal_0(b, l + 1);
    if (!r) r = choice_list(b, l + 1);
    if (!r) r = optional_choice_list(b, l + 1);
    exit_section_(b, l, m, PROPOSAL, r, false, null);
    return r;
  }

  // 'proposal:' [space] string
  private static boolean proposal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "proposal:");
    r = r && proposal_0_1(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // [space]
  private static boolean proposal_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proposal_0_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // header item_*
  static boolean qichatFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qichatFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header(b, l + 1);
    r = r && qichatFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // item_*
  private static boolean qichatFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qichatFile_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qichatFile_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'topic:' [space] '~' id '()'
  public static boolean topic_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<topic header>");
    r = consumeToken(b, "topic:");
    r = r && topic_header_1(b, l + 1);
    r = r && consumeToken(b, TILDE);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, "()");
    exit_section_(b, l, m, TOPIC_HEADER, r, false, null);
    return r;
  }

  // [space]
  private static boolean topic_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_header_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // 'language:' [space] top_language
  public static boolean topic_language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_language")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<topic language>");
    r = consumeToken(b, "language:");
    r = r && topic_language_1(b, l + 1);
    r = r && consumeToken(b, TOP_LANGUAGE);
    exit_section_(b, l, m, TOPIC_LANGUAGE, r, false, null);
    return r;
  }

  // [space]
  private static boolean topic_language_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topic_language_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

}
