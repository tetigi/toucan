
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Sep 14 18:49:15 BST 2013
//----------------------------------------------------

package frontend.parser;

import java_cup.runtime.*;
import frontend.tokeniser.Token;
import utils.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Sep 14 18:49:15 BST 2013
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\005\000\002\002\004\000\002\002" +
    "\005\000\002\002\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\004\010\004\001\002\000\014\002\ufffa\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\001\002\000\014\002\ufffb" +
    "\004\ufffb\005\ufffb\006\ufffb\007\ufffb\001\002\000\014\002" +
    "\ufffe\004\ufffe\005\ufffe\006\014\007\015\001\002\000\010" +
    "\002\012\004\010\005\011\001\002\000\004\010\004\001" +
    "\002\000\004\010\004\001\002\000\004\002\000\001\002" +
    "\000\014\002\uffff\004\uffff\005\uffff\006\014\007\015\001" +
    "\002\000\004\010\004\001\002\000\004\010\004\001\002" +
    "\000\014\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\001" +
    "\002\000\014\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc" +
    "\001\002\000\014\002\001\004\001\005\001\006\014\007" +
    "\015\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\010\002\006\003\005\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\017\004\004\001\001\000\006\003" +
    "\012\004\004\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\016\001\001\000\004\004\015\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // factor ::= INTEGER_LITERAL 
            {
              UnorderedTree<Token> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Token i = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(i.val, i.id)); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // term ::= factor 
            {
              UnorderedTree<Token> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> f = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = f; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // term ::= term DIVIDE factor 
            {
              UnorderedTree<Token> RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int divideleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int divideright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token divide = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> f = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(divide.val, divide.id), t, f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // term ::= term TIMES factor 
            {
              UnorderedTree<Token> RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int timesleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int timesright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token times = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> f = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(times.val, times.id), t, f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= term 
            {
              UnorderedTree<Token> RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = t; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr MINUS term 
            {
              UnorderedTree<Token> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int minusleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int minusright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token minus = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT =  new UnorderedTree<Token>(new Token(minus.val, minus.id), e, t); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		UnorderedTree<Token> start_val = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= expr PLUS term 
            {
              UnorderedTree<Token> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int plusleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int plusright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token plus = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(plus.val, plus.id), e, t); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

