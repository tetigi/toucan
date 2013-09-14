package backend.interpreter.exceptions;

public class IncorrectArgLengthError extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 7617673752078725157L;

    public IncorrectArgLengthError(String string) {
	super(string);
    }

}
