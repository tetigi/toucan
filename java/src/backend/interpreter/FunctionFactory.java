package backend.interpreter;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;
import backend.interpreter.exceptions.IncorrectTypeError;
import backend.interpreter.exceptions.NoSuchMethodForClassError;
import backend.interpreter.exceptions.NoSuchMethodForTokenError;
import backend.interpreter.typeclass.BaseTypeClass;
import frontend.tokeniser.Token;

public class FunctionFactory {

    public static DataType runFunctionFromToken(Context c, Token t,
	    List<DataType> args) throws NoSuchMethodForTokenError,
	    NoSuchMethodForClassError, ClassNotImplementedError,
	    IncorrectArgLengthError, IncorrectTypeError {

	// Get the associated method
	// String methodName = c.getAssocMethod(t.id);

	// Get the associated type class with that method
	BaseTypeClass typeClass = c.getAssocTypeClass(t.val);

	// Type check the parameters for the typeclass and run the function
	DataType ret = typeClass.checkAndRun(c, t.val, args);
	return ret;
    }
}