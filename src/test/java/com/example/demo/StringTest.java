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
		System.out.println(str==str1);//"=="�u��b��Ӧa�誺����A�Ĥ@�ӬO���K�Ӱ򥻸�ƫ��A�A�ĤG�ӴN�O�O���骺��m
		System.out.println(str1==str2);//�O���骺��m�A�u�n���ݨ�gnew�N�O�s�W�s���O���餣�ޤ��e
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
		String str2="";  //�Ŧr��
		String str3="  ";//�Ũ�j�A�ťզr��(���ުŴX��A�u�n�ťմN���s�ťզr��)
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("========================");
//		======================================
//		isEmpty�O��boolean���L�ȡA�|�^�ǡAFalse(�����׳�����)�Ϊ�Ture(�Ŧr��)
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println("========================");
//		=======================================
//		isBlank�O�ΨӧP�_�Ŧr��P�ťզr�ꪺ�A�]�N�O���A�r�ꤤ�S�������r�Ϊ̤�r���צ^��(Ture)
		System.out.println(str.isBlank());
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
	}
	
	@Test
	public void strTest2() {
		String str="abcdef";
		System.out.println(str.indexOf("b"));
//		indexof(�j����):�q��m0�}�l�ѥ����k�A�^�ǧ��Ĥ@�ӲŦX�j���Ȫ����ަ�m
		System.out.println(str.indexOf("c", 5));     //-1�A�q���ޭ�5����m���k��䤣��"c"�ҥH�^��-1
		System.out.println(str.indexOf("f", 2));     //5
//		indexof(�j����,���ޭ�):�q���ޭȪ���m�}�l�ѥ����k��A�^�ǧ��ŦX�j���Ȫ����ަ�m(���p�G�䤣��h�|�^��(-1))
		System.out.println(str.lastIndexOf("b"));     //1
		System.out.println(str.lastIndexOf("a", 5));  //0�A�]���O�ѫ᩹�e��A�ҥH���ޭȨä��|�v�T��j�����G(���D���ޭ��ܦ��t��)
		System.out.println(str.lastIndexOf("a", -5));  //-1���D���ޭ��ܦ��t��
//		lastIndexOf(�j����):���̫�@�ӭȶ}�l���^��A�^�ǧ��Ĥ@�ӲŦX(��ڤW�O�̫�@��)�j���Ȫ����ަ�m
	}
	
	@Test
	public void strTest3() {
		String str="����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String target="�p�s�k";
		int count=0; //�p�⦸�ƥ�
		int starIndex=0; //index�}�ҧ�ɡA����ϥ�
		for (;;) {
			int index=str.indexOf(target,starIndex);
			if (index==-1) {  //index=-1�ɡA��ܧ䤣��F
				break;
			}
			count++;
			starIndex=index+target.length();
//			starIndex=index+3=8+3(�p�s�k�A�Ĥ@���X�{�����ޭȦb"8"�A���]���L�O�T�Ӧr�A�ҥH�n�["3"�A�]�N�O�ڭ�target������)
		}
		System.out.println(count);
		
	}
	
	@Test
	public void strTest4() {
		String str="����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String substr=str.substring(8);
		System.out.println(substr);
		System.out.println("=========================");
		substr=str.substring(8, 11);
//		�ϥάۦP�ܼƪ��ɭԡA�|��\�e
//		11�o�檺���ޭȷ|�O�Aindex-1(�p:�p�s�k��"�k"�����ޭ�10�A�Ӧp�G������g10���ܡA�u�|�X�{"�p�s"�Ӥw�A�D�X�{"�p�s�k"�T�Ӧr)
		System.out.println(substr);
		
	}
	
	@Test
	public void strTest5() {
		String str="����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String newStr=str.replace("�p�s�k", "�pŢ�]");
		String newStr2=str.replaceAll("���L", "�p��");
		System.out.println(newStr);
		System.out.println(newStr2);
//		replace�MreplaceAll���O���N�����ŦX������A
//		replace()�̭���r��
//		(replaceAll�`��b���W��F���A���ɥ�replace�N�L�ĤF)
		
	}
	
	
	@Test
	public void strTest7() {
		String str=" �� �� �L �Q ";
		System.out.println(str);
		String newStr=str.trim();
//		trim:�O�R���e�᪺�Ů�		
		String newStr1=str.replace(" ", "");
//		���N�Ҧ��ťաA��replace
		System.out.println(newStr);
		System.out.println(newStr1);
				
	}
	
	
	@Test
	public void strTest8() {
		String str = "����L�Q";
		String[] newStr = str.split("");
//		�o�쪺���׷|�O:��,�L�Q
//		�p�Gsplit("")���Ŧr��A�h�|���ΨC�@�Ӧr
//		�o�쪺���׷|�O:��,�J,�L,�Q
		for(String item:newStr) {
			System.out.println(item);
		}
//		join:�Ω�N�r�ꪺ�}�C/���X�ꦨ�s���r��
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
		System.out.println("��J�@�q��r");
		String str=scan.next();
		
		StringBuffer sbf=new StringBuffer(str);
		StringBuffer sbf1=sbf.reverse();
		System.out.println(str+"�O�_���j��? ");
		if (sbf==sbf1) {
			System.out.println("�O�j��");
		}else {
			System.out.println("���O�j��");
		}
		
	}

//	�t��
	@Test
	public void test1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("��J�@�q��r");
		String str=scan.next();
		StringBuffer sbf=new StringBuffer(str);
		if(sbf.reverse().toString().equals(str)) {
			System.out.println(str+"�O�j��");
		}else {
			System.out.println(str+"���O�j��");
		}
	}
	
	@Test
	public void test2() {
		StringBuffer str=new StringBuffer("ABACADEF");
		int newStr=str.lastIndexOf("A");
		str.setCharAt(newStr,'W');
		System.out.println(str.toString());//�N�̫�@��A����W
		
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
			char ch = str.charAt(0);//���o�Ĥ@�Ӧr��
			str=str.replace(String.valueOf(ch),"");
			//�N�r���������Ŧr��
			//String.valueOf(ch)�N�r���ഫ���r��
			int count=length-str.length();
			//�έ쥻���ץh�ű��s�����סA�N�i���o�X�{������
			System.out.printf("�r�� %s �X�{�F %d �� \n",String.valueOf(ch),count);
			length=str.length();
			//��r�ݭn�����誺��r(�r��)����
		}
	}
	
	@Test
	public void test5() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J�@�q��r:");
		String str = scan.next();
		int length=str.length();
		while (length != 0) {
			char ch=str.charAt(0);
			str=str.replace(String.valueOf(ch), "");
			int count=length-str.length();
			System.out.printf("�r�� %s �X�{�F %d �� \n",String.valueOf(ch),count);
			length=str.length();
			
		}
		
	}
		
		
}
