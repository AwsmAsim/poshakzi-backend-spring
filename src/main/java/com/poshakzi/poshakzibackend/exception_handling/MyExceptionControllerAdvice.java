package com.poshakzi.poshakzibackend.exception_handling;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.poshakzi.poshakzibackend.exception.NoDataFoundException;
import com.poshakzi.poshakzibackend.exception.UnknownInternalException;

//@RestControllerAdvice
public class MyExceptionControllerAdvice {
	
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorInfo> noDataHandler(NoDataFoundException exception){
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.NO_CONTENT);
		errorInfo.setErrorMessage(exception.getMessage());
		errorInfo.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.NO_CONTENT);
		
	}
	
	
	@ExceptionHandler(UnknownInternalException.class)
	public ResponseEntity<ErrorInfo> unknownInternalExceptionHandler(UnknownInternalException exception){
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR);
		errorInfo.setErrorMessage(exception.getMessage());
		errorInfo.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}


}
