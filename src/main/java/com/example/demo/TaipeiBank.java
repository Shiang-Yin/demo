package com.example.demo;

import java.nio.file.spi.FileSystemProvider;

public class TaipeiBank {

	private String branch; // �ݩ�:����W��

	private String user; // �ݩ�:�Τ�W��

	public int balance; // �ݩ�:�l�B

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
//����srtBalance�]���l�B�|�ܰ�
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//	
	public void saving(int amount) {   //��k:�s��
		if (amount >= 0) {
			this.balance+=amount;
			System.out.printf("%s ���l�B�� %d\n",this.user,this.balance);
		}else {
			System.out.println("��J���B���~�A�п�J����");
			return;
		}
		
	}
	
	public void withdraw(int amount) { //��k:����
		if (amount <= 0) {
			System.out.println("��J���B���~�A�п�J����");
			return;
		}
		if (this.balance<amount) {
			System.out.println("�b��l�B����");
			return;
		}
		
		this.balance -=amount;
		System.out.printf("%s ���l�B�� %d\n",this.user,this.balance);
			
		
		
	}

}

//���]�w�ݩʡA�A�[�J��k


