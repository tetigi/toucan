package backend.interpreter;

import frontend.tokeniser.Token;
import frontend.tokeniser.TokeniserSym;

public class FunctionFactory {
	public static Function getFunctionFromToken(Token t) {
		Function f = null;
		switch (t.id){
		case TokeniserSym.PLUS:
			f = new FunctionPlus();
			break;
		case TokeniserSym.TIMES:
			f = new FunctionTimes();
			break;
		default:
			System.out.println("Unknown function for token " + t);
			// TODO Throw some sort of exception
			// TODO Add log here
		}
		
		return f;
	}
}
