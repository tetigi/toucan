package backend.interpreter.data;

import backend.interpreter.instances.InstanceHString;
import frontend.tokeniser.Token;

public class DataHString extends DataType {

    String data = "";

    public DataHString() {
	type = Type.String;
	dataInstance = new InstanceHString();
    }

    public DataHString(String s) {
	this();
	data = s;
    }

    @Override
    public void setFromToken(Token t) {
	data = t.val;
    }

    public String getData() {
	return data;
    }

}
