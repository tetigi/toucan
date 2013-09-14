package backend.interpreter.typeclass;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;
import backend.interpreter.exceptions.IncorrectTypeError;

public class EqClass extends BaseTypeClass {

    public final static String EQ = "==";
    public final static String NEQ = "/=";
    
    public EqClass() {
	thisClass = TypeClass.Eq;
	thisMethods.add(EQ);
	thisMethods.add(NEQ);
    }

    @Override
    public DataType checkAndRun(Context c, String methodName, List<DataType> l) throws ClassNotImplementedError, IncorrectArgLengthError, IncorrectTypeError {
	switch (methodName) {
	case EQ:
	case NEQ:
	    if (l.size() == 2) {
		DataType a = l.get(0);
		DataType b = l.get(1);
		if (a.getInstance().isInstanceOf(thisClass)) {
		    if (a.getType() == b.getType()) {
			return a.getInstance().runMethod(methodName, l);
		    } else {
			throw new IncorrectTypeError("Expected types "
				+ a.getType() + " -> " + a.getType()
				+ " and instead got " + a.getType() + " -> "
				+ b.getType());
		    }
		} else {
		    throw new ClassNotImplementedError(a.getType()
			    + " is not an instance of " + thisClass);
		}
	    } else {
		throw new IncorrectArgLengthError("Received " + l.size()
			+ " arguments for expected arity 2");
	    }
	}
	return null;
    }
}
