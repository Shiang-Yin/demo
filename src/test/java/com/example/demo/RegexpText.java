package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpText {
	
	@Test
	public void text() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J������X:");
		String str = scan.next();
		
		
	}
	
	@Test
	public void text1() {
		String str = "0912-345-678";
		
//	��1	String pattern="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		���W��F��(�Ҧppattern�o�C)�����N�O�r��
//		\d �����¤@�ӱ׽u�A�]����@�@�ӱ׽u���S��r���s�b(\n�A\d)
//		�ҥH�n�A�[�@��\�A����\\d(����r��)
//		���]�n(06)-xxxxx�A�o�Ӫ�(06)���A���O�L�N�q���A�ҥH�n���h�r���A�G�ϥ�\\(
		
//	��2	String pattern="\\d{4}-\\d{3}-\\d{3}";
//		�i��{}�j�A���ΨӪ�ܭ��Ʀr��
		
//	��3
		String pattern="\\d{4}(-\\d{3}){2}";
//		�Τp�A��()�B�z���աA�N�O��u�Ӱ馨�P�@�Ӱϰ�
		System.out.println(str.matches(pattern));
	}
	
	@Test
	public void text2() {
		
//	==================================================	
//		String str = "(02)-12345678";
//		(��X)-�K�X
//		String pattern = "(\\d{2})-\\d{8}";
//		System.out.println(str.matches(pattern));
		
//	=======�H�W�X�Ӫ����G�|�Ofalse========================
		String str = "(02)-12345678";
		String pattern = "\\(\\d{2}\\)-\\d{8}";
		System.out.println(str.matches(pattern));
//		�p����()pattern�������եΡA�O�ݩ󦳷N�q�Ÿ�
//		�ҥH�n���ܦ��L�N�q�Ÿ��A�G�ϥθ���r��(���\\)
//		�X�Ӫ����G�~�|�Otrue
	}
	
	@Test
	public void text3() {
		String pattern = "\\d{2}|\\d{3}";
		String str = "12";
		String str1 = "12 ";
		System.out.println(str.matches(pattern));//true
		System.out.println(str1.matches(pattern));//false
//�H�W�����T�g�k�F�޹D�e�ᤣ�i�H���ť�	
//		===========================================
//		| �޹D�e�ᦳ�ťժ��ܡA��X�N�����n���ťաA���M�N���OFalse
		String pattern1 = "\\d{2} | \\d{3}";
//		��X: 2�X+�ť� �Ϊ� �ť�+�T�X �~�|�ǰt
		String str3 = "12";
		String str4 = "12 ";
		System.out.println(str3.matches(pattern1));//false
		System.out.println(str4.matches(pattern1));//true
		
	}
	
	@Test
	public void text4() {
//		?�ݸ���ܥi���i�L�A�Y0~1��
		String pattern = "John(na)?son";
//		*�P�����0~�h��
		String pattern1 = "John(na)*son";
//		+�a�E���1~�h��
		String pattern2 = "John(na)+son";
//		============================
		String str = "Johnson";
		String str1 = "Johnnason";
		String str2= "Johnnanason";
		
//		============================
		System.out.println(str.matches(pattern));//T
		System.out.println(str.matches(pattern1));//T
		System.out.println(str.matches(pattern2));//F
		System.out.println("============================");
//		==========================================
		System.out.println(str1.matches(pattern));//T
		System.out.println(str1.matches(pattern1));//T
		System.out.println(str1.matches(pattern2));//T
		System.out.println("============================");
//		===========================================
		System.out.println(str2.matches(pattern));//F
		System.out.println(str2.matches(pattern1));//T
		System.out.println(str2.matches(pattern2));//T
		System.out.println("============================");
		
	}
	
	@Test
	public void text5() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�����q�ܹ��");
		String str = scan.next();

		String pattern = "\\d{2}-\\d{7,8}|\\(\\d{2}\\)\\d{7,8}";
		System.out.println(str.matches(pattern));
		
		if (str.matches(pattern)==false) {
			System.out.println("�п�J���T�q�ܸ��X");
			return;
		}
		System.out.printf("%s�������Ĺq�ܸ��X",str);

		
		
	}
	
	@Test
	public void text7() {
		Scanner scan = new Scanner(System.in);
        System.out.println("�����q�ܹ��");
        String str = scan.next();
        
        String pattern = "0[1-9]{1,3}-\\d{7,8}";
        //�N\\d�令[1-9]�Y�i;{13}�@�Ϋe�����@�ӭ�(�Ҧp\\d�Ϊ�[1-9])
        System.out.println(str.matches(pattern));
        
        if (str.matches(pattern)== false) {
        	System.out.println("�п�J���T���ܮ榡");
        	return;
        }
        System.out.printf("%s�������Ĺq�ܸ��X",str);
	}
	

	@Test
	public void text8() {
		Scanner scan = new Scanner(System.in);
        System.out.println("�������ˬd");
        String str = scan.next();
        String pattern = "[A-Za-z][1-2]\\d{8}";
        System.out.println(str.matches(pattern));
        if(str.matches(pattern)==false) {
        	System.out.println("�п�J���T�榡");
        	return;
        }
		System.out.printf("%s�������`������",str);
	}
	
	@Test
	public void text9() {
		Scanner scan = new Scanner(System.in);
        System.out.println("�������ˬd(�ư�����)");
        String str = scan.next();
        String pattern = "[A-Za-z&&[^AaBbDdEeFfHh]][1-2]\\d{8}";
        System.out.println(str.matches(pattern));
        if(str.matches(pattern)==false) {
        	System.out.println("�п�J���T�榡");
        	return;
        }
		System.out.printf("%s�������`������",str);
	}
		
}
