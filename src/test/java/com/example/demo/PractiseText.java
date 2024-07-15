package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class PractiseText {
	
	@Test
	public void practise1() {
		int x=10;
		System.out.println(x);		//10
		System.out.println(x++*10); //100
		System.out.println(x);		//11
		System.out.println(x++*10);	//110
		System.out.println(x);		//12
		int y = 20;
		System.out.println(y);		//20
		System.out.println(++y*10);	//21*10=210
		System.out.println(y);		//21
		System.out.println(++y*10);	//(21+1)*10=220
		System.out.println(y);		//22
		
	}
	
	@Test
	public void practise2() {
		
		int x=3;
		int[] z=new int[x];
		z[0]=z[1]=z[2]=2;
		int sun=z[0]+z[1]+z[2];
		System.out.println(sun);
		
	}
	
	@Test
	public void practise3() {
		Scanner scan=new Scanner(System.in);
//		���߰ݬ�����٬O�ؤ�
		System.out.println("�w�ഫ�ū׬��ؤ�(c)�٬O���(f)�A\n�п�Jc/f:");
		String choose=scan.next();
//		�A�߰ݷū�
		System.out.println("�п�J�ū�");
		float temp=scan.nextFloat();
		if(choose.equals("c")) {
//			�ؤ�ū� = ���ū� * 9 / 5 + 32
			float c=temp*9/5+32;
			System.out.printf("���%.2f��c�ର\n�ؤ�ū׬�%.2f��F",temp,c);
			
		}else if(choose.equals("f")){
//			���ū� = ( �ؤ�ū� �V 32 ) * 5 / 9
			float f=(temp-32)*5/9;
			System.out.printf("�ؤ�%.2f��F�ର\n���ū׬�%.2f��c",temp,f);
			
		}else {
			System.out.println("��J���~�A�п�Jc��f");
		}
		
	}
	
	@Test
	public void practise4() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�w�ഫ�ū׬��ؤ�(c)�٬O���(f)�A\n�п�Jc/f:");
		String choose=scan.next();
		if(!choose.equals("c")&& !choose.equals("f")) {
			System.out.println("��J���~�A�п�Jc/f(�����j�p�g)");
			return;
		}
		System.out.println("�п�J�ū�");
		float temp=scan.nextFloat();
		
		if(choose.equals("c")) {
//			�ؤ�ū� = ���ū� * 9 / 5 + 32
			float c=temp*9/5+32;
			System.out.printf("���%.2f��c�ର\n�ؤ�ū׬�%.2f��F",temp,c);
			
		}else {
//			���ū� = ( �ؤ�ū� �V 32 ) * 5 / 9
			float f=(temp-32)*5/9;
			System.out.printf("�ؤ�%.2f��F�ର\n���ū׬�%.2f��c",temp,f);
		}
			
	}
		
	@Test
//	�D���t�ƦC
	public void practise5() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr: ");
		int x=scan.nextInt();
		int s=((1+x)*x)/2;
		System.out.printf("1��%d���`�X��%d",x,s);
		
	}
//	�p���`�M
	@Test
	public void practise6() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr: ");
		int x=scan.nextInt();
		int sun=0;
		for(int i=0;i<=x;i++) {
			sun+=i;
			
		}
		System.out.printf("�p��X�A1~%d���`�X��: %d\n",x,sun);
		
	}
	
//	���ߦPŢ
	@Test
	public void practise7() {
		int h=35; //h����Y���`�ƶq
		int l=100; //l��ܸ}���`��
		int c=0;
		int r=0;
		
		for(c=0;c<=h;c++) {
			r=h-c;//�p���Y
			if((c*2+r*4)== l) {
				break;
			}
			System.out.println("�L�k�p��");
		}
		
		System.out.printf("���`�@��%2d��\n�ߤl�@��%2d��",c,r);
	}
	
//	�ϥο�J�A�p�����ߦPŢ���D
	@Test
	public void practise8() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���]�Y���`�Ʀ��X��?");
		int h=scan.nextInt(); //h����Y���`�ƶq
		System.out.println("���]�}���`�Ʀ��X��?");
		int l=scan.nextInt(); //l��ܸ}���`��
		int c=0;
		int r=0;
		
		for(c=0;c<=h;c++) {
			r=h-c;//�p���Y
			if((c*2+r*4)== l) {
				System.out.printf("���`�@��%2d��\n�ߤl�@��%2d��",c,r);
				break;
			}
		}
		if((c*2+r*4)!= l) {
			System.out.println("�L�k����");
			return;
		}
	}
	
	@Test
	public void Test() {
		Scanner scan =new Scanner(System.in);
		System.out.println("�п�J�Ĥ@�ӼƦr:");
		int x=scan.nextInt();
		System.out.println("�п�J�ĤG�ӼƦr:");
		int y=scan.nextInt();
		System.out.println("x/y����: "+x/y);
		
	}
	
	
	

}
