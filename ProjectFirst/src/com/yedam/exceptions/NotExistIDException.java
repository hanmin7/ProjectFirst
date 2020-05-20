package com.yedam.exceptions;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		System.out.println();
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
