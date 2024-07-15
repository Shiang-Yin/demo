package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class DemoApplicationTests {

	@Test
	public void contextLoads() {
		int x=5;//宣告變數x=5x，把5這個值設定給變數x
		System.out.println(x);//把結果列印出來到console，快捷鍵:輸入syso，在按alt+/
		x=10;//相同的變數x可以重複使用，但不能從複使用宣告(變數x前面加上資料型態)
		System.out.println(x);
		x=x+5;
		System.out.println(x);
	}
	
	@Test
	public void exam1() {
		int hourlySalary=120;
		//(大/小)駝峰:只要第二個詞就需要變換大小。(左側為小駝峰)
		//小駝峰(小寫開頭)大駝峰(大寫開頭)
		int HR=8;
		int z=hourlySalary*HR*300;
		System.out.println(z);
		System.out.println("他的薪資:"+z);
		//兩數值串接，會將z數值先轉換成"字串"在串接，因此結果出現的數值"z"以為字串非數值
		//當要更改變數名稱時，可先點兩下反白名詞，右鍵並找到refactor，在選擇rename
		//跟著更動的變數名詞，會根據區塊變動，並非全部都更動
		System.out.println("時薪:"+hourlySalary+",工作時數:"+HR+",總薪資:"+z);
		System.out.printf("時薪:%d,工作時數%d,總薪資:%d\n",hourlySalary,HR,z);
		System.out.printf("時薪:%d,工作時數%d,總薪資:%d",hourlySalary,HR,z);
	}	
	@Test
	public void exam2() {
		int x = 5;
		int y = 10;
		System.out.println(x+y);
		String str = "abc";
		String str1= "def";
		System.out.println(str+str1);
		System.out.println("他的名字:"+str+str1);
		//"字串"的連接可用(+);"數字"也可以使用相加(只有數字可以用(+)以外的加減乘除)		
	}
	
	@Test
	public void exam3() {
		int x=1111111111;
		long y=2222222222222222222L;
		float z=1.111F;
		double r=1.123;
	}
	
	@Test
	public void exam4() {
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(1 == 2);
		System.out.println(1>=2);
		System.out.println(1<=2);
		
	}
	
	@Test
	public void exam5() {
		int x=5;
		System.out.println(x);
		x++;//++:遞增加1，等於 x=x+1
		System.out.println(x);
		
	}
	
	@Test
	public void exam6() {
		int x=5;
		System.out.println("x = "+x);
		int y=++x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		int z=y--;
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}
	
	@Test
	public void scannertext() {
		//String:資料型態;str:變數名稱
		String str="abc";
		String str1=new String("ABC");
		Scanner scan=new Scanner(System.in);
		//new Scanner規定，在括弧裡面一定要放(System.in)
		//Scanner是模組，所以一定需要先用import
		System.out.println("請輸入一個數字: ");
		int x=scan.nextInt();
		//要使用scan裡面的定義方法，可透過(.)進行呼叫
		System.out.println("你輸入的數字為: "+x);
		String y=scan.next();
		System.out.println("你輸入的文字為: "+y);
		String z=scan.nextLine();
		System.out.println("你輸入的句子為: "+z);
		
		
	
	}
	
}
