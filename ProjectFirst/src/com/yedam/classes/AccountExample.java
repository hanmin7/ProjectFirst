package com.yedam.classes;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //scanner는 읽어오는거 system.in키보드
		Account[] accounts = new Account[100];
		while(true) { //무한반복하겟다. true 하고 break로 빠져나오면ㅇㅇ
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine(); //내가 엔터친 값을 menu에 담겟다
			
			if(menu==1) {
				System.out.println("계좌생성 선택.");
				System.out.println("계좌번호 입력하세요.");
				String ano = scn.nextLine();//string 타입읽어오는거
				System.out.println("예금주 입력하세요.");
				String owner = scn.nextLine();
				System.out.println("금액 입력하세요.");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for(int i=0; i<accounts.length; i++) {
					if(accounts[i] == null) {//다음차례에 넣기위해 널이아니면 넘어가고 널이면 거기에 새로운걸 채움
						accounts[i] = acnt;
						break; //넣고 빠져나와야 함.아니면 계속 쭉 채워넣음
					}
				}
				System.out.println("계좌 생성되었습니다.");
				
			}else if(menu==2) {
				System.out.println("계좌목록 선택.");
				//전체 배열중에 값이 있는 경우에만 출력(null제외)
				for(Account acc : accounts) {
					if(acc != null) {//널이아닐 때만 출력함. 안적으면 널값에대한거 불러온가도 에러남.
					System.out.println("계좌번호: " + acc.getAno() + ", 예금주: " + acc.getOwner() + ", 잔액: " + acc.getBalance());
					
					}
				}
				
			}else if(menu==3) {
				System.out.println("예금 선택.");
				System.out.println("계좌번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("예금액 입력하세요.");
				int balance = scn.nextInt();
				//전체 배열중에 값이 있는 경우(널이아닌경우) && 입력계좌번호와 동일한 건에 처리
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance(); // 새롭게 추가전 현재 잔액
						acc.setBalance(result + balance);
					}
				}
				System.out.println("예금 처리가 되었습니다.");
				
			}else if(menu==4) {
				System.out.println("출금 선택.");
				System.out.println("계좌번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("출금액 입력하세요.");
				int balance = scn.nextInt();
				//전체 배열중에 값이 있는 경우(널이아닌경우) && 입력계좌번호와 동일한 건에 처리
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) { 
						int result = acc.getBalance(); 
						acc.setBalance(result - balance);
					}
				}
				System.out.println("출금 처리가 되었습니다.");
				
			}else if(menu==5) {
				System.out.println("종료 선택.");
				break;
			}
			
		}//while
		System.out.println("프로그램 종료.");
	}
}
