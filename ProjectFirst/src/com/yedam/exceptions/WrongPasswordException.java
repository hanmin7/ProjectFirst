package com.yedam.exceptions;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		System.out.println();
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
