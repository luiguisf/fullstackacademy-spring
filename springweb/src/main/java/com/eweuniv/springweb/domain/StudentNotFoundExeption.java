package com.eweuniv.springweb.domain;

public class StudentNotFoundExeption extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StudentNotFoundExeption(String message) {
		super(message);
	}
	
}
