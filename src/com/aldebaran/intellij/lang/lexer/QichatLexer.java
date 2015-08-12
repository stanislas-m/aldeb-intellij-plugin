/* The following code was generated by JFlex 1.4.3 on 10/08/15 18:08 */

package com.aldebaran.intellij.lang.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.aldebaran.intellij.lang.psi.QichatTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/08/15 18:08 from the specification file
 * <tt>/home/smichalak/Documents/dev/aldebaran/intellij-plugin/src/com/aldebaran/intellij/lexer/Qichat.flex</tt>
 */
class QichatLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\3\1\1\1\3\22\0\1\1\2\0\1\4"+
    "\1\30\1\26\2\0\1\17\1\20\2\0\1\32\1\12\1\6\1\13"+
    "\12\5\1\14\2\0\1\25\1\0\1\16\1\0\2\11\1\51\14\11"+
    "\1\53\1\11\1\56\10\11\1\23\1\31\1\24\1\27\1\10\1\0"+
    "\1\41\1\11\1\37\1\46\1\45\1\11\1\43\1\57\1\36\2\11"+
    "\1\40\1\55\1\42\1\34\1\35\1\11\1\47\1\50\1\33\1\44"+
    "\1\52\1\11\1\54\2\11\1\21\1\0\1\22\1\15\53\0\1\7"+
    "\12\0\1\7\4\0\1\7\5\0\27\7\1\0\37\7\1\0\u01ca\7"+
    "\4\0\14\7\16\0\5\7\7\0\1\7\1\0\1\7\201\0\5\7"+
    "\1\0\2\7\2\0\4\7\10\0\1\7\1\0\3\7\1\0\1\7"+
    "\1\0\24\7\1\0\123\7\1\0\213\7\10\0\236\7\11\0\46\7"+
    "\2\0\1\7\7\0\47\7\110\0\33\7\5\0\3\7\55\0\53\7"+
    "\43\0\2\7\1\0\143\7\1\0\1\7\17\0\2\7\7\0\2\7"+
    "\12\0\3\7\2\0\1\7\20\0\1\7\1\0\36\7\35\0\131\7"+
    "\13\0\1\7\30\0\41\7\11\0\2\7\4\0\1\7\5\0\26\7"+
    "\4\0\1\7\11\0\1\7\3\0\1\7\27\0\31\7\107\0\1\7"+
    "\1\0\13\7\127\0\66\7\3\0\1\7\22\0\1\7\7\0\12\7"+
    "\17\0\7\7\1\0\7\7\5\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\1\7\3\0\4\7\3\0\1\7\20\0\1\7"+
    "\15\0\2\7\1\0\3\7\16\0\2\7\23\0\6\7\4\0\2\7"+
    "\2\0\26\7\1\0\7\7\1\0\2\7\1\0\2\7\1\0\2\7"+
    "\37\0\4\7\1\0\1\7\23\0\3\7\20\0\11\7\1\0\3\7"+
    "\1\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\3\0\1\7"+
    "\22\0\1\7\17\0\2\7\43\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\5\7\3\0\1\7\36\0\2\7"+
    "\1\0\3\7\17\0\1\7\21\0\1\7\1\0\6\7\3\0\3\7"+
    "\1\0\4\7\3\0\2\7\1\0\1\7\1\0\2\7\3\0\2\7"+
    "\3\0\3\7\3\0\14\7\26\0\1\7\64\0\10\7\1\0\3\7"+
    "\1\0\27\7\1\0\12\7\1\0\5\7\3\0\1\7\32\0\2\7"+
    "\6\0\2\7\43\0\10\7\1\0\3\7\1\0\27\7\1\0\12\7"+
    "\1\0\5\7\3\0\1\7\40\0\1\7\1\0\2\7\17\0\2\7"+
    "\22\0\10\7\1\0\3\7\1\0\51\7\2\0\1\7\20\0\1\7"+
    "\21\0\2\7\30\0\6\7\5\0\22\7\3\0\30\7\1\0\11\7"+
    "\1\0\1\7\2\0\7\7\72\0\60\7\1\0\2\7\14\0\7\7"+
    "\72\0\2\7\1\0\1\7\2\0\2\7\1\0\1\7\2\0\1\7"+
    "\6\0\4\7\1\0\7\7\1\0\3\7\1\0\1\7\1\0\1\7"+
    "\2\0\2\7\1\0\4\7\1\0\2\7\11\0\1\7\2\0\5\7"+
    "\1\0\1\7\25\0\4\7\40\0\1\7\77\0\10\7\1\0\44\7"+
    "\33\0\5\7\163\0\53\7\24\0\1\7\20\0\6\7\4\0\4\7"+
    "\3\0\1\7\3\0\2\7\7\0\3\7\4\0\15\7\14\0\1\7"+
    "\21\0\46\7\1\0\1\7\5\0\1\7\2\0\53\7\1\0\u014d\7"+
    "\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0\51\7"+
    "\1\0\4\7\2\0\41\7\1\0\4\7\2\0\7\7\1\0\1\7"+
    "\1\0\4\7\2\0\17\7\1\0\71\7\1\0\4\7\2\0\103\7"+
    "\45\0\20\7\20\0\125\7\14\0\u026c\7\2\0\21\7\1\0\32\7"+
    "\5\0\113\7\25\0\15\7\1\0\4\7\16\0\22\7\16\0\22\7"+
    "\16\0\15\7\1\0\3\7\17\0\64\7\43\0\1\7\4\0\1\7"+
    "\103\0\130\7\10\0\51\7\1\0\1\7\5\0\106\7\12\0\35\7"+
    "\63\0\36\7\2\0\5\7\13\0\54\7\25\0\7\7\70\0\27\7"+
    "\11\0\65\7\122\0\1\7\135\0\57\7\21\0\7\7\67\0\36\7"+
    "\15\0\2\7\12\0\54\7\32\0\44\7\51\0\3\7\12\0\44\7"+
    "\153\0\4\7\1\0\4\7\3\0\2\7\11\0\300\7\100\0\u0116\7"+
    "\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7\1\0\1\7"+
    "\1\0\1\7\1\0\1\7\1\0\37\7\2\0\65\7\1\0\7\7"+
    "\1\0\1\7\3\0\3\7\1\0\7\7\3\0\4\7\2\0\6\7"+
    "\4\0\15\7\5\0\3\7\1\0\7\7\164\0\1\7\15\0\1\7"+
    "\20\0\15\7\145\0\1\7\4\0\1\7\2\0\12\7\1\0\1\7"+
    "\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\0\13\7\2\0\4\7\5\0\5\7\4\0\1\7\64\0\2\7"+
    "\u0a7b\0\57\7\1\0\57\7\1\0\205\7\6\0\4\7\3\0\2\7"+
    "\14\0\46\7\1\0\1\7\5\0\1\7\2\0\70\7\7\0\1\7"+
    "\20\0\27\7\11\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\120\0\1\7"+
    "\u01d5\0\2\7\52\0\5\7\5\0\2\7\4\0\126\7\6\0\3\7"+
    "\1\0\132\7\1\0\4\7\5\0\51\7\3\0\136\7\21\0\33\7"+
    "\65\0\20\7\u0200\0\u19b6\7\112\0\u51cd\7\63\0\u048d\7\103\0\56\7"+
    "\2\0\u010d\7\3\0\20\7\12\0\2\7\24\0\57\7\20\0\31\7"+
    "\10\0\106\7\61\0\11\7\2\0\147\7\2\0\4\7\1\0\4\7"+
    "\14\0\13\7\115\0\12\7\1\0\3\7\1\0\4\7\1\0\27\7"+
    "\35\0\64\7\16\0\62\7\76\0\6\7\3\0\1\7\16\0\34\7"+
    "\12\0\27\7\31\0\35\7\7\0\57\7\34\0\1\7\60\0\51\7"+
    "\27\0\3\7\1\0\10\7\24\0\27\7\3\0\1\7\5\0\60\7"+
    "\1\0\1\7\3\0\2\7\2\0\5\7\2\0\1\7\1\0\1\7"+
    "\30\0\3\7\2\0\13\7\7\0\3\7\14\0\6\7\2\0\6\7"+
    "\2\0\6\7\11\0\7\7\1\0\7\7\221\0\43\7\35\0\u2ba4\7"+
    "\14\0\27\7\4\0\61\7\u2104\0\u016e\7\2\0\152\7\46\0\7\7"+
    "\14\0\5\7\5\0\1\7\1\0\12\7\1\0\15\7\1\0\5\7"+
    "\1\0\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0\u016b\7"+
    "\22\0\100\7\2\0\66\7\50\0\14\7\164\0\5\7\1\0\207\7"+
    "\44\0\32\7\6\0\32\7\13\0\131\7\3\0\6\7\2\0\6\7"+
    "\2\0\6\7\2\0\3\7\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\1"+
    "\1\26\11\7\1\5\1\27\1\30\47\7\1\31\7\7"+
    "\1\32\3\7\1\33\10\7\1\34\12\7\1\35\5\7"+
    "\1\36\1\37\7\7\1\40\2\7\1\41\4\7\1\42"+
    "\7\7\1\43\10\7\1\44\1\7\1\45\1\7\1\46"+
    "\3\7\1\47\1\7\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\60\0\220\0\300\0\360\0\u0120"+
    "\0\360\0\u0150\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\u0180\0\60\0\60\0\60\0\u01b0"+
    "\0\60\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300"+
    "\0\u0330\0\u0360\0\u0390\0\60\0\60\0\u03c0\0\u03f0\0\u0420"+
    "\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0"+
    "\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20"+
    "\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0150\0\u0b10\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0150\0\u0c60\0\u0c90\0\u0cc0"+
    "\0\u0150\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10"+
    "\0\u0e40\0\u0150\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u0150\0\u1050\0\u1080\0\u10b0"+
    "\0\u10e0\0\u1110\0\u0150\0\u0150\0\u1140\0\u1170\0\u11a0\0\u11d0"+
    "\0\u1200\0\u1230\0\u1260\0\u0150\0\u1290\0\u12c0\0\u0150\0\u12f0"+
    "\0\u1320\0\u1350\0\u1380\0\u0150\0\u13b0\0\u13e0\0\u1410\0\u1440"+
    "\0\u1470\0\u14a0\0\u14d0\0\u0150\0\u1500\0\u1530\0\u1560\0\u1590"+
    "\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u0150\0\u1680\0\u0150\0\u16b0"+
    "\0\u0150\0\u16e0\0\u1710\0\u1740\0\u0150\0\u1770\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\2\11\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\12\1\33\1\34\1\35\1\36\1\12"+
    "\1\37\1\40\4\12\1\41\4\12\1\42\2\12\61\0"+
    "\2\3\55\0\2\5\1\0\55\5\5\0\1\6\1\43"+
    "\1\0\4\11\17\0\25\11\5\0\2\11\1\0\4\11"+
    "\17\0\25\11\5\0\1\10\2\0\3\10\20\0\25\10"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\25\12"+
    "\25\0\1\44\63\0\1\45\33\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\1\12\1\46\23\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\6\12\1\47\5\12"+
    "\1\50\1\12\1\51\6\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\7\12\1\52\15\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\1\12\1\53\3\12"+
    "\1\54\1\55\16\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\6\12\1\56\16\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\12\12\1\57\12\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\1\12\1\60"+
    "\23\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\1\61\5\12\1\62\7\12\1\63\6\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\12\12\1\64\12\12"+
    "\5\0\1\43\1\11\1\0\4\11\17\0\25\11\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\2\12\1\65"+
    "\22\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\14\12\1\66\10\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\1\12\1\67\10\12\1\70\12\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\6\12\1\71"+
    "\16\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\4\12\1\72\20\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\7\12\1\73\15\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\6\12\1\74\16\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\5\12\1\75"+
    "\17\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\7\12\1\76\15\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\21\12\1\77\3\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\1\100\24\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\14\12\1\101\10\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\22\12"+
    "\1\102\2\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\6\12\1\103\16\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\1\104\24\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\3\12\1\105\21\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\6\12\1\106"+
    "\16\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\2\12\1\107\22\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\17\12\1\110\5\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\5\12\1\111\17\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\5\12\1\112"+
    "\17\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\4\12\1\113\20\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\15\12\1\114\7\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\5\12\1\115\17\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\10\12\1\116"+
    "\14\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\1\117\24\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\1\12\1\120\23\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\3\12\1\121\21\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\12\12\1\122\12\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\5\12"+
    "\1\123\17\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\24\12\1\124\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\4\12\1\125\20\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\22\12\1\126\2\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\1\12\1\127"+
    "\23\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\3\12\1\130\21\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\5\12\1\131\17\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\11\12\1\132\13\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\12\12\1\133"+
    "\12\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\15\12\1\134\7\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\11\12\1\135\13\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\20\12\1\136\4\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\23\12\1\137"+
    "\1\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\7\12\1\140\15\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\20\12\1\141\4\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\5\12\1\142\17\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\1\12\1\143"+
    "\23\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\12\12\1\144\12\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\15\12\1\145\7\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\1\12\1\146\23\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\13\12\1\147"+
    "\11\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\2\12\1\150\22\12\5\0\1\12\1\11\1\0\1\151"+
    "\2\12\1\11\17\0\25\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\6\12\1\152\16\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\14\12\1\153\10\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\12\12"+
    "\1\154\12\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\10\12\1\155\14\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\14\12\1\156\10\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\13\12\1\157\11\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\1\160"+
    "\24\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\6\12\1\161\16\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\11\12\1\162\13\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\12\12\1\163\12\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\1\164\24\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\7\12"+
    "\1\165\15\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\10\12\1\166\14\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\1\12\1\167\23\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\6\12\1\170\16\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\1\12"+
    "\1\171\23\12\5\0\1\12\1\11\1\0\1\172\2\12"+
    "\1\11\17\0\25\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\12\12\1\173\12\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\5\12\1\174\17\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\15\12\1\175"+
    "\7\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\6\12\1\176\16\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\12\12\1\177\12\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\2\12\1\200\22\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\4\12\1\201"+
    "\20\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\2\12\1\202\22\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\7\12\1\203\15\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\14\12\1\204\10\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\20\12\1\205"+
    "\4\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\22\12\1\206\2\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\1\12\1\207\23\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\1\210\24\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\1\12\1\211\23\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\6\12"+
    "\1\212\16\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\14\12\1\213\10\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\12\12\1\214\12\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\15\12\1\215\7\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\3\12"+
    "\1\216\21\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\15\12\1\217\7\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\22\12\1\220\2\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\1\12\1\221\23\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\6\12"+
    "\1\222\16\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\17\12\1\223\5\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\6\12\1\224\16\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\12\12\1\225\12\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\2\12"+
    "\1\226\22\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\5\12\1\227\17\12\5\0\1\12\1\11\1\0"+
    "\3\12\1\11\17\0\6\12\1\230\16\12\5\0\1\12"+
    "\1\11\1\0\3\12\1\11\17\0\5\12\1\231\17\12"+
    "\5\0\1\12\1\11\1\0\3\12\1\11\17\0\1\12"+
    "\1\232\23\12\5\0\1\12\1\11\1\0\3\12\1\11"+
    "\17\0\1\233\24\12\5\0\1\12\1\11\1\0\3\12"+
    "\1\11\17\0\15\12\1\234\7\12\5\0\1\12\1\11"+
    "\1\0\3\12\1\11\17\0\12\12\1\235\12\12\5\0"+
    "\1\12\1\11\1\0\3\12\1\11\17\0\6\12\1\236"+
    "\16\12\5\0\1\12\1\11\1\0\3\12\1\11\17\0"+
    "\5\12\1\237\17\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6048];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\6\1\11\11\1\1\3\11"+
    "\1\1\1\11\12\1\2\11\172\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  QichatLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1610) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 21: 
          { return DOLLAR;
          }
        case 41: break;
        case 30: 
          { return INCLUDE_KEYWORD;
          }
        case 42: break;
        case 28: 
          { return SCALL_FUNCTION;
          }
        case 43: break;
        case 10: 
          { return TILDE;
          }
        case 44: break;
        case 8: 
          { return PATH;
          }
        case 45: break;
        case 26: 
          { return TOPIC_KEYWORD;
          }
        case 46: break;
        case 25: 
          { return CALL_FUNCTION;
          }
        case 47: break;
        case 24: 
          { return BACKSLASH;
          }
        case 48: break;
        case 34: 
          { return PARAMETER;
          }
        case 49: break;
        case 27: 
          { return PCALL_FUNCTION;
          }
        case 50: break;
        case 15: 
          { return CURLY_RIGHT;
          }
        case 51: break;
        case 3: 
          { return SPACE;
          }
        case 52: break;
        case 5: 
          { return NUMBER;
          }
        case 53: break;
        case 31: 
          { return CONCEPT_KEYWORD;
          }
        case 54: break;
        case 11: 
          { return QMARK;
          }
        case 55: break;
        case 22: 
          { return COMMA;
          }
        case 56: break;
        case 18: 
          { return OP_EQ;
          }
        case 57: break;
        case 6: 
          { return DOT;
          }
        case 58: break;
        case 4: 
          { return COMMENT;
          }
        case 59: break;
        case 13: 
          { return PAR_RIGHT;
          }
        case 60: break;
        case 39: 
          { return GOTO_REACTIVATE_FUNCTION;
          }
        case 61: break;
        case 37: 
          { return NEXT_PROPOSAL_FUNCTION;
          }
        case 62: break;
        case 9: 
          { return COLON;
          }
        case 63: break;
        case 23: 
          { return EQUALS;
          }
        case 64: break;
        case 40: 
          { return PREVIOUS_PROPOSAL_FUNCTION;
          }
        case 65: break;
        case 14: 
          { return CURLY_LEFT;
          }
        case 66: break;
        case 16: 
          { return BRACKET_LEFT;
          }
        case 67: break;
        case 32: 
          { return PROPOSAL_KEYWORD;
          }
        case 68: break;
        case 33: 
          { return LANGUAGE_KEYWORD;
          }
        case 69: break;
        case 17: 
          { return BRACKET_RIGHT;
          }
        case 70: break;
        case 7: 
          { return ID;
          }
        case 71: break;
        case 19: 
          { return PERCENT;
          }
        case 72: break;
        case 36: 
          { return METHOD_NAME;
          }
        case 73: break;
        case 12: 
          { return PAR_LEFT;
          }
        case 74: break;
        case 35: 
          { return CLASS_NAME;
          }
        case 75: break;
        case 20: 
          { return CIRCONFLEX;
          }
        case 76: break;
        case 29: 
          { return STRING;
          }
        case 77: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 78: break;
        case 38: 
          { return SAME_PROPOSAL_FUNCTION;
          }
        case 79: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 80: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}