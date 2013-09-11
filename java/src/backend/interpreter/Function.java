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

import java.util.List;

/**
 * @author ltomlin
 *
 */
public interface Function {
	TypeValue execute(List<TypeValue> args);
}
