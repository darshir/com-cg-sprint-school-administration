   
package com.cg.sprint.school.administration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class IncorrectLoginCredentialsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IncorrectLoginCredentialsException(String str) {
		super(str);
		
	}

}