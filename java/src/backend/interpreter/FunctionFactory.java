package backend.interpreter;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.typeclass.BaseTypeClass;
import frontend.tokeniser.Token;

public class FunctionFactory {

    public static DataType runFunctionFromToken(Context c, Token t,
	    List<DataType> args) {

	// Get the associated method
	String methodName = c.getAssocMethod(t.id);

	System.out.println("Method name is " + methodName);

	// Get the associated type class with that method
	BaseTypeClass typeClass = c.getAssocTypeClass(methodName);

	System.out.println("Type class assoc is " + typeClass.getTypeClass());

	// Type check the parameters for the typeclass and run the function
	DataType ret = typeClass.checkAndRun(c, methodName, args);
	return ret;
    }
}
