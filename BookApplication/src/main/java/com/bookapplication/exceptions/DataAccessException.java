package com.bookapplication.exceptions;

public class DataAccessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataAccessException(String message) {
		super(message);
	}
}
