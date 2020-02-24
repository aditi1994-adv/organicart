package com.oc.util;

import org.springframework.http.HttpStatus;

/**
 * Gives response in particular format for the API.
 */
public class ResponseMessage {

	/**
	 * Description of the property message.
	 */
	private String message;
	/**
	 * Description of the property httpStatus .
	 */
	private HttpStatus httpStatus;
	/**
	 * Description of the property object from Object class.
	 */
	private Object objDetail;
	
	
	
	public Object getObjDetail() {
		return objDetail;
	}

	public void setObjDetail(Object objDetail) {
		this.objDetail = objDetail;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseMessage(String message, HttpStatus httpStatus, Object objDetail) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.objDetail = objDetail;
	}

	

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	
}
