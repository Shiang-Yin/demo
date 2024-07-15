package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void iftext() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入2個數字~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		if (x>y){
			System.out.println("輸入的第一個數字比第二個數字大");
			}
		}
	@Test
	public void ifElseText() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入2個數字~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String str="";
		if (x>y){
//			System.out.println("第一個數字比第二個數字大");
			str="第一個數字比第二個數字大";
			return;
			}else {
//				System.out.println("false");
				str="false";
			}
		System.out.println(str);
		System.out.println("================");//如果不執行這一行可在前面加上return
	}
	
	@Test
	public void ifElseifElseText() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入你的年齡: ");
		int age=scan.nextInt();//反白nextInt，在按(alt+/)
		int tickit=100;
		if (age<=6 || age>=80){
			System.out.println("你的票價為(兩折): "+ tickit*0.2);
		}else if (age<=12 || age>=60) {
			//也可寫(age>=7 && age<=12)||(age>=60 && age<=79)
			System.out.println("你的票價為(五折): "+tickit*0.5);
		}else {
			System.out.println("你的票價為: "+tickit);
		}
	}
	
	@Test
	public void ifElseText2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入2個數字~~");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String str=x>y ? "第一個數字比第二個數字大" : "false";
//		if (x>y){
//			System.out.println("第一個數字比第二個數字大");
//			return;
//			}else {
//				System.out.println("false");
//			}
		System.out.println(str);
	}
	
	@Test
	public void if2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("本週工讀時數為； ");
		int hr=scan.nextInt();
		int A = hr*150;	
		//hr*150*0.8 計算結果的資料型態會是double(有小數點)
		//要去除小數點只顯示整數，就要將計算結果轉成int
		//小數點轉成整數，只取整數，不管小數點為多少(無條件捨棄)
		if (hr<40) {
			System.out.println("小於40小時(0.8倍):"+(int)A*0.8+" 元");
			//預設為double，故輸入(int)讓他宣告
		}else if(hr==40) {
			System.out.println("等於40小時: "+A+" 元");
		}else if(hr>40 && hr<=50) {
			System.out.println("大於40小於50(1.2倍): "+A*1.5+" 元");
		}else {
			System.out.println("大於50以上(1.6倍): "+A*1.6+" 元");
		}
	}
	
	@Test
	public void if3() {
		Scanner scan=new Scanner(System.in);
		System.out.println("測試是否為閏年? ");
		int years=scan.nextInt();
		double a=years%4;
		double b=years%100;
		double c=years%400;
		if(a==0) {
			if(b != 0 || c == 0) {
				System.out.println("西年"+years+" 為閏年");
			}else {
				System.out.println("非閏年");
			}
		}else {
			System.out.println("非閏年");
		}

	}
	
	@Test
	public void test() {
		System.out.println(90%10);//9
		System.out.println(99%10);//9(無小數點)
		System.out.println((double)99/10);//9.9
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入成績: ");
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
		System.out.println("幾天後? ");
		int day=scan.nextInt();
		switch(day%7) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期日");
			
		}
	}
	
	@Test
	public void week5() {
		Scanner scan=new Scanner(System.in);
		System.out.println("幾天後? ");
		int day=scan.nextInt();
		switch((5+day)%7) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期日");
			
		}
	}
	
	@Test
	public void dayX() {
		Scanner scan=new Scanner(System.in);
		System.out.println("今天星期?  ");
		int date=scan.nextInt();
		if (date<1 || date>7) {//排除法
			System.out.println("超過星期範圍，請填寫1~7");
			return;
		}
		System.out.println("幾天後星期? ");
		int day=scan.nextInt();
		switch((date+day)%7) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期日");
			
		}
	}
	
	
	@Test//另解
	public void dayX1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("今天星期?  ");
		int date=scan.nextInt();
		if (date<1 || date>7) {
			System.out.println("超過星期範圍，請填寫1~7");
			return;
		}
		System.out.println("幾天後星期? ");
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
			System.out.printf("今天星期%d，%d天後是星期%d",date,day,x);
			break;
		}
	}
}
