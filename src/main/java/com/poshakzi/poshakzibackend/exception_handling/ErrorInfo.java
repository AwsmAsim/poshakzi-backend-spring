package com.poshakzi.poshakzibackend.exception_handling;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.http.HttpStatus;

public class ErrorInfo {

	private String errorMessage;
	private HttpStatus errorCode;
	private LocalDate timeStamp;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	public HttpStatus getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(errorCode, errorMessage, timeStamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorInfo other = (ErrorInfo) obj;
		return errorCode == other.errorCode && Objects.equals(errorMessage, other.errorMessage)
				&& Objects.equals(timeStamp, other.timeStamp);
	}
	
	@Override
	public String toString() {
		return "ErrorInfo [errorMessage=" + errorMessage + ", errorCode=" + errorCode + ", timeStamp=" + timeStamp
				+ "]";
	}
	
	
	
	
}

