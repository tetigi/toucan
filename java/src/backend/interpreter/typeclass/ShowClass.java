package backend.interpreter.typeclass;

import java.util.List;

import backend.interpreter.data.Context;
import backend.interpreter.data.DataType;

public class ShowClass extends BaseTypeClass {

    public final static String SHOW = "show";

    public ShowClass() {
	thisClass = TypeClass.Show;
	thisMethods.add(SHOW);
    }

    @Override
    public DataType checkAndRun(Context c, String methodName, List<DataType> l) {
	switch (methodName) {
	case SHOW:
	    if (l.size() == 1) {
		DataType a = l.get(0);
		if (a.getInstance().isInstanceOf(thisClass)) {
		    return a.getInstance().runMethod(methodName, l);
		}
	    }

	    break;
	}
	System.out.println("ERROR FOR METHOD " + methodName);
	return null;
    }
}
