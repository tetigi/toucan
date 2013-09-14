
package frontend.tokeniser;

import java_cup.runtime.*;
import java.io.IOException;

import frontend.tokeniser.TokeniserSym;
// import static frontend.tokeniser.TokeniserSym.*;
import static frontend.parser.ParserSym.*;
import java.util.Collection;
import java.util.LinkedList;

%%

%class Tokeniser

%unicode 
%line
%column

// %public
%final
// %abstract

%cupsym frontend.tokeniser.TokeniserSym
%cup
// %cupdebug

%init{
	// TODO: code that goes to constructor
%init}

%{
	private Symbol symbol(int type)
	{
		return symbol(type, yytext());
	}

	private Symbol sym(int type, Object value)
	{
		return new Symbol(type, yyline, yycolumn, value);
	}

	private void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}

    private Token createToken(final String val, final int start) {
        final Token tk = new Token(val, start);
        addToken(tk);
        return tk;
    }
    private Token createToken(final int start) {
        final Token tk = new Token(start);
        addToken(tk);
        return tk;
    }

    public Collection<Token> tokens = new LinkedList<Token>();

    private void addToken(final Token tk) {
        tokens.add(tk);
    }
    private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | -?[1-9][0-9]*


%state STRING

%%

<YYINITIAL> {
 
 /* identifiers */ 
  {Identifier}                   { return symbol(IDENTIFIER, createToken(yytext(), IDENTIFIER)); }
 
  /* literals */
  {DecIntegerLiteral}            { return symbol(INTEGER_LITERAL, createToken(yytext(), INTEGER_LITERAL)); }

  /* operators */
  "+"                            { return symbol(PLUS , createToken(yytext(), PLUS)); }
  "-"                            { return symbol(MINUS , createToken(yytext(), MINUS)); }
  "*"                            { return symbol(TIMES , createToken(yytext(), TIMES)); }
  "/"                            { return symbol(DIVIDE , createToken(yytext(), DIVIDE)); }
  "=="                            { return symbol(EQ , createToken(yytext(), EQ)); }
  
  /* whitespace */
  {WhiteSpace}                   { /* ignore me*/ }
  

}

/* error fallback */
.|\n                             { throw new Error("Illegal character <"+
                                                    yytext()+">"); }


