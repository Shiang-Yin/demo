package com.example.demo;

import java.nio.file.spi.FileSystemProvider;

public class TaipeiBank {

	private String branch; // 屬性:分行名稱

	private String user; // 屬性:用戶名稱

	public int balance; // 屬性:餘額

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}
//拿掉srtBalance因為餘額會變動
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//	
	public void saving(int amount) {   //方法:存款
		if (amount >= 0) {
			this.balance+=amount;
			System.out.printf("%s 的餘額有 %d\n",this.user,this.balance);
		}else {
			System.out.println("輸入金額有誤，請輸入正數");
			return;
		}
		
	}
	
	public void withdraw(int amount) { //方法:提款
		if (amount <= 0) {
			System.out.println("輸入金額有誤，請輸入正數");
			return;
		}
		if (this.balance<amount) {
			System.out.println("帳戶餘額不足");
			return;
		}
		
		this.balance -=amount;
		System.out.printf("%s 的餘額有 %d\n",this.user,this.balance);
			
		
		
	}

}

//先設定屬性，再加入方法


