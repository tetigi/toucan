package backend.interpreter.data;

import java.util.List;

import backend.interpreter.typeclass.NumClass;
import backend.interpreter.typeclass.ShowClass;
import backend.interpreter.typeclass.TypeClass;

public class InstanceHInt extends Instance {

    public InstanceHInt() {
	classInstances.add(TypeClass.Num);
	classInstances.add(TypeClass.Show);
    }

    @Override
    public DataType runMethod(String method, List<DataType> args) {
	DataHInt a, b;
	switch (method) {
	// NUM CLASS
	case NumClass.PLUS:
	    a = (DataHInt) args.get(0);
	    b = (DataHInt) args.get(1);

	    return new DataHInt(a.getData() + b.getData());
	case NumClass.TIMES:
	    a = (DataHInt) args.get(0);
	    b = (DataHInt) args.get(1);

	    return new DataHInt(a.getData() * b.getData());

	    // SHOW CLASS
	case ShowClass.SHOW:
	    a = (DataHInt) args.get(0);

	    return new DataHString(a.getData().toString());
	}

	System.out.println("Could not run method " + method);
	return null;
    }
}
