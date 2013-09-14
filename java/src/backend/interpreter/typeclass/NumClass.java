package backend.interpreter.typeclass;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;
import backend.interpreter.exceptions.IncorrectTypeError;

public class NumClass extends BaseTypeClass {

    public final static String PLUS = "+";
    public final static String TIMES = "*";
    public final static String MINUS = "-";
    public final static String NEGATE = "negate";
    public final static String ABS = "abs";
    public final static String SIGNUM = "signum";
    public final static String FROM_INTEGER = "fromInteger";

    public NumClass() {
	thisClass = TypeClass.Num;
	thisMethods.add(PLUS);
	thisMethods.add(TIMES);
	thisMethods.add(MINUS);
	thisMethods.add(NEGATE);
	thisMethods.add(ABS);
	thisMethods.add(SIGNUM);
	thisMethods.add(FROM_INTEGER);
    }

    @Override
    public DataType checkAndRun(Context c, String methodName, List<DataType> l)
	    throws ClassNotImplementedError, IncorrectArgLengthError,
	    IncorrectTypeError {
	switch (methodName) {
	case PLUS:
	case TIMES:
	case MINUS:
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
	case NEGATE:
	case ABS:
	case SIGNUM:
	case FROM_INTEGER:
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
