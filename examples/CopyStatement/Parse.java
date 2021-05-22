import java.io.*;

public class Parse {

  public static void main(String[] args) {

    try {
      StringReader in = new StringReader("COPY tablename (col1, col2, col3, col4) FROM STDIN WITH (HEADER 0, FORMAT CSV, DELIMITER ';', ESCAPE 'e', NULL 'nil', QUOTE 'q')");
      SqlParser parser = new SqlParser(in);
      parser.run();
      System.out.println("Table Name: " + parser.table_name);
      System.out.println("Column Names: " + parser.column_names.toString());
      System.out.println("Format : " + parser.format);
      System.out.println("Delimiter: " + parser.delimiter);
      System.out.println("Source : " + parser.is_from);
      System.out.println("Header: " + parser.header);
      System.out.println("Escape: " + parser.escape);
      System.out.println("Null : " + parser.nullStr);
      System.out.println("Quote : " + parser.quote);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
