package com.poshakzi.poshakzibackend.exception;

public class NoDataFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoDataFoundException(String errorName) {
		super(errorName);
	}

}
