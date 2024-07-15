package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopText {
	
	private boolean ture;

	@Test
	public void forText() {
		int sum=0;//如果此行放在for迴圈裡面，(1)只用於for回圈內，第22行則讀取不到(2)sum會一直從0開始計算
		for(int i=1 ; i <= 5 ; i++) {//可在迴圈裡面直接進行宣告
			System.out.printf("i=%d，sum=%d \n",i,sum);
			sum+=i;//sum=sum+i可所寫成，sum+=i
			System.out.printf("i=%d，加總後的sum=%d \n",i,sum);
			//i=1，sum=0+1=1
			//i=2，sum=1+2=3
			System.out.println("========================");
		}
		System.out.println("退出for迴圈.....");
		System.out.println("sum的總和為: "+sum);
	}

	@Test
	public void forText2() {
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %2d  ",j,i,(i*j));//%2d是做空格用，數字靠右，加(-)可使靠左
			}
			System.out.println(" ");//換行用
		}
	}
	@Test
	public void whileText() {
		int sum=0;
		int i=1;
		while (i<=5) {
			 
			 sum=sum+i;
			 i++;
//第40、41行要注意順序!!要按照他執行的順序寫，否則結果會不一樣。
		}System.out.println("sum總和；"+sum);
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
				break;//跳出整個迴圈
			}
			sum+=i;
			System.out.println("i= "+i);
		}
		System.out.println("sum的總和為: "+sum);
	}
	
	@Test
	public void forText4() {
		int sum=0;
		for(int i=1 ; i <= 10 ; i++) {
			if (i==5) {
				continue;//跳過當次迴圈
			}
			sum+=i;
			System.out.println("i= "+i);
			
		}
		System.out.println("sum的總和為: "+sum);
	}
	
	@Test
	public void forText1() {
		for (int i=1;i<=9;i++) {
			if(i==5) {
				//break和continue，只作用在離他們最近的迴圈
				//所以break/continue在這裡跳脫的是i的迴圈
				//可用標籤指定要跳出哪個迴圈，在迴圈前面隨便一個字母+:(例如: a: for(int...)
				//然後break和continue的後面要再加上我們所寫的標籤(break a;)
				break;
			}
			for(int j=1;j<=9;j++) {
				//如果break/continue在這裡，那就是跳脫j的迴圈
				System.out.printf("%d * %d = %2d  ",j,i,(i*j));//%2d是做空格用，數字靠右，加(-)可使靠左
			}
			System.out.println(" ");//換行用
		}
	}
	
	@Test
	public void guessTest() {
		Scanner scan = new Scanner(System.in);
		int a=70;
		int num;//記住我所寫的密碼
		for(;;) {
			System.out.println("請輸入1~99中的一個數字: ");
			num=scan.nextInt();
			if (num<1 || num>99) {
				System.out.println("請重新輸入，輸入1到99中的數字");
			}
			if (num==70){
				System.out.println("恭喜你猜對了~~~");
				break ;
			}
			
			System.out.println("猜錯啦~再猜一次看看~~");
			
		}
		
	}
	
	@Test
	public void guessTest2() {
		Scanner scan = new Scanner(System.in);
		int a=70;
		int num;//記住我所寫的密碼
		int min=1;
		int max=99;
		
		System.out.println("請輸入1~99中的一個數字: ");
		for(;;) {
			
			
			num=scan.nextInt();
			
			if (num<min || num>max) {
				System.out.printf("請重新輸入，輸入%d到%d中的數字\n",min,max);
			}
			if (num==a) {
				System.out.println("恭喜你猜對了~~~");
				break ;
				
			}
			if (num<a) {
					
				if (num>min) {
						
					min=num;
					System.out.printf("輸入%2d ~ %2d間的數字 \n",min,max);
						
				}
			}else {
				if (num<max) {
						
					max=num;
					System.out.printf("輸入%2d ~ %2d間的數字\n",min,max);
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
		System.out.println("請輸入1~99中的一個數字: ");
		
		for(;;) {
			
			num=scan.nextInt();
			
		if ( num<min || num>max ) {
			
			System.out.printf("請重新輸入，輸入%2d到%2d中的數字\n",min,max);
			
		}
		if (num==a) {
			
			System.out.println("恭喜你猜對了~~~");
			break ;
			
		}if (num<a) {
			
			if (num>min) {
				
				min=num;
				System.out.printf("輸入 %2d ~ %2d 間的數字 \n",min,max);
				
			}
		}else {
			if (num<max) {
			max=num;
			System.out.printf("輸入 %2d ~ %2d 間的數字 \n",min,max);
			}
			}
		}
	}	
	
	@Test
	public void guessTest4() {
		Scanner scan=new Scanner(System.in);
		int guess=(int)(Math.random()*99)+1;
		System.out.println("隨機數字為: "+guess);
		int min=1;
		int max=99;
		System.out.println("請輸入1~99中的數字");
		while(ture) {
			int num=scan.nextInt();
			System.out.printf("請輸入%2d ~ %2d 中的數字 \n",min,max);
			
			
			if (num<min || num>max) {
				System.out.printf("數字超出範圍，請輸入在%2d ~%2d 中\n",min,max);
			}else if(num==guess) {
				System.out.println("恭喜猜對了~~");
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
