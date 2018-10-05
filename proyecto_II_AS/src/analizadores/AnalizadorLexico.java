/* The following code was generated by JFlex 1.5.0-SNAPSHOT */


/* --------------------------Codigo de Usuario----------------------- */
package analizadores;

import java_cup.runtime.*;
import java.io.Reader;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>alexico.flex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

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
    "\11\0\1\1\1\34\2\0\1\1\22\0\1\1\1\10\1\32\2\0"+
    "\1\5\1\11\1\0\1\51\1\33\1\5\1\4\1\52\1\13\1\14"+
    "\1\5\1\17\11\3\1\0\1\43\1\6\1\7\1\6\2\0\1\22"+
    "\1\23\1\24\1\24\1\15\1\24\1\73\1\2\1\67\2\2\1\70"+
    "\1\65\1\71\1\2\1\61\1\2\1\66\1\74\4\2\1\20\2\2"+
    "\1\44\1\35\1\45\1\0\1\2\1\0\1\25\1\26\1\27\1\30"+
    "\1\16\1\31\1\62\1\57\1\50\1\2\1\60\1\41\1\54\1\53"+
    "\1\47\1\55\1\2\1\37\1\42\1\36\1\40\1\46\1\56\1\21"+
    "\1\72\1\2\1\63\1\12\1\64\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\6\2\0"+
    "\1\7\1\10\1\2\1\0\4\2\1\0\1\11\3\2"+
    "\1\12\1\13\1\14\2\2\1\15\1\16\3\2\1\17"+
    "\1\20\5\2\1\21\1\0\2\2\1\22\5\2\1\23"+
    "\1\0\3\2\1\24\1\2\1\25\2\2\1\26\3\2"+
    "\1\27\5\2\1\21\6\2\1\30\1\23\4\2\1\31"+
    "\6\2\1\32\2\2\1\21\1\2\1\33\1\2\1\34"+
    "\2\2\1\35\2\2\1\36\2\2\1\37\10\2\1\40"+
    "\1\41\5\2\1\42\1\43\7\2\1\44\1\45\1\46"+
    "\2\2\1\47\5\2\1\50\5\2\1\51\1\52\3\2"+
    "\1\53\1\54\1\55\2\2\1\56\1\2\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
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
    "\0\0\0\75\0\172\0\267\0\75\0\364\0\364\0\364"+
    "\0\u0131\0\u016e\0\u01ab\0\75\0\u01e8\0\u0225\0\u0262\0\u029f"+
    "\0\u02dc\0\u0319\0\u0356\0\75\0\u0393\0\u03d0\0\u040d\0\75"+
    "\0\u044a\0\75\0\u0487\0\u04c4\0\u0501\0\75\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\75\0\u0632\0\u066f\0\u06ac\0\u06e9\0\u0726"+
    "\0\u0763\0\u07a0\0\u07dd\0\u081a\0\u0857\0\u0894\0\u08d1\0\u090e"+
    "\0\u094b\0\u0988\0\75\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\75"+
    "\0\u0ab9\0\172\0\u0af6\0\u0b33\0\75\0\u0b70\0\u0bad\0\u0bea"+
    "\0\75\0\u0c27\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58\0\u0d95"+
    "\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\u0ec6\0\172\0\u0356\0\u0f03"+
    "\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7\0\u1034\0\u1071\0\u10ae\0\u10eb"+
    "\0\u1128\0\u1165\0\u11a2\0\u11df\0\u121c\0\u1259\0\u1296\0\172"+
    "\0\u12d3\0\172\0\u1310\0\u134d\0\172\0\u138a\0\u13c7\0\172"+
    "\0\u1404\0\u1441\0\172\0\u147e\0\u14bb\0\u14f8\0\u1535\0\u1572"+
    "\0\u15af\0\u15ec\0\u1629\0\172\0\172\0\u1666\0\u16a3\0\u16e0"+
    "\0\u171d\0\u175a\0\172\0\172\0\u1797\0\u17d4\0\u1811\0\u184e"+
    "\0\u188b\0\u18c8\0\u1905\0\172\0\172\0\172\0\u1942\0\u197f"+
    "\0\172\0\u19bc\0\u19f9\0\u1a36\0\u1a73\0\u1ab0\0\172\0\u1aed"+
    "\0\u1b2a\0\u1b67\0\u1ba4\0\u1be1\0\172\0\172\0\u1c1e\0\u1c5b"+
    "\0\u1c98\0\172\0\172\0\172\0\u1cd5\0\u1d12\0\172\0\u1d4f"+
    "\0\172";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
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
    "\1\0\1\2\1\3\1\4\2\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\3\1\15\1\16\6\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\2\1\0"+
    "\1\25\1\26\2\3\1\27\1\30\1\31\1\32\1\33"+
    "\1\3\1\34\1\35\1\36\1\37\2\3\1\40\2\3"+
    "\1\41\1\3\1\42\1\43\1\44\1\45\2\3\1\46"+
    "\1\3\1\47\1\50\77\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\3\0"+
    "\1\4\10\0\1\51\2\0\1\4\64\0\1\5\76\0"+
    "\1\5\75\0\1\5\65\0\1\52\13\0\1\52\57\0"+
    "\2\3\11\0\4\3\1\53\10\3\4\0\3\3\1\54"+
    "\1\3\3\0\3\3\2\0\10\3\2\0\10\3\3\0"+
    "\1\52\10\0\1\51\2\0\1\52\2\55\55\0\2\3"+
    "\11\0\15\3\4\0\1\3\1\56\3\3\3\0\1\3"+
    "\1\57\1\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\3\3\1\60\1\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\15\3"+
    "\4\0\5\3\3\0\1\3\1\61\1\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\5\3"+
    "\3\0\1\3\1\62\1\3\2\0\10\3\2\0\10\3"+
    "\32\23\1\63\2\0\1\64\13\23\1\0\23\23\2\0"+
    "\2\3\11\0\15\3\4\0\5\3\3\0\3\3\2\0"+
    "\4\3\1\65\3\3\2\0\10\3\2\0\2\3\11\0"+
    "\1\3\1\66\13\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\1\67\4\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\45\0\1\70\31\0\2\3\11\0\15\3\4\0\5\3"+
    "\3\0\1\3\1\71\1\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\14\3\1\72\4\0\5\3\3\0"+
    "\3\3\2\0\1\73\1\74\6\3\2\0\10\3\33\0"+
    "\1\75\43\0\2\3\11\0\15\3\4\0\2\3\1\76"+
    "\2\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\15\3\4\0\5\3\3\0\3\3\2\0"+
    "\4\3\1\77\3\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\1\3\1\100\3\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\64\0\1\101\12\0\2\3\11\0"+
    "\10\3\1\102\4\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\1\3\1\103"+
    "\13\3\4\0\5\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\1\3\1\104\13\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\1\3\1\105\13\3\4\0\5\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\1\3\1\106\13\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\3\0\1\51\11\0\2\107\1\51"+
    "\60\0\1\52\10\0\1\51\2\0\1\52\57\0\2\3"+
    "\11\0\15\3\4\0\1\110\4\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\4\3\1\111\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\3\0\1\55\11\0\3\55\2\0\10\55\45\0\2\3"+
    "\11\0\1\3\1\112\13\3\4\0\5\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\15\3"+
    "\4\0\5\3\3\0\1\3\1\113\1\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\10\3\1\114\4\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\2\3\1\115\2\3"+
    "\3\0\3\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\1\3\1\116\3\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\32\23\1\117\2\0\1\64"+
    "\13\23\1\0\23\23\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\2\3\1\120\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\1\121\4\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\1\3\1\122\3\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\2\3\1\123\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\1\124\4\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\5\3\3\0\3\3\2\0\2\3\1\125"+
    "\5\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\3\3\1\126\1\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\15\3\4\0\5\3\3\0"+
    "\2\3\1\127\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\5\3\3\0\2\3\1\130\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\3\3\1\131\1\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\10\3\1\132\4\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\15\3\4\0\5\3\3\0\3\3\2\0"+
    "\3\3\1\133\4\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\1\134\4\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\1\135"+
    "\4\3\3\0\3\3\2\0\10\3\2\0\10\3\3\0"+
    "\2\136\6\0\1\136\3\0\1\136\57\0\2\3\11\0"+
    "\1\3\1\137\13\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\1\3\1\140"+
    "\13\3\4\0\5\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\10\3\1\141\4\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\15\3\4\0\3\3\1\142\1\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\4\3\1\143\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\11\3\1\144\3\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\4\3\1\145\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\2\3\1\146\2\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\2\3\1\147\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\13\3\1\150\1\3\4\0\5\3"+
    "\3\0\3\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\1\3\1\151\13\3\4\0\5\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\15\3"+
    "\4\0\3\3\1\152\1\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\3\3"+
    "\1\153\1\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\3\3\1\154\1\3"+
    "\3\0\3\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\5\3\3\0\3\3\2\0\1\155"+
    "\7\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\3\3\1\156\1\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\13\3\1\157\1\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\5\3\1\160\7\3\4\0\5\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\6\3\1\161\6\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\6\3\1\162"+
    "\6\3\4\0\5\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\3\0\1\136\13\0\1\136\57\0\2\3\11\0"+
    "\15\3\4\0\5\3\3\0\3\3\2\0\1\163\7\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\5\3"+
    "\3\0\3\3\2\0\5\3\1\164\2\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\4\3\1\165\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\3\3\1\166\1\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\1\3\1\167\3\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\15\3\4\0\5\3\3\0"+
    "\3\3\2\0\1\170\7\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\1\3\1\171\3\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\1\3"+
    "\1\172\13\3\4\0\5\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\1\3\1\173\13\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\1\174\4\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\5\3\3\0\1\3\1\175\1\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\2\3\1\176"+
    "\1\177\4\3\2\0\2\3\11\0\15\3\4\0\1\3"+
    "\1\200\3\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\5\3\3\0\3\3"+
    "\2\0\10\3\2\0\5\3\1\201\2\3\2\0\2\3"+
    "\11\0\15\3\4\0\5\3\3\0\3\3\2\0\10\3"+
    "\2\0\5\3\1\202\2\3\2\0\2\3\11\0\13\3"+
    "\1\203\1\3\4\0\5\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\1\3\1\204\13\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\5\3\3\0\3\3"+
    "\2\0\1\205\7\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\5\3\3\0\3\3\2\0\7\3\1\206"+
    "\2\0\10\3\2\0\2\3\11\0\14\3\1\207\4\0"+
    "\5\3\3\0\3\3\2\0\10\3\2\0\10\3\2\0"+
    "\2\3\11\0\15\3\4\0\5\3\3\0\3\3\2\0"+
    "\1\3\1\210\6\3\2\0\10\3\2\0\2\3\11\0"+
    "\12\3\1\211\2\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\3\3\2\0\1\212\7\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\5\3\3\0\2\3"+
    "\1\213\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\1\3\1\214\3\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\1\215\4\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\1\216\4\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\4\3\1\217\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\10\3\1\220\4\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\1\3\1\221\13\3\4\0\5\3"+
    "\3\0\3\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\15\3\4\0\1\222\4\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\15\3\4\0"+
    "\5\3\3\0\3\3\2\0\1\223\7\3\2\0\10\3"+
    "\2\0\2\3\11\0\10\3\1\224\4\3\4\0\5\3"+
    "\3\0\3\3\2\0\10\3\2\0\10\3\2\0\2\3"+
    "\11\0\1\3\1\225\13\3\4\0\5\3\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\1\3"+
    "\1\226\13\3\4\0\5\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\12\3\1\227\2\3"+
    "\4\0\5\3\3\0\3\3\2\0\10\3\2\0\10\3"+
    "\2\0\2\3\11\0\15\3\4\0\5\3\3\0\3\3"+
    "\2\0\1\230\7\3\2\0\10\3\2\0\2\3\11\0"+
    "\1\3\1\231\13\3\4\0\5\3\3\0\3\3\2\0"+
    "\10\3\2\0\10\3\2\0\2\3\11\0\1\3\1\232"+
    "\13\3\4\0\5\3\3\0\3\3\2\0\10\3\2\0"+
    "\10\3\2\0\2\3\11\0\15\3\4\0\5\3\3\0"+
    "\3\3\2\0\10\3\2\0\5\3\1\233\2\3\2\0"+
    "\2\3\11\0\1\3\1\234\13\3\4\0\5\3\3\0"+
    "\3\3\2\0\10\3\2\0\10\3\2\0\2\3\11\0"+
    "\15\3\4\0\1\235\4\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\5\3"+
    "\3\0\3\3\2\0\7\3\1\236\2\0\10\3\2\0"+
    "\2\3\11\0\15\3\4\0\4\3\1\237\3\0\3\3"+
    "\2\0\10\3\2\0\10\3\2\0\2\3\11\0\1\3"+
    "\1\240\13\3\4\0\5\3\3\0\3\3\2\0\10\3"+
    "\2\0\10\3\2\0\2\3\11\0\15\3\4\0\1\3"+
    "\1\241\3\3\3\0\3\3\2\0\10\3\2\0\10\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7564];
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
    "\1\0\1\11\2\1\1\11\3\1\2\0\1\1\1\11"+
    "\1\1\1\0\4\1\1\0\1\11\3\1\1\11\1\1"+
    "\1\11\3\1\1\11\4\1\1\11\6\1\1\0\10\1"+
    "\1\11\1\0\3\1\1\11\4\1\1\11\3\1\1\11"+
    "\140\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
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
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
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
        case 1: 
          { /* ignora el espacio */
          }
        case 48: break;
        case 2: 
          { System.out.print(yytext()); 
                      return symbol(sym.IDENTIFICADOR, yytext());
          }
        case 49: break;
        case 3: 
          { System.out.print(yytext()); 
                      return symbol(sym.ENTERO, yytext());
          }
        case 50: break;
        case 4: 
          { System.out.print(yytext()); 
                      return symbol(sym.OPERADORESA, yytext());
          }
        case 51: break;
        case 5: 
          { System.out.print(yytext()); 
                return symbol(sym.IGUAL, yytext());
          }
        case 52: break;
        case 6: 
          { System.out.print(yytext()); 
                return symbol(sym.NEGACION, yytext());
          }
        case 53: break;
        case 7: 
          { System.out.print(yytext()); 
                return symbol(sym.MENOS, yytext());
          }
        case 54: break;
        case 8: 
          { System.out.print(yytext()); 
                return symbol(sym.PUNTO, yytext());
          }
        case 55: break;
        case 9: 
          { System.out.print(yytext()); 
                return symbol(sym.PAR_C, yytext());
          }
        case 56: break;
        case 10: 
          { System.out.print(yytext()); 
                      return symbol(sym.PUNTOYCOMA, yytext());
          }
        case 57: break;
        case 11: 
          { System.out.print(yytext()); 
                return symbol(sym.CORCH_A, yytext());
          }
        case 58: break;
        case 12: 
          { System.out.print(yytext()); 
                return symbol(sym.CORCH_C, yytext());
          }
        case 59: break;
        case 13: 
          { System.out.print(yytext()); 
                return symbol(sym.PAR_A, yytext());
          }
        case 60: break;
        case 14: 
          { System.out.print(yytext()); 
                return symbol(sym.COMA, yytext());
          }
        case 61: break;
        case 15: 
          { System.out.print(yytext()); 
                return symbol(sym.LL_A, yytext());
          }
        case 62: break;
        case 16: 
          { System.out.print(yytext()); 
                return symbol(sym.LL_C, yytext());
          }
        case 63: break;
        case 17: 
          { System.out.print(yytext()); 
                      return symbol(sym.DECIMAL, yytext());
          }
        case 64: break;
        case 18: 
          { System.out.print(yytext()); 
                      return symbol(sym.HEXADECIMAL, yytext());
          }
        case 65: break;
        case 19: 
          { System.out.print(yytext()); 
                      return symbol(sym.TEXTO, yytext());
          }
        case 66: break;
        case 20: 
          { System.out.print(yytext()); 
                return symbol(sym.CORCH, yytext());
          }
        case 67: break;
        case 21: 
          { System.out.print(yytext()); 
                return symbol(sym.SI, yytext());
          }
        case 68: break;
        case 22: 
          { System.out.print(yytext()); 
                return symbol(sym.PARENTESIS, yytext());
          }
        case 69: break;
        case 23: 
          { System.out.print(yytext()); 
                return symbol(sym.LLAVES, yytext());
          }
        case 70: break;
        case 24: 
          { System.out.print(yytext()); 
                return symbol(sym.PARA, yytext());
          }
        case 71: break;
        case 25: 
          { System.out.print(yytext()); 
                return symbol(sym.TDE, yytext());
          }
        case 72: break;
        case 26: 
          { System.out.print(yytext()); 
                return symbol(sym.NUEVO, yytext());
          }
        case 73: break;
        case 27: 
          { System.out.print(yytext()); 
                return symbol(sym.SINO, yytext());
          }
        case 74: break;
        case 28: 
          { System.out.print(yytext()); 
                return symbol(sym.TDB, yytext());
          }
        case 75: break;
        case 29: 
          { System.out.print(yytext()); 
                return symbol(sym.ESTO, yytext());
          }
        case 76: break;
        case 30: 
          { System.out.print(yytext()); 
                return symbol(sym.VD, yytext());
          }
        case 77: break;
        case 31: 
          { System.out.print(yytext()); 
                return symbol(sym.NULO, yytext());
          }
        case 78: break;
        case 32: 
          { System.out.print(yytext()); 
                return symbol(sym.ROMPE, yytext());
          }
        case 79: break;
        case 33: 
          { System.out.print(yytext()); 
                return symbol(sym.CLASE, yytext());
          }
        case 80: break;
        case 34: 
          { System.out.print(yytext()); 
                return symbol(sym.MIENTRAS, yytext());
          }
        case 81: break;
        case 35: 
          { System.out.print(yytext()); 
                return symbol(sym.IMPRIMIR, yytext());
          }
        case 82: break;
        case 36: 
          { System.out.print(yytext()); 
                return symbol(sym.TDD, yytext());
          }
        case 83: break;
        case 37: 
          { System.out.print(yytext()); 
                return symbol(sym.RETORNA, yytext());
          }
        case 84: break;
        case 38: 
          { System.out.print(yytext()); 
                return symbol(sym.TDS, yytext());
          }
        case 85: break;
        case 39: 
          { System.out.print(yytext()); 
                return symbol(sym.M_OC, yytext());
          }
        case 86: break;
        case 40: 
          { System.out.print(yytext()); 
                return symbol(sym.HERENCIA, yytext());
          }
        case 87: break;
        case 41: 
          { System.out.print(yytext()); 
                return symbol(sym.OBTENER_BYTES, yytext());
          }
        case 88: break;
        case 42: 
          { System.out.print(yytext()); 
                return symbol(sym.SET_BYTES, yytext());
          }
        case 89: break;
        case 43: 
          { System.out.print(yytext()); 
                return symbol(sym.LEER_LIN, yytext());
          }
        case 90: break;
        case 44: 
          { System.out.print(yytext()); 
                return symbol(sym.NUEVO_A, yytext());
          }
        case 91: break;
        case 45: 
          { System.out.print(yytext()); 
                return symbol(sym.INTERFAZ, yytext());
          }
        case 92: break;
        case 46: 
          { System.out.print(yytext()); 
                return symbol(sym.IMPLEMENTA, yytext());
          }
        case 93: break;
        case 47: 
          { System.out.print(yytext()); 
                return symbol(sym.LEER_EN, yytext());
          }
        case 94: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}