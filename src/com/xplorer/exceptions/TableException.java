package com.xplorer.exceptions;

public class TableException extends Exception {

	private String message;
	
	public TableException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
