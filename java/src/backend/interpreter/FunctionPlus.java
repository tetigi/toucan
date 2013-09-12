package backend.interpreter;

import java.util.List;

import backend.interpreter.data.TypeInteger;
import backend.interpreter.data.TypeValue;

public class FunctionPlus implements Function {

	@Override
	public TypeValue execute(List<TypeValue> args) {
		if (args.size() != 2) {
			System.out.println("Incorrect number of arguments for +.");
			return null;
		}
		
		TypeValue a = args.get(0);
		TypeValue b = args.get(1);
		
		if (a instanceof TypeInteger  && a.getClass().equals(b.getClass())) {
			TypeInteger aInt = (TypeInteger) a;
			TypeInteger bInt = (TypeInteger) b;
			TypeInteger cInt = new TypeInteger(aInt.getVal() + bInt.getVal());
			return cInt;
		} else {
			System.out.println("Types " + a + " or " + b + " are not compatible types for plus op.");
			return null;
		}
	}
}
