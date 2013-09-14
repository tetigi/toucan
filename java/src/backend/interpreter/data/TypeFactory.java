/* 
 * Copyright (C) 2013 BlackRock.
 * 
 * Created on 11 Sep 2013
 * 
 * Last edited by: $Author: $
 *             on: $Date: $
 *       Filename: $URL: $
 *       Revision: $Revision: $
 */
package backend.interpreter.data;

import frontend.tokeniser.Token;
import frontend.tokeniser.TokeniserSym;

/**
 * @author ltomlin
 * 
 */
public class TypeFactory {
    public static DataType getTypeFromToken(Token t) {
	DataType v = null;
	// System.out.println("Typing token " + t);
	switch (t.id) {
	case TokeniserSym.INTEGER_LITERAL:
	    v = new DataHInt();
	    v.setFromToken(t);
	    break;
	default:
	    System.out.println("Unknown type for token " + t);

	    // TODO Throw some sort of exception
	    // TODO Add log here
	}

	return v;

    }
}
