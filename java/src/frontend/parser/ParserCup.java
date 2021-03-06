
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Nov 06 22:39:13 GMT 2013
//----------------------------------------------------

package frontend.parser;

import java_cup.runtime.*;
import utils.UnorderedTree;
import frontend.tokeniser.Token;
import frontend.tokeniser.TokeniserSym;
import utils.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Nov 06 22:39:13 GMT 2013
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
    "\000\016\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\004\005\000\002\004\005\000\002\004\003" +
    "\000\002\003\004\000\002\003\003\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\003\000\002" +
    "\006\003\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\010\011\004\012\007\013\011\001\002\000" +
    "\024\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5" +
    "\011\ufff5\013\ufff5\014\ufff5\001\002\000\024\002\ufffc\004" +
    "\016\005\ufffc\006\ufffc\007\017\010\020\011\ufffc\013\ufffc" +
    "\014\ufffc\001\002\000\024\002\ufff6\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\011\ufff6\013\ufff6\014\ufff6\001\002" +
    "\000\006\011\004\013\011\001\002\000\004\002\027\001" +
    "\002\000\006\011\004\013\011\001\002\000\010\002\uffff" +
    "\005\013\006\014\001\002\000\006\011\004\013\011\001" +
    "\002\000\006\011\004\013\011\001\002\000\024\002\ufffd" +
    "\004\016\005\ufffd\006\ufffd\007\017\010\020\011\ufffd\013" +
    "\ufffd\014\ufffd\001\002\000\006\011\004\013\011\001\002" +
    "\000\006\011\004\013\011\001\002\000\006\011\004\013" +
    "\011\001\002\000\024\002\ufff9\004\ufff9\005\ufff9\006\ufff9" +
    "\007\ufff9\010\ufff9\011\ufff9\013\ufff9\014\ufff9\001\002\000" +
    "\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8" +
    "\011\ufff8\013\ufff8\014\ufff8\001\002\000\024\002\ufff7\004" +
    "\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\013\ufff7" +
    "\014\ufff7\001\002\000\024\002\ufffe\004\016\005\ufffe\006" +
    "\ufffe\007\017\010\020\011\ufffe\013\ufffe\014\ufffe\001\002" +
    "\000\010\005\013\006\014\014\026\001\002\000\024\002" +
    "\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4" +
    "\013\ufff4\014\ufff4\001\002\000\004\002\000\001\002\000" +
    "\010\002\001\011\004\013\011\001\002\000\014\002\ufffa" +
    "\005\013\006\014\011\ufffa\013\ufffa\001\002\000\014\002" +
    "\ufffb\005\013\006\014\011\ufffb\013\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\012\002\007\004\011\005\004\006\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\003\027\004\030\005\004\006\005\001\001\000" +
    "\002\001\001\000\010\004\024\005\004\006\005\001\001" +
    "\000\002\001\001\000\006\005\023\006\005\001\001\000" +
    "\006\005\014\006\005\001\001\000\002\001\001\000\004" +
    "\006\022\001\001\000\004\006\021\001\001\000\004\006" +
    "\020\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\031\005\004\006\005" +
    "\001\001\000\002\001\001\000\002\001\001" });

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
          case 13: // factor ::= OPARENS expr CPARENS 
            {
              UnorderedTree<Token> RESULT =null;
		int openleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int openright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Token open = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int closeleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int closeright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Token close = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= INTEGER_LITERAL 
            {
              UnorderedTree<Token> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Token i = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(i.val, i.id)); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // term ::= factor 
            {
              UnorderedTree<Token> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> f = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = f; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // term ::= term EQ factor 
            {
              UnorderedTree<Token> RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int eqleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int eqright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token eq = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> f = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(eq.val, TokeniserSym.IDENTIFIER), t, f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // term ::= term DIVIDE factor 
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
		 RESULT = new UnorderedTree<Token>(new Token(divide.val, TokeniserSym.IDENTIFIER), t, f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // term ::= term TIMES factor 
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
		 RESULT = new UnorderedTree<Token>(new Token(times.val, TokeniserSym.IDENTIFIER), t, f); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // args ::= expr 
            {
              UnorderedTree<Token> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(TokeniserSym.ARG), e); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("args",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // args ::= args expr 
            {
              UnorderedTree<Token> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		UnorderedTree<Token> a = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(TokeniserSym.ARG), e, a); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("args",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= term 
            {
              UnorderedTree<Token> RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> t = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = t; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr MINUS term 
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
		 RESULT =  new UnorderedTree<Token>(new Token(minus.val, TokeniserSym.IDENTIFIER), e, t); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr PLUS term 
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
		 RESULT = new UnorderedTree<Token>(new Token(plus.val, TokeniserSym.IDENTIFIER), e, t); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // bigexpr ::= expr 
            {
              UnorderedTree<Token> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> e = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("bigexpr",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= bigexpr EOF 
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
          case 0: // bigexpr ::= IDENTIFIER args 
            {
              UnorderedTree<Token> RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Token id = (Token)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		UnorderedTree<Token> a = (UnorderedTree<Token>)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new UnorderedTree<Token>(new Token(id.val, TokeniserSym.IDENTIFIER), a); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("bigexpr",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

