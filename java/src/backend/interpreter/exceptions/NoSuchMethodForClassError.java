package backend.interpreter.exceptions;

public class NoSuchMethodForClassError extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 5163533767828591925L;

    public NoSuchMethodForClassError(String string) {
	super(string);
    }

}
