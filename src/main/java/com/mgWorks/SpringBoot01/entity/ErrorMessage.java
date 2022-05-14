package com.mgWorks.SpringBoot01.entity;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@Component
public class ErrorMessage {
	private HttpStatus status;
	private String message;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

}
