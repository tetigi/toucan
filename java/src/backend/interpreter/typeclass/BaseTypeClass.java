package backend.interpreter.typeclass;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;
import backend.interpreter.exceptions.IncorrectTypeError;

public abstract class BaseTypeClass {
    protected TypeClass thisClass = TypeClass.Undefined;
    protected Set<String> thisMethods = new HashSet<String>();

    public TypeClass getTypeClass() {
	return thisClass;
    }

    public Set<String> getMethods() {
	return thisMethods;
    }

    public boolean hasMethod(String method) {
	return thisMethods.contains(method);
    }

    public abstract DataType checkAndRun(Context c, String methodName,
	    List<DataType> l) throws ClassNotImplementedError,
	    IncorrectArgLengthError, IncorrectTypeError;
}
