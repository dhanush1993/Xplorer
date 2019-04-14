package com.xplorer.exceptions;

public class DBException extends Exception {
	
	private String message;
	
	public DBException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
