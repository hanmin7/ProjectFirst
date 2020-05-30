package com.yedam.classes.morning;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBall1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] com = new int[3];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					com[i] = (int) (Math.random() * 9) + 1;
					j=-1;
				}
			}
			System.out.print(com[i] + " ");
		}
		System.out.println("\n");
		
		int count = 1;
		int[] user = new int[3];
		while(true) {
			System.out.println(count + "회차 ==========");
			for(int i=0; i<user.length; i++) {
				System.out.println((i+1) + "번째 숫자를 입력하세요");
				user[i]=scn.nextInt();
				
				while(user[i]>=10 || user[i]<=0) {
					System.out.println("1~9사이의 숫자를 입력하세요");
					user[i]=scn.nextInt();
				}
			}
			
			int strike=0;
			int ball=0;
			
			for(int i=0; i<com.length; i++) {
				if(com[i] == user[i]) {
					strike++;
				}
				for (int j=0; j<com.length; j++) {
					if(i != j) {
						if(com[i] == user[j]) {
							ball++;
						}
					}
				}
			}
			if(strike == 3) {
				System.out.println("3 스트라이크 !!  " + count + "회차에 성공!!");
				break;
			}else if(strike==0 && ball==0) {
				System.out.println("----------------------아웃");
			}
			
			System.out.println( Arrays.toString(user) + " 스트라이크: " + strike + " 볼: " + ball);
			System.out.println();

			count++;
			
			if(count == 11) {
				System.out.println("10회 모두 종료 !! 실패!!");				
				break;
			}
		}

	}
}
