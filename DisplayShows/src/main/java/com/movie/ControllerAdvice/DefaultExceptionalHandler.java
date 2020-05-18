package com.movie.ControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultExceptionalHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> somethingWentWrong(Exception ex){
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Something went wrong");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

class ErrorMessage{
	private String message;
	private String details;
	public ErrorMessage(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ErrorMessage() {
		super();
	}
}
}
