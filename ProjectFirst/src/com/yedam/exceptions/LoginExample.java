package com.yedam.exceptions;

public class LoginExample {
	public static void main(String[] args) {

		try {
			login("white", "12345");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {

		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않음");
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호 불일치");
		}
	}

}