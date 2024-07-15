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
//		先詢問為攝氏還是華氏
		System.out.println("預轉換溫度為華氏(c)還是攝氏(f)，\n請輸入c/f:");
		String choose=scan.next();
//		再詢問溫度
		System.out.println("請輸入溫度");
		float temp=scan.nextFloat();
		if(choose.equals("c")) {
//			華氏溫度 = 攝氏溫度 * 9 / 5 + 32
			float c=temp*9/5+32;
			System.out.printf("攝氏%.2f度c轉為\n華氏溫度為%.2f度F",temp,c);
			
		}else if(choose.equals("f")){
//			攝氏溫度 = ( 華氏溫度 – 32 ) * 5 / 9
			float f=(temp-32)*5/9;
			System.out.printf("華氏%.2f度F轉為\n攝氏溫度為%.2f度c",temp,f);
			
		}else {
			System.out.println("輸入有誤，請輸入c或f");
		}
		
	}
	
	@Test
	public void practise4() {
		Scanner scan=new Scanner(System.in);
		System.out.println("預轉換溫度為華氏(c)還是攝氏(f)，\n請輸入c/f:");
		String choose=scan.next();
		if(!choose.equals("c")&& !choose.equals("f")) {
			System.out.println("輸入錯誤，請輸入c/f(不限大小寫)");
			return;
		}
		System.out.println("請輸入溫度");
		float temp=scan.nextFloat();
		
		if(choose.equals("c")) {
//			華氏溫度 = 攝氏溫度 * 9 / 5 + 32
			float c=temp*9/5+32;
			System.out.printf("攝氏%.2f度c轉為\n華氏溫度為%.2f度F",temp,c);
			
		}else {
//			攝氏溫度 = ( 華氏溫度 – 32 ) * 5 / 9
			float f=(temp-32)*5/9;
			System.out.printf("華氏%.2f度F轉為\n攝氏溫度為%.2f度c",temp,f);
		}
			
	}
		
	@Test
//	求等差數列
	public void practise5() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入一個數字: ");
		int x=scan.nextInt();
		int s=((1+x)*x)/2;
		System.out.printf("1到%d的總合為%d",x,s);
		
	}
//	計算總和
	@Test
	public void practise6() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入一個數字: ");
		int x=scan.nextInt();
		int sun=0;
		for(int i=0;i<=x;i++) {
			sun+=i;
			
		}
		System.out.printf("計算出，1~%d的總合為: %d\n",x,sun);
		
	}
	
//	雞兔同籠
	@Test
	public void practise7() {
		int h=35; //h表示頭的總數量
		int l=100; //l表示腳的總數
		int c=0;
		int r=0;
		
		for(c=0;c<=h;c++) {
			r=h-c;//計算頭
			if((c*2+r*4)== l) {
				break;
			}
			System.out.println("無法計算");
		}
		
		System.out.printf("雞總共有%2d隻\n兔子共有%2d隻",c,r);
	}
	
//	使用輸入，計算雞兔同籠問題
	@Test
	public void practise8() {
		Scanner scan=new Scanner(System.in);
		System.out.println("假設頭的總數有幾顆?");
		int h=scan.nextInt(); //h表示頭的總數量
		System.out.println("假設腳的總數有幾隻?");
		int l=scan.nextInt(); //l表示腳的總數
		int c=0;
		int r=0;
		
		for(c=0;c<=h;c++) {
			r=h-c;//計算頭
			if((c*2+r*4)== l) {
				System.out.printf("雞總共有%2d隻\n兔子共有%2d隻",c,r);
				break;
			}
		}
		if((c*2+r*4)!= l) {
			System.out.println("無法驗證");
			return;
		}
	}
	
	@Test
	public void Test() {
		Scanner scan =new Scanner(System.in);
		System.out.println("請輸入第一個數字:");
		int x=scan.nextInt();
		System.out.println("請輸入第二個數字:");
		int y=scan.nextInt();
		System.out.println("x/y等於: "+x/y);
		
	}
	
	
	

}
