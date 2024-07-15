package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopText {
	
	private boolean ture;

	@Test
	public void forText() {
		int sum=0;//�p�G�����bfor�j��̭��A(1)�u�Ω�for�^�餺�A��22��hŪ������(2)sum�|�@���q0�}�l�p��
		for(int i=1 ; i <= 5 ; i++) {//�i�b�j��̭������i��ŧi
			System.out.printf("i=%d�Asum=%d \n",i,sum);
			sum+=i;//sum=sum+i�i�Ҽg���Asum+=i
			System.out.printf("i=%d�A�[�`�᪺sum=%d \n",i,sum);
			//i=1�Asum=0+1=1
			//i=2�Asum=1+2=3
			System.out.println("========================");
		}
		System.out.println("�h�Xfor�j��.....");
		System.out.println("sum���`�M��: "+sum);
	}

	@Test
	public void forText2() {
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %2d  ",j,i,(i*j));//%2d�O���Ů�ΡA�Ʀr�a�k�A�[(-)�i�Ͼa��
			}
			System.out.println(" ");//�����
		}
	}
	@Test
	public void whileText() {
		int sum=0;
		int i=1;
		while (i<=5) {
			 
			 sum=sum+i;
			 i++;
//��40�B41��n�`�N����!!�n���ӥL���檺���Ǽg�A�_�h���G�|���@�ˡC
		}System.out.println("sum�`�M�F"+sum);
	}
	
	@Test
	public void whileText2() {
		int i=1;
		
		while(i<=5) {
			int j=1;
			while(j<=5) {
				System.out.printf("%d * %d = %2d  ",j,i,i*j);
				j++;
			}
			i++;
			System.out.println(" ");
		}
	}
	
	@Test
	public void forText3() {
		int sum=0;
		for(int i=1 ; i <= 10 ; i++) {
			if (i==5) {
				break;//���X��Ӱj��
			}
			sum+=i;
			System.out.println("i= "+i);
		}
		System.out.println("sum���`�M��: "+sum);
	}
	
	@Test
	public void forText4() {
		int sum=0;
		for(int i=1 ; i <= 10 ; i++) {
			if (i==5) {
				continue;//���L���j��
			}
			sum+=i;
			System.out.println("i= "+i);
			
		}
		System.out.println("sum���`�M��: "+sum);
	}
	
	@Test
	public void forText1() {
		for (int i=1;i<=9;i++) {
			if(i==5) {
				//break�Mcontinue�A�u�@�Φb���L�̳̪񪺰j��
				//�ҥHbreak/continue�b�o�̸��檺�Oi���j��
				//�i�μ��ҫ��w�n���X���Ӱj��A�b�j��e���H�K�@�Ӧr��+:(�Ҧp: a: for(int...)
				//�M��break�Mcontinue���᭱�n�A�[�W�ڭ̩Ҽg������(break a;)
				break;
			}
			for(int j=1;j<=9;j++) {
				//�p�Gbreak/continue�b�o�̡A���N�O����j���j��
				System.out.printf("%d * %d = %2d  ",j,i,(i*j));//%2d�O���Ů�ΡA�Ʀr�a�k�A�[(-)�i�Ͼa��
			}
			System.out.println(" ");//�����
		}
	}
	
	@Test
	public void guessTest() {
		Scanner scan = new Scanner(System.in);
		int a=70;
		int num;//�O��کҼg���K�X
		for(;;) {
			System.out.println("�п�J1~99�����@�ӼƦr: ");
			num=scan.nextInt();
			if (num<1 || num>99) {
				System.out.println("�Э��s��J�A��J1��99�����Ʀr");
			}
			if (num==70){
				System.out.println("���ߧA�q��F~~~");
				break ;
			}
			
			System.out.println("�q����~�A�q�@���ݬ�~~");
			
		}
		
	}
	
	@Test
	public void guessTest2() {
		Scanner scan = new Scanner(System.in);
		int a=70;
		int num;//�O��کҼg���K�X
		int min=1;
		int max=99;
		
		System.out.println("�п�J1~99�����@�ӼƦr: ");
		for(;;) {
			
			
			num=scan.nextInt();
			
			if (num<min || num>max) {
				System.out.printf("�Э��s��J�A��J%d��%d�����Ʀr\n",min,max);
			}
			if (num==a) {
				System.out.println("���ߧA�q��F~~~");
				break ;
				
			}
			if (num<a) {
					
				if (num>min) {
						
					min=num;
					System.out.printf("��J%2d ~ %2d�����Ʀr \n",min,max);
						
				}
			}else {
				if (num<max) {
						
					max=num;
					System.out.printf("��J%2d ~ %2d�����Ʀr\n",min,max);
				}
				}
			}
			
	}
	
	
	@Test
	public void guessTest3() {
		Scanner scan=new Scanner(System.in);
		int a=(int) (Math.random()*99)+1;
		int num;
		int min=1;
		int max=99;
		System.out.println("�п�J1~99�����@�ӼƦr: ");
		
		for(;;) {
			
			num=scan.nextInt();
			
		if ( num<min || num>max ) {
			
			System.out.printf("�Э��s��J�A��J%2d��%2d�����Ʀr\n",min,max);
			
		}
		if (num==a) {
			
			System.out.println("���ߧA�q��F~~~");
			break ;
			
		}if (num<a) {
			
			if (num>min) {
				
				min=num;
				System.out.printf("��J %2d ~ %2d �����Ʀr \n",min,max);
				
			}
		}else {
			if (num<max) {
			max=num;
			System.out.printf("��J %2d ~ %2d �����Ʀr \n",min,max);
			}
			}
		}
	}	
	
	@Test
	public void guessTest4() {
		Scanner scan=new Scanner(System.in);
		int guess=(int)(Math.random()*99)+1;
		System.out.println("�H���Ʀr��: "+guess);
		int min=1;
		int max=99;
		System.out.println("�п�J1~99�����Ʀr");
		while(ture) {
			int num=scan.nextInt();
			System.out.printf("�п�J%2d ~ %2d �����Ʀr \n",min,max);
			
			
			if (num<min || num>max) {
				System.out.printf("�Ʀr�W�X�d��A�п�J�b%2d ~%2d ��\n",min,max);
			}else if(num==guess) {
				System.out.println("���߲q��F~~");
			}else if (num>guess) {
				num=min;
			}else {
				num=max;
			}
				
			}
		}
	
	@Test
	public void arrayTest1() {
		Scanner scan=new Scanner(System.in);
		
	}
}
