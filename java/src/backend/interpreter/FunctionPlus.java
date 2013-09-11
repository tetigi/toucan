package backend.interpreter;

import java.util.List;

public class FunctionPlus implements Function {

	@Override
	public TypeValue execute(List<TypeValue> args) {
		if (args.size() != 2) {
			System.out.println("Incorrect number of arguments for +.");
		}
		return null;
	}

}
