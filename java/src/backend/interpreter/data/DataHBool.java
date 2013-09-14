package backend.interpreter.data;

import backend.interpreter.instances.InstanceHBool;
import frontend.tokeniser.Token;

public class DataHBool extends DataType {

    Boolean data;
    
    public DataHBool(boolean b) {
	data = b;
	dataInstance = new InstanceHBool();
    }

    @Override
    public void setFromToken(Token t) {
	data = Boolean.parseBoolean(t.val.toLowerCase());
    }
    
    public Boolean getData() {
	return data;
    }

}
