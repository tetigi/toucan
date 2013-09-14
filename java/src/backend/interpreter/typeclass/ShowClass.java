package backend.interpreter.typeclass;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;

public class ShowClass extends BaseTypeClass {

    public final static String SHOW = "show";

    public ShowClass() {
	thisClass = TypeClass.Show;
	thisMethods.add(SHOW);
    }

    @Override
    public DataType checkAndRun(Context c, String methodName, List<DataType> l) throws IncorrectArgLengthError, ClassNotImplementedError {
	switch (methodName) {
	case SHOW:
	    if (l.size() == 1) {
		DataType a = l.get(0);
		if (a.getInstance().isInstanceOf(thisClass)) {
		    return a.getInstance().runMethod(methodName, l);
		} else {
		    throw new ClassNotImplementedError(a.getType()
			    + " is not an instance of " + thisClass);
		}
	    } else {
		throw new IncorrectArgLengthError("Received " + l.size()
			+ " arguments for expected arity 1");
	    }
	}
	return null;
    }
}
