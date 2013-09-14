package backend.interpreter.typeclass;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;

public class NumClass extends BaseTypeClass {

    public final static String PLUS = "plus";
    public final static String TIMES = "times";

    public NumClass() {
	thisClass = TypeClass.Num;
	thisMethods.add(PLUS);
	thisMethods.add(TIMES);
    }

    @Override
    public DataType checkAndRun(Context c, String methodName, List<DataType> l) {
	switch (methodName) {
	case PLUS:
	case TIMES:
	    if (l.size() == 2) {
		DataType a = l.get(0);
		DataType b = l.get(1);
		if (a.getInstance().isInstanceOf(thisClass)) {
		    if (a.getType() == b.getType()) {
			return a.getInstance().runMethod(methodName, l);
		    }
		}
	    }

	    break;
	}
	System.out.println("ERROR FOR METHOD " + methodName);
	return null;
    }
}
