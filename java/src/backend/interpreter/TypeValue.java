/* 
 * Copyright (C) 2013 BlackRock.
 * 
 * Created on 10 Sep 2013
 * 
 * Last edited by: $Author: $ *             on: $Date: $
 *       Filename: $URL: $
 *       Revision: $Revision: $
 */
package backend.interpreter;

import frontend.tokeniser.Token;

/**
 * @author ltomlin
 *
 */
public interface TypeValue {
	
	String getRepr();
	
	void setFromToken(Token t);
	
}
