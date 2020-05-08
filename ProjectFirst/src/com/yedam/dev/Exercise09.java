package com.yedam.dev;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scn.nextInt();scn.nextLine(); //1+엔터 엔터가 다음에 넘어가버려서넥스트라인넣어줌. 라인옆에서 커서있으라고
			if(selectNo == 1) {
				System.out.print("학생수를 입력하세요.");
				studentNum = scn.nextInt();
				scores = new int[studentNum]; //new int[5];
				System.out.println("배열이 생성되었습니다.");
			} else if (selectNo == 2) {
				int i = 0;
				for(int score : scores) {
					System.out.print("점수를 입력하세요.");
					score = scn.nextInt();
					scores[i++] = score;
				}
		    } else if (selectNo == 3) {
		    	for(int i=0; i<scores.length; i++) {
		    		System.out.println("scores[ " + i + " ] : " + scores[i]);
		    	}
		    } else if (selectNo == 4) {
		    	//합계, 평균 나와야함
		    	int sum = 0;
//		    	int cnt = 0;
		    	for(int score : scores) {
		    		sum += score;
//		    		cnt++;
		    	}
		    	double avg = (double) sum / scores.length;
//		    	double avg = (double) sum / cnt;
		    	
		    	int maxValue = Integer.MIN_VALUE;
		    	for(int score: scores) {
		    		if(score > maxValue)
		    		maxValue = score;
		    	}
		    	
		    	System.out.println("합계는 : " + sum);
		    	System.out.println("평균은 : " + avg);
		    	System.out.println("최고점수는 : " + maxValue);
		    	
		    } else if (selectNo == 5) {
		    	run = false;
		    }//if

		}//while
		System.out.println("프로그램 종료");
	}//main
}//class
