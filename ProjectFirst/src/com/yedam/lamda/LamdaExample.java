package com.yedam.lamda;

//클래스만들어서 하는데 그러지않고 
//인터페이스를 구현하기위한 '익명구현객체' 로 표현

public class LamdaExample {
	public static void main(String[] args) {
	//1) 매개값이 없는 인터페이스.
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			// 익명구현객체
			@Override
			public void run() {
				System.out.println("실행.");
			}
		};
		fi.run();

		// 간단한 람다표현식. -> run() 메소드 구현하는 부분.
		MyFunctionalInterface fi2 = () -> 
			System.out.println("실행.");
		fi2.run(); //실행문 하나일 때 괄호도 줄일 수 있음.

	//2)매개값이 있는 인터페이스
		MySumInterface si = new MySumInterface() {

			@Override
			public void sum(int num1, int num2) {
				int result = num1 + num2;
				System.out.println("두 수의 합: " + result);
			}
		};
		si.sum(10, 20);

		
		//람다표현식
		MySumInterface si2 = (num1, num2) -> {
				int result = num1 + num2;
				System.out.println("두 수의 합: " + result);
		};
		si2.sum(10, 20);
		
		
	//3)반환값이 있는 매개값이 있는 인터페이스
		MyMultiInteface mi = new MyMultiInteface() {
			@Override
			public int multi(int num1, int num2) {
				return num1*num2;
			}
		};
		mi.multi(10, 15);
		
		//람다표현식
		MyMultiInteface mi2 = (num1, num2) -> {
			return num1 * num2;
		};
		int result = mi2.multi(10, 15);
		System.out.println("결과값은 : " + result);
		
	}
}
