package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ClassText {
	
	@Test
	public void dogText() {
		
		Dog dog=new Dog();
		System.out.println(dog.getName());
		dog.setName("apple");
		System.out.println(dog.getName());
		
		Dog dog2=new Dog();
		dog2.setName("Lilly");
		String str=dog2.getName();
		System.out.println(str);
	}
	
	@Test
	public void dogText1() {
		Dog dog=new Dog("Apple","rainbow",5);
		//�z�L�a���Ѽƪ��غc��k���N�U���ݩʪ�setxxx��k
//		Dog dog=new Dog();
//		dog.setName("Apple");
//		dog.setColor("rainbow");
//		dog.setAge(5);
		System.out.printf("�W�l:%s �C��:%s �~��:%d \n",dog.getName(),dog.getColor(),dog.getAge());
		dog.barking();
		dog.sleeping();
		
	}
	
	@Test
	public void taipeiText() {
		
		TaipeiBank bank=new TaipeiBank();
		bank.setUser("aaa");
		bank.balance=1000;
		bank.saving(5000);
		bank.withdraw(6000);
		bank.withdraw(6000);
	}
	
	@Test
	public void taipeiText1() {
		TaipeiBank bank=new TaipeiBank();
		Scanner scan=new Scanner(System.in);
		System.out.println("�b��W��: ");
		String user=scan.next();
		
		
	}

}
