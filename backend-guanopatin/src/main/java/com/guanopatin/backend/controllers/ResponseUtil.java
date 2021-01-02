package com.guanopatin.backend.controllers;

import org.springframework.http.HttpStatus;

public class ResponseUtil {
	private String message;
	private HttpStatus status;
	private Object content;
	
	
	
	public ResponseUtil(String message, HttpStatus status, Object content) {
		super();
		this.message = message;
		this.status = status;
		this.content = content;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
