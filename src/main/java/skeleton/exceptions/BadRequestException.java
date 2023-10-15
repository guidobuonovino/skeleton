package skeleton.exceptions;

public class BadRequestException extends Exception {

	private static final long serialVersionUID = -1L;

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(message);
	}
}