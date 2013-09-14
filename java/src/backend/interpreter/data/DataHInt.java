package backend.interpreter.data;

import backend.interpreter.instances.InstanceHInt;
import frontend.tokeniser.Token;

public class DataHInt extends DataType {

    private Integer data;

    public DataHInt() {
	type = Type.Int;
	dataInstance = new InstanceHInt();
    }

    public DataHInt(Integer i) {
	this();
	data = i;
    }

    public Integer getData() {
	return data;
    }

    @Override
    public void setFromToken(Token t) {
	data = Integer.parseInt(t.val);
    }
}
