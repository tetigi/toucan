package backend.interpreter.data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import backend.interpreter.typeclass.TypeClass;

public abstract class Instance {
    Set<TypeClass> classInstances = new HashSet<TypeClass>();

    public boolean isInstanceOf(TypeClass t) {
	return classInstances.contains(t);
    }

    public abstract DataType runMethod(String method, List<DataType> l);
}
