package frontend.tokeniser;

/**
 * Container for representing a token.
 * 
 * @author tetigi
 * 
 */
public class Token {

  // ID for this token
  public final int id;

  // Value of this token (if at all)
  public String val;

  /**
   * Constructor for a token with a value (such as integers).
   * 
   * @param val
   *          Value for the token
   * @param id
   *          The identity of this token
   */
  public Token(final String val, final int id) {
    this.val = val;
    this.id = id;
  }

  /**
   * Constructor for value-less token (such as operators).
   * 
   * @param id
   *          The identity of this token
   */
  public Token(final int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return val;
  }

}
