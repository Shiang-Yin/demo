package com.example.demo;

public interface Fly {
	
//	�b�������w�q���Ҧ���k�A�w�]�ȳ��O��H��k(abstract�i�H�ٲ�)�A�ҥH���঳�j�A��{}
//	public abstract void fly();
	public void flying();
	
//	�����w�q����k���A�p�G�[�Wdefault�ɡA�@�w�n����@���e�[�W�j�A��{}�A���P��"�w�]��k"
//	default���@�w�n���s�w�q(override)
	public default void flying2() {
		System.out.println("�n�Q��...");
	}
	
//	static�@�w�ݭn�@��{body}
//	����Qoverride�A(����Qoverride�����T��(1)static(2)final(3)�غc��k)
//	�ϥΤ�k�AFly.flying3();
	public static void flying3() {
		System.out.println("�u���ӷQ���F...");
	}
	
	

}
