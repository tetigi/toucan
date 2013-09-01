package frontend.parser.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import frontend.parser.ParserCup;

public class ParserCupTest {

  ParserCup parser;
  Tokeniser tokeniser;

  @Before
  public void setUp() throws Exception {
    parser = new ParserCup();
  }

  @Test
  public void testParse() {
    final String myString = "1 + 2 * 3";
    tokeniser = new Tokeniser(new java.io.StringReader(myString));
    parser.setScanner(tokeniser);
    parser.parse();

    fail("Not yet implemented");
  }
}
