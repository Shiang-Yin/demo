package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class StringTest {
	
	@Test
	public void strTest() {
		String str=null;
		String str1="abc";
		String str2=new String("abc");
		String str3=new String();
		System.out.println(str==str1);//"=="只放在兩個地方的比較，第一個是那八個基本資料型態，第二個就是記憶體的位置
		System.out.println(str1==str2);//記憶體的位置，只要有看到寫new就是新增新的記憶體不管內容
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println("========================");
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
	}
	
	@Test
	public void strTest1() {
		String str="abc";
		String str1="abc";
		String str2="";  //空字串
		String str3="  ";//空兩隔，空白字串(不管空幾格，只要空白就都叫空白字串)
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("========================");
//		======================================
//		isEmpty是種boolean布林值，會回傳，False(有長度都為此)或者Ture(空字串)
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println("========================");
//		=======================================
//		isBlank是用來判斷空字串與空白字串的，也就是說，字串中沒有任何文字或者文字都匯回傳(Ture)
		System.out.println(str.isBlank());
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
	}
	
	@Test
	public void strTest2() {
		String str="abcdef";
		System.out.println(str.indexOf("b"));
//		indexof(搜索值):從位置0開始由左往右，回傳找到第一個符合搜索值的索引位置
		System.out.println(str.indexOf("c", 5));     //-1，從索引值5的位置往右找找不到"c"所以回傳-1
		System.out.println(str.indexOf("f", 2));     //5
//		indexof(搜索值,索引值):從索引值的位置開始由左往右找，回傳找到符合搜索值的索引位置(但如果找不到則會回傳(-1))
		System.out.println(str.lastIndexOf("b"));     //1
		System.out.println(str.lastIndexOf("a", 5));  //0，因為是由後往前找，所以索引值並不會影響到搜索結果(除非索引值變成負數)
		System.out.println(str.lastIndexOf("a", -5));  //-1除非索引值變成負數
//		lastIndexOf(搜索值):往最後一個值開始往回找，回傳找到第一個符合(實際上是最後一個)搜索值的索引位置
	}
	
	@Test
	public void strTest3() {
		String str="神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String target="小龍女";
		int count=0; //計算次數用
		int starIndex=0; //index開啟找時，找到後使用
		for (;;) {
			int index=str.indexOf(target,starIndex);
			if (index==-1) {  //index=-1時，表示找不到了
				break;
			}
			count++;
			starIndex=index+target.length();
//			starIndex=index+3=8+3(小龍女，第一次出現的索引值在"8"，但因為他是三個字，所以要加"3"，也就是我們target的長度)
		}
		System.out.println(count);
		
	}
	
	@Test
	public void strTest4() {
		String str="神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String substr=str.substring(8);
		System.out.println(substr);
		System.out.println("=========================");
		substr=str.substring(8, 11);
//		使用相同變數的時候，會後蓋前
//		11這格的索引值會是，index-1(如:小龍女的"女"位於索引值10，而如果直接填寫10的話，只會出現"小龍"而已，非出現"小龍女"三個字)
		System.out.println(substr);
		
	}
	
	@Test
	public void strTest5() {
		String str="神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String newStr=str.replace("小龍女", "小籠包");
		String newStr2=str.replaceAll("楊過", "小羊");
		System.out.println(newStr);
		System.out.println(newStr2);
//		replace和replaceAll都是取代全部符合的條件，
//		replace()裡面放字串
//		(replaceAll常放在正規表達式，此時用replace就無效了)
		
	}
	
	
	@Test
	public void strTest7() {
		String str=" 神 鵰 俠 侶 ";
		System.out.println(str);
		String newStr=str.trim();
//		trim:是刪除前後的空格		
		String newStr1=str.replace(" ", "");
//		取代所有空白，用replace
		System.out.println(newStr);
		System.out.println(newStr1);
				
	}
	
	
	@Test
	public void strTest8() {
		String str = "神鵰俠侶";
		String[] newStr = str.split("");
//		得到的答案會是:神,俠侶
//		如果split("")為空字串，則會切割每一個字
//		得到的答案會是:神,雕,俠,侶
		for(String item:newStr) {
			System.out.println(item);
		}
//		join:用於將字串的陣列/集合串成新的字串
		String newStr1=String.join("_", newStr);
		System.out.println(newStr1);
				
	}
	
	@Test
	public void strTest9() {
		StringBuffer sbf=new StringBuffer("ooo");
		sbf.append("abc").append("efg");
		sbf.append("ABC");
		String str=sbf.toString();
		System.out.println(str);
	}
	
	@Test
	public void test() {
		Scanner scan=new Scanner(System.in);
		System.out.println("輸入一段文字");
		String str=scan.next();
		
		StringBuffer sbf=new StringBuffer(str);
		StringBuffer sbf1=sbf.reverse();
		System.out.println(str+"是否為迴文? ");
		if (sbf==sbf1) {
			System.out.println("是迴文");
		}else {
			System.out.println("不是迴文");
		}
		
	}

//	另解
	@Test
	public void test1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("輸入一段文字");
		String str=scan.next();
		StringBuffer sbf=new StringBuffer(str);
		if(sbf.reverse().toString().equals(str)) {
			System.out.println(str+"是迴文");
		}else {
			System.out.println(str+"不是迴文");
		}
	}
	
	@Test
	public void test2() {
		StringBuffer str=new StringBuffer("ABACADEF");
		int newStr=str.lastIndexOf("A");
		str.setCharAt(newStr,'W');
		System.out.println(str.toString());//將最後一個A換成W
		
	}
	
	@Test
	public void test3() {
		String str="AABCBDCDACBDA";
		String a="A";
		
		int count=0;
		int starIndex=0;
		for(;;) {
			int index=str.indexOf(a,starIndex);
			if(index == -1) {
				
				break;
			}
			count++;
		}
		System.out.println(count);
	}
	
	@Test
	public void test4() {
		
		String str="AABCBDCDACBDA";
		int length=str.length();
		while(length != 0) {
			char ch = str.charAt(0);//取得第一個字元
			str=str.replace(String.valueOf(ch),"");
			//將字元替換成空字串
			//String.valueOf(ch)將字元轉換成字串
			int count=length-str.length();
			//用原本長度去剪掉新的長度，就可知她出現的次數
			System.out.printf("字母 %s 出現了 %d 次 \n",String.valueOf(ch),count);
			length=str.length();
			//文字需要替城西的文字(字串)長度
		}
	}
	
	@Test
	public void test5() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入一段文字:");
		String str = scan.next();
		int length=str.length();
		while (length != 0) {
			char ch=str.charAt(0);
			str=str.replace(String.valueOf(ch), "");
			int count=length-str.length();
			System.out.printf("字母 %s 出現了 %d 次 \n",String.valueOf(ch),count);
			length=str.length();
			
		}
		
	}
		
		
}
