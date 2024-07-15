package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void iftext() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		if (x>y){
			System.out.println("��J���Ĥ@�ӼƦr��ĤG�ӼƦr�j");
			}
		}
	@Test
	public void ifElseText() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String str="";
		if (x>y){
//			System.out.println("�Ĥ@�ӼƦr��ĤG�ӼƦr�j");
			str="�Ĥ@�ӼƦr��ĤG�ӼƦr�j";
			return;
			}else {
//				System.out.println("false");
				str="false";
			}
		System.out.println(str);
		System.out.println("================");//�p�G������o�@��i�b�e���[�Wreturn
	}
	
	@Test
	public void ifElseifElseText() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J�A���~��: ");
		int age=scan.nextInt();//�ϥ�nextInt�A�b��(alt+/)
		int tickit=100;
		if (age<=6 || age>=80){
			System.out.println("�A��������(���): "+ tickit*0.2);
		}else if (age<=12 || age>=60) {
			//�]�i�g(age>=7 && age<=12)||(age>=60 && age<=79)
			System.out.println("�A��������(����): "+tickit*0.5);
		}else {
			System.out.println("�A��������: "+tickit);
		}
	}
	
	@Test
	public void ifElseText2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String str=x>y ? "�Ĥ@�ӼƦr��ĤG�ӼƦr�j" : "false";
//		if (x>y){
//			System.out.println("�Ĥ@�ӼƦr��ĤG�ӼƦr�j");
//			return;
//			}else {
//				System.out.println("false");
//			}
		System.out.println(str);
	}
	
	@Test
	public void if2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���g�uŪ�ɼƬ��F ");
		int hr=scan.nextInt();
		int A = hr*150;	
		//hr*150*0.8 �p�⵲�G����ƫ��A�|�Odouble(���p���I)
		//�n�h���p���I�u��ܾ�ơA�N�n�N�p�⵲�G�নint
		//�p���I�ন��ơA�u����ơA���ޤp���I���h��(�L����˱�)
		if (hr<40) {
			System.out.println("�p��40�p��(0.8��):"+(int)A*0.8+" ��");
			//�w�]��double�A�G��J(int)���L�ŧi
		}else if(hr==40) {
			System.out.println("����40�p��: "+A+" ��");
		}else if(hr>40 && hr<=50) {
			System.out.println("�j��40�p��50(1.2��): "+A*1.5+" ��");
		}else {
			System.out.println("�j��50�H�W(1.6��): "+A*1.6+" ��");
		}
	}
	
	@Test
	public void if3() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���լO�_���|�~? ");
		int years=scan.nextInt();
		double a=years%4;
		double b=years%100;
		double c=years%400;
		if(a==0) {
			if(b != 0 || c == 0) {
				System.out.println("��~"+years+" ���|�~");
			}else {
				System.out.println("�D�|�~");
			}
		}else {
			System.out.println("�D�|�~");
		}

	}
	
	@Test
	public void test() {
		System.out.println(90%10);//9
		System.out.println(99%10);//9(�L�p���I)
		System.out.println((double)99/10);//9.9
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J���Z: ");
		int score=scan.nextInt();
		switch (score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			
			default:
				System.out.println("F");
			
		
		}
	}
	
	@Test
	public void week7() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�X�ѫ�? ");
		int day=scan.nextInt();
		switch(day%7) {
		case 1:
			System.out.println("�P���@");
			break;
		case 2:
			System.out.println("�P���G");
			break;
		case 3:
			System.out.println("�P���T");
			break;
		case 4:
			System.out.println("�P���|");
			break;
		case 5:
			System.out.println("�P����");
			break;
		case 6:
			System.out.println("�P����");
			break;
		default:
			System.out.println("�P����");
			
		}
	}
	
	@Test
	public void week5() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�X�ѫ�? ");
		int day=scan.nextInt();
		switch((5+day)%7) {
		case 1:
			System.out.println("�P���@");
			break;
		case 2:
			System.out.println("�P���G");
			break;
		case 3:
			System.out.println("�P���T");
			break;
		case 4:
			System.out.println("�P���|");
			break;
		case 5:
			System.out.println("�P����");
			break;
		case 6:
			System.out.println("�P����");
			break;
		default:
			System.out.println("�P����");
			
		}
	}
	
	@Test
	public void dayX() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���ѬP��?  ");
		int date=scan.nextInt();
		if (date<1 || date>7) {//�ư��k
			System.out.println("�W�L�P���d��A�ж�g1~7");
			return;
		}
		System.out.println("�X�ѫ�P��? ");
		int day=scan.nextInt();
		switch((date+day)%7) {
		case 1:
			System.out.println("�P���@");
			break;
		case 2:
			System.out.println("�P���G");
			break;
		case 3:
			System.out.println("�P���T");
			break;
		case 4:
			System.out.println("�P���|");
			break;
		case 5:
			System.out.println("�P����");
			break;
		case 6:
			System.out.println("�P����");
			break;
		default:
			System.out.println("�P����");
			
		}
	}
	
	
	@Test//�t��
	public void dayX1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���ѬP��?  ");
		int date=scan.nextInt();
		if (date<1 || date>7) {
			System.out.println("�W�L�P���d��A�ж�g1~7");
			return;
		}
		System.out.println("�X�ѫ�P��? ");
		int day=scan.nextInt();
		int x=(date+day)%7;
		switch(x) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 0:
			System.out.printf("���ѬP��%d�A%d�ѫ�O�P��%d",date,day,x);
			break;
		}
	}
}
