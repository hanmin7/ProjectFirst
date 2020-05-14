package com.yedam.exceptions;

public class NullPointException {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		} catch (NullPointerException e) {
			System.out.println("실행중 오류가 발생.");
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
			e.printStackTrace();
//			클래스낫파운드어쩌구 다 안적고도 가장 최상위가 catch (Exception e) 써도 됨
		}
		//예외처리 try catch ...
		
		System.out.println("프로그램 종료.");
	}
}
