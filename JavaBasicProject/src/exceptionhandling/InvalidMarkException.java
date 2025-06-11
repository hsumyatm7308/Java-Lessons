package exceptionhandling;

public class InvalidMarkException extends Exception {
	public String toString() {
		return "Give meark is in range 0 - 100";
	}

}
