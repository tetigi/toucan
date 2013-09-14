package backend.interpreter.data;

import frontend.tokeniser.Token;

public abstract class DataType {
    Type type = Type.Undefined;
    Instance dataInstance;

    public Type getType() {
	return type;
    }

    public Instance getInstance() {
	return this.dataInstance;
    }

    public abstract void setFromToken(Token t);
}
