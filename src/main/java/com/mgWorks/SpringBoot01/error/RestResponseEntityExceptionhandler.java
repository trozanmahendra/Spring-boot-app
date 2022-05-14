package com.mgWorks.SpringBoot01.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mgWorks.SpringBoot01.entity.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionhandler extends ResponseEntityExceptionHandler {
	@Autowired
	private ErrorMessage errorMessage;

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> studentNotfoundException(StudentNotFoundException exception,
			WebRequest request) {
		errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);

	}

}
