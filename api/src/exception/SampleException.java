package exception;

/**
 * @FileName : SampleException.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 29.
 * @Time    :오후 2:37:34
 */
public class SampleException extends RuntimeException {
	
	public SampleException() {}
	public SampleException(String message) { 
		super(message); 
	}
	public SampleException(String message, Throwable cause) { 
		super(message, cause); 
	}

}
