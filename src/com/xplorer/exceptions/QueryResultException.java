package com.xplorer.exceptions;

public class QueryResultException extends Exception {
	
	private String message;
	
	public QueryResultException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
