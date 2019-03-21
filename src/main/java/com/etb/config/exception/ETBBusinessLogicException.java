/**
 * 
 */
package com.etb.config.exception;

/**
 * @author Rakesh Singh
 *
 */
public class ETBBusinessLogicException extends Exception{


	private static final long serialVersionUID = 8898714171390175625L;
	
	private String code;
	
	public ETBBusinessLogicException(String code, String message){
		
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	

}