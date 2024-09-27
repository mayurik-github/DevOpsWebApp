package com.example.userscrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class MultipleUserException extends RuntimeException {

	private static final long serialVersionUID = -830174533937128458L;


	public MultipleUserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
