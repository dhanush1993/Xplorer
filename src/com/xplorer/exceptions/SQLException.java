package com.xplorer.exceptions;

public class SQLException extends Exception {
	private String message;
	
	public SQLException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
