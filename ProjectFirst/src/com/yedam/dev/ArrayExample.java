package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {

//		int[] intAry = new int[5];
//		intAry[0] = 10;
//		intAry[1] = 15;
//		intAry[2] = 20;
//		intAry[3] = 25;
//		intAry[4] = 30; // 배열크기가 5라서 intAry[5]는 오류남.
//		System.out.println(intAry[0]);//...
//		
//		int[] intAry2 = {1,2,3,4,5}; //선언방법 이렇게도 있음.
//		
//		
//		//sum 변수에 intAry에 들어있는 각각의 합
//		int sum = intAry[0] + intAry[1] + intAry[2]
//				+ intAry[3] + intAry[4];
//		
//		sum = 0;
//		for (int i = 0; i < 5; i++) { //i=0 0부터 시작해야함.
//			System.out.println(intAry[i]);
//			sum += intAry[i]; //for를 이용한 sum 변수에intAry에 들어있는 각각의 합
//		}
		
		//Q. 5,10,15.....50 intAry3에 담아서 나타낼 식을 작성하라
		int[] intAry3 = new int[10];
		for (int i = 0; i < 10; i++) {
			intAry3[i] = 5 * (i +1);
			
		}  
		//출력
		for (int i = 0; i < intAry3.length; i++) {
			System.out.println(intAry3[i]);
		}
	}
}
