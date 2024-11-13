
public class StringTooLongException extends Throwable{
	private String message;
	
	public StringTooLongException(String message) {
		setMessage(message);
	}

	/**
	 * @return the current value of message
	 */
	public String getMessage() {
		return message;
	}//end getMessage

	/**
	 * @param message the value of message to be set
	 */
	public void setMessage(String message) {
		this.message = message;
	}//end setMessage
}
