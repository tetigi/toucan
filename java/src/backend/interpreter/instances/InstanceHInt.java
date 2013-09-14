package backend.interpreter.instances;

import java.util.List;
import java.util.logging.Logger;

import backend.interpreter.data.DataHBool;
import backend.interpreter.data.DataHInt;
import backend.interpreter.data.DataHString;
import backend.interpreter.data.DataType;
import backend.interpreter.typeclass.EqClass;
import backend.interpreter.typeclass.NumClass;
import backend.interpreter.typeclass.ShowClass;
import backend.interpreter.typeclass.TypeClass;

public class InstanceHInt extends Instance {

    private static Logger LOGGER = Logger.getLogger(InstanceHInt.class.getName());
    
    public InstanceHInt() {
	classInstances.add(TypeClass.Num);
	classInstances.add(TypeClass.Show);
	classInstances.add(TypeClass.Eq);
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
	case NumClass.MINUS:
	    a = (DataHInt) args.get(0);
	    b = (DataHInt) args.get(1);

	    return new DataHInt(a.getData() - b.getData());
	case NumClass.NEGATE:
	    a = (DataHInt) args.get(0);

	    return new DataHInt(-a.getData());
	case NumClass.ABS:
	    a = (DataHInt) args.get(0);

	    return new DataHInt(Math.abs(a.getData()));
	case NumClass.SIGNUM:
	    a = (DataHInt) args.get(0);

	    return new DataHInt(a.getData() / Math.abs(a.getData()));
	case NumClass.FROM_INTEGER:
	    return args.get(0);

	// SHOW CLASS
	case ShowClass.SHOW:
	    a = (DataHInt) args.get(0);

	    return new DataHString(a.getData().toString());
	
	// EQ CLASS
	case EqClass.EQ:
	    a = (DataHInt) args.get(0);
	    b = (DataHInt) args.get(1);
	    
	    return new DataHBool(a.getData() == b.getData());
	case EqClass.NEQ:
	    a = (DataHInt) args.get(0);
	    b = (DataHInt) args.get(1);
	    
	    return new DataHBool(a.getData() != b.getData());
	}

	LOGGER.severe("Could not run method " + method + " in class Int");
	return null;
    }
}
