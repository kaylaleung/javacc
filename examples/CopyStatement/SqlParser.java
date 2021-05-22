/* SqlParser.java */
/* Generated By:JavaCC: Do not edit this line. SqlParser.java */
import java.util.ArrayList;
import java.util.HashMap;

/** Simple brace matcher. */
public class SqlParser implements SqlParserConstants {

  String table_name;
  ArrayList<String> column_names = new ArrayList<String>();
  String file_path = new String();
  boolean is_from = true;
  String format = new String();
  String delimiter = new String();
  String nullStr = new String();
  String quote = new String();
  String escape = new String();
  boolean header;

  /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    SqlParser parser = new SqlParser(System.in);
    parser.Input();
  }

  public void run() throws ParseException, TokenMgrError {
    Input();
    if (format.isEmpty()) {
      format = "TEXT";
    }
    if (delimiter.isEmpty()) {
      if (format.equals("TEXT")) {
        delimiter = "\t";
      } else {
        delimiter = ",";
      }
    }
  }

  final public void Input() throws ParseException {Token table_token;
    jj_consume_token(COPY);
    table_token = jj_consume_token(NAME);
table_name = table_token.image;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OBRA:{
      column_names = ColumnNames();
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    Destination();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OBRA:
    case WITH:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case WITH:{
        jj_consume_token(WITH);
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        ;
      }
      jj_consume_token(OBRA);
      Options();
      jj_consume_token(CBRA);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(0);
}

  final public ArrayList<String> ColumnNames() throws ParseException {Token col_token;
  ArrayList<String> columns = new ArrayList<String>();
    jj_consume_token(OBRA);
    col_token = jj_consume_token(NAME);
columns.add(col_token.image);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      col_token = jj_consume_token(NAME);
columns.add(col_token.image);
    }
    jj_consume_token(CBRA);
{if ("" != null) return columns;}
    throw new Error("Missing return statement in function");
}

  final public void Destination() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FROM:{
      jj_consume_token(FROM);
is_from = true;
      break;
      }
    case TO:{
      jj_consume_token(TO);
is_from = false;
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STDIN:{
      jj_consume_token(STDIN);
file_path = "STDIN";
      break;
      }
    case STDOUT:{
      jj_consume_token(STDOUT);
file_path = "STDOUT";
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Options() throws ParseException {
    Option();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMMA);
      Option();
    }
}

  final public void Option() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FORMAT:{
      Format();
      break;
      }
    case DELIMITER:{
      Delimiter();
      break;
      }
    case HEADER:{
      Header();
      break;
      }
    case NULL:{
      Null();
      break;
      }
    case QUOTE:{
      Quote();
      break;
      }
    case ESCAPE:{
      Escape();
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Format() throws ParseException {Token format_token;
    jj_consume_token(FORMAT);
    format_token = jj_consume_token(CSV_OR_TEXT_OR_BINARY);
format = format_token.image;
}

  final public void Delimiter() throws ParseException {Token delimiter_token;
    jj_consume_token(DELIMITER);
    delimiter_token = jj_consume_token(ANY_CHAR);
delimiter = delimiter_token.image;
}

  final public void Null() throws ParseException {Token null_token;
    jj_consume_token(NULL);
    null_token = jj_consume_token(ANY_CHAR);
nullStr = null_token.image;
}

  final public void Escape() throws ParseException {Token escape_token;
    jj_consume_token(ESCAPE);
    escape_token = jj_consume_token(ANY_CHAR);
escape = escape_token.image;
}

  final public void Quote() throws ParseException {Token quote_token;
    jj_consume_token(QUOTE);
    quote_token = jj_consume_token(ANY_CHAR);
quote = quote_token.image;
}

  final public void Header() throws ParseException {
    jj_consume_token(HEADER);
header = true;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:{
        jj_consume_token(TRUE);
        break;
        }
      case FALSE:{
        jj_consume_token(FALSE);
header = false;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      ;
    }
}

  /** Generated Token Manager. */
  public SqlParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x800,0x2000,0x2800,0x4000,0x500,0x30000,0x4000,0x9c8200,0x600000,0x600000,};
	}

  /** Constructor with InputStream. */
  public SqlParser(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SqlParser(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new SqlParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SqlParser(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new SqlParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new SqlParserTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SqlParser(SqlParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SqlParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[28];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 10; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 28; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}