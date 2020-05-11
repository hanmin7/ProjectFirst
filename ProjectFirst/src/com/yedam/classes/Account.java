package com.yedam.classes;

public class Account {
	private String ano;//계좌번호
	private String owner;//예금주
	private int balance;//잔액
	//소스-밑에서세번째 어쩌구 유징필드
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter and setter
	public String getAno() {
		return ano; //계좌번호 가져옴
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
