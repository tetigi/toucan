package backend.interpreter.data;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import backend.interpreter.exceptions.NoSuchMethodForClassError;
import backend.interpreter.exceptions.NoSuchMethodForTokenError;
import backend.interpreter.typeclass.BaseTypeClass;
import backend.interpreter.typeclass.NumClass;
import backend.interpreter.typeclass.ShowClass;
import frontend.tokeniser.TokeniserSym;

public class Context {
    Map<Integer, String> tokenToMethodMap = new HashMap<Integer, String>();
    Map<String, BaseTypeClass> methodToClassMap = new HashMap<String, BaseTypeClass>();

    public void init() {
	// Add tokens REFLECTION DUN DUN DUUUUN
	/* Not really needed anymore :( Will keep for future reference.
	Field[] fields = TokeniserSym.class.getFields();
	for (Field f : fields) {
	    try {
		tokenToMethodMap.put(f.getInt(null), f.getName().toLowerCase());
	    } catch (IllegalArgumentException | IllegalAccessException e) {
		System.out.println("Couldn't get fields during initiation.");
		e.printStackTrace();
	    }
	} */

	// Add classes

	// NumClass
	NumClass num = new NumClass();
	insertAllMethods(num);

	// ShowClass
	ShowClass show = new ShowClass();
	insertAllMethods(show);
    }

    private void insertAllMethods(BaseTypeClass b) {
	for (String method : b.getMethods())
	    methodToClassMap.put(method, b);
    }

    public String getAssocMethod(Integer id) throws NoSuchMethodForTokenError {
	if (tokenToMethodMap.containsKey(id)) {
	    return tokenToMethodMap.get(id);
	} else {
	    throw new NoSuchMethodForTokenError(
		    "Could not find method for token id: " + id);
	}
    }

    public BaseTypeClass getAssocTypeClass(String methodName)
	    throws NoSuchMethodForClassError {
	if (methodToClassMap.containsKey(methodName)) {
	    return methodToClassMap.get(methodName);
	} else {
	    throw new NoSuchMethodForClassError(
		    "Could not find class for method " + methodName);
	}
    }

}
