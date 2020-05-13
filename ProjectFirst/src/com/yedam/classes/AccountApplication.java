package com.yedam.classes;

import java.util.Scanner;

//AccountExample -> AccountApplication 메소드 변경 | 실행은 AccountMain에서
public class AccountApplication {
	private Scanner scn = new Scanner(System.in); //ct+sh+o : scanner임포트해줌
	private Account[] accounts = new Account[100];
	//생성자..
	//1.계좌생성
	private void createAccount() {
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
	}
	//2.계좌목록
	private void accoutList() {
		System.out.println("계좌목록 선택.");
		//전체 배열중에 값이 있는 경우에만 출력(null제외)
		for(Account acc : accounts) {
			if(acc != null) {//널이아닐 때만 출력함. 안적으면 널값에대한거 불러온가도 에러남.
			System.out.println("계좌번호: " + acc.getAno() + ", 예금주: " + acc.getOwner() + ", 잔액: " + acc.getBalance());
			
			}
		}
	}
	//3.입금
	private void deposit() {
		System.out.println("예금 선택.");
		System.out.println("계좌번호 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("예금액 입력하세요.");
		int balance = scn.nextInt();
		//전체 배열중에 값이 있는 경우(널이아닌경우) && 입력계좌번호와 동일한 건에 처리
//		for(Account acc : accounts) {
//			if(acc != null && acc.getAno().equals(ano)) {
//				int result = acc.getBalance(); // 새롭게 추가전 현재 잔액
//				acc.setBalance(result + balance);
//			}
//		}
		
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance() + balance);
			System.out.println("예금 처리가 되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
		
	}
	//4.출금
	private void withdrow() {
		System.out.println("출금 선택.");
		System.out.println("계좌번호 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("출금액 입력하세요.");
		int balance = scn.nextInt();
		//전체 배열중에 값이 있는 경우(널이아닌경우) && 입력계좌번호와 동일한 건에 처리
//		for(Account acc : accounts) {
//			if(acc != null && acc.getAno().equals(ano)) { 
//				int result = acc.getBalance(); 
//				acc.setBalance(result - balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance() - balance);
			System.out.println("출금 처리가 되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
		
		
	}
	//5.종료
	
	//6.계좌번호입력하면 해당 Account를 반환해주는 메소드 (계좌목록에 있는 계좌랑 비교해서 목록에 있는 계좌를 불러와서 처리하겠다 틀린계좌처리하지않기위해 findAccount또 만들어서 해봄
	private Account findAccount(String ano) {
		for(Account acc : accounts) {
			if(acc != null && acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null; //int타입이었으면 null값 반환 못함
	}
	//이전에 메인메소드에 해당하는역할. execute만 호출해서 쓸 수 있도록. 위의 애들은 숨긴속성이니까
	//if절안에 함수들 쫙 쓰지않고 메소드 호출로 쓸 수 있도록 하는거(아래)
	public void execute() {
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			
			if(menu==1) { //1.계좌생성
				createAccount();
			} else if(menu==2) { //2.계좌목록
				accoutList();
			} else if(menu==3) { //3.예금
				deposit();
			} else if(menu==4) { //4.출금
				withdrow();
			} else if(menu==5) { //5.종료
				break;
			}
			
		}//while
		System.out.println("프로그램 종료.");
		
	}//execute
	
}//class
