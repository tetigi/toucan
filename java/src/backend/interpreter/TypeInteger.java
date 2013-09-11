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

import javax.xml.bind.TypeConstraintException;

import frontend.tokeniser.Token;
import frontend.tokeniser.TokeniserSym;
/**
 * @author ltomlin
 *
 */
public class TypeInteger implements TypeValue {

	Integer val;
	
	@Override
	public String getRepr() {
	
		return val.toString();
	}
	
	@Override
	public void setFromToken(Token t) {
		if (t.id != TokeniserSym.INTEGER_LITERAL) {
			throw new TypeConstraintException("Token is not of integer type");
		} 
		val = Integer.parseInt(t.val);
	}

}
