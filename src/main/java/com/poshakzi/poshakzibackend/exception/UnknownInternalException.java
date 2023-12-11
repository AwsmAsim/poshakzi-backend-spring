package com.poshakzi.poshakzibackend.exception;

public class UnknownInternalException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownInternalException(String errorName) {
		super(errorName);
	}

}
