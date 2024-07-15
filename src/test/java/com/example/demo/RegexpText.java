package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpText {
	
	@Test
	public void text() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入手機號碼:");
		String str = scan.next();
		
		
	}
	
	@Test
	public void text1() {
		String str = "0912-345-678";
		
//	解1	String pattern="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		正規表達式(例如pattern這列)本身就是字串
//		\d 不能單純一個斜線，因為單一一個斜線有特殊字元存在(\n，\d)
//		所以要再加一個\，等於\\d(跳脫字元)
//		假設要(06)-xxxxx，這個的(06)的括號是無意義的，所以要跳多字元，故使用\\(
		
//	解2	String pattern="\\d{4}-\\d{3}-\\d{3}";
//		可用{}大括號用來表示重複字串
		
//	解3
		String pattern="\\d{4}(-\\d{3}){2}";
//		用小括號()處理分組，就是把季個圈成同一個區域
		System.out.println(str.matches(pattern));
	}
	
	@Test
	public void text2() {
		
//	==================================================	
//		String str = "(02)-12345678";
//		(兩碼)-八碼
//		String pattern = "(\\d{2})-\\d{8}";
//		System.out.println(str.matches(pattern));
		
//	=======以上出來的結果會是false========================
		String str = "(02)-12345678";
		String pattern = "\\(\\d{2}\\)-\\d{8}";
		System.out.println(str.matches(pattern));
//		小掛號()pattern中視分組用，是屬於有意義符號
//		所以要它變成無意義符號，故使用跳脫字元(兩個\\)
//		出來的結果才會是true
	}
	
	@Test
	public void text3() {
		String pattern = "\\d{2}|\\d{3}";
		String str = "12";
		String str1 = "12 ";
		System.out.println(str.matches(pattern));//true
		System.out.println(str1.matches(pattern));//false
//以上為正確寫法；管道前後不可以有空白	
//		===========================================
//		| 管道前後有空白的話，輸出就必須要有空白，不然就都是False
		String pattern1 = "\\d{2} | \\d{3}";
//		輸出: 2碼+空白 或者 空白+三碼 才會匹配
		String str3 = "12";
		String str4 = "12 ";
		System.out.println(str3.matches(pattern1));//false
		System.out.println(str4.matches(pattern1));//true
		
	}
	
	@Test
	public void text4() {
//		?問號表示可有可無，即0~1次
		String pattern = "John(na)?son";
//		*星號表示0~多次
		String pattern1 = "John(na)*son";
//		+家浩表示1~多次
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
		System.out.println("市內電話對比");
		String str = scan.next();

		String pattern = "\\d{2}-\\d{7,8}|\\(\\d{2}\\)\\d{7,8}";
		System.out.println(str.matches(pattern));
		
		if (str.matches(pattern)==false) {
			System.out.println("請輸入正確電話號碼");
			return;
		}
		System.out.printf("%s此為有效電話號碼",str);

		
		
	}
	
	@Test
	public void text7() {
		Scanner scan = new Scanner(System.in);
        System.out.println("市內電話對比");
        String str = scan.next();
        
        String pattern = "0[1-9]{1,3}-\\d{7,8}";
        //將\\d改成[1-9]即可;{13}作用前面那一個值(例如\\d或者[1-9])
        System.out.println(str.matches(pattern));
        
        if (str.matches(pattern)== false) {
        	System.out.println("請輸入正確市話格式");
        	return;
        }
        System.out.printf("%s此為有效電話號碼",str);
	}
	

	@Test
	public void text8() {
		Scanner scan = new Scanner(System.in);
        System.out.println("身分證檢查");
        String str = scan.next();
        String pattern = "[A-Za-z][1-2]\\d{8}";
        System.out.println(str.matches(pattern));
        if(str.matches(pattern)==false) {
        	System.out.println("請輸入正確格式");
        	return;
        }
		System.out.printf("%s此為正常身分證",str);
	}
	
	@Test
	public void text9() {
		Scanner scan = new Scanner(System.in);
        System.out.println("身分證檢查(排除六都)");
        String str = scan.next();
        String pattern = "[A-Za-z&&[^AaBbDdEeFfHh]][1-2]\\d{8}";
        System.out.println(str.matches(pattern));
        if(str.matches(pattern)==false) {
        	System.out.println("請輸入正確格式");
        	return;
        }
		System.out.printf("%s此為正常身分證",str);
	}
		
}
