package week3.day4;

public class PositionTooLargeException extends Exception {
	
	// no arguments constructor
	public PositionTooLargeException() {
		super();
	}
	
	public PositionTooLargeException(String message) {
		super(message);
	}
}
