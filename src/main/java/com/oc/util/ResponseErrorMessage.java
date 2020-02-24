package com.oc.util;

import org.springframework.http.HttpStatus;

public class ResponseErrorMessage {

	/**
	 * Description of the property message.
	 */
	private String message;
	/**
	 * Description of the property httpStatus .
	 */
	private HttpStatus httpStatus;

	public ResponseErrorMessage(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
