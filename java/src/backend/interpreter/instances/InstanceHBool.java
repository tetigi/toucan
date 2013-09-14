package backend.interpreter.instances;

import java.util.List;

import backend.interpreter.data.DataHBool;
import backend.interpreter.data.DataHString;
import backend.interpreter.data.DataType;
import backend.interpreter.typeclass.EqClass;
import backend.interpreter.typeclass.ShowClass;
import backend.interpreter.typeclass.TypeClass;

public class InstanceHBool extends Instance {

    public InstanceHBool() {
	classInstances.add(TypeClass.Show);
	classInstances.add(TypeClass.Eq);
    }
    
    @Override
    public DataType runMethod(String method, List<DataType> l) {
	DataHBool a, b;
	switch (method) {
	// SHOW CLASS
	case ShowClass.SHOW:
	    a = (DataHBool) l.get(0);
	    
	    return new DataHString(a.getData() ? "True" : "False");

	// EQ CLASS
	case EqClass.EQ:
	    a = (DataHBool) l.get(0);
	    b = (DataHBool) l.get(1);
	    
	    return new DataHBool(a.getData() == b.getData());
	case EqClass.NEQ:
	    a = (DataHBool) l.get(0);
	    b = (DataHBool) l.get(1);
	    
	    return new DataHBool(a.getData() != b.getData());
	}
	return null;
    }

}
