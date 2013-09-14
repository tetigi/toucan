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
package backend.interpreter;

import java.util.logging.Logger;

import backend.interpreter.data.DataHInt;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.TokenTypeNotFoundException;
import frontend.tokeniser.Token;
import frontend.tokeniser.TokeniserSym;

/**
 * @author ltomlin
 * 
 */
public class TypeFactory {

    private static Logger LOGGER = Logger
	    .getLogger(TypeFactory.class.getName());

    public static DataType getTypeFromToken(Token t)
	    throws TokenTypeNotFoundException {
	DataType v = null;

	switch (t.id) {
	case TokeniserSym.INTEGER_LITERAL:
	    v = new DataHInt();
	    v.setFromToken(t);
	    break;
	default:
	    LOGGER.severe("Could not type token " + t);
	    throw new TokenTypeNotFoundException("Token " + t
		    + " could not be typed.");
	}

	return v;

    }
}
