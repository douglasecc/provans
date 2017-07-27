package br.com.decc.data.exception;

public class CharNotFoundException extends Exception {

	private static final long serialVersionUID = -5957315952398833494L;

	public CharNotFoundException() {
		super();
	}
	
	public CharNotFoundException(String message) {
		super(message);
	}

	public CharNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public CharNotFoundException(Throwable cause) {
        super(cause);
    }
}
