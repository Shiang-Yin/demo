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
		//透過帶有參數的建構方法取代下方屬性的setxxx方法
//		Dog dog=new Dog();
//		dog.setName("Apple");
//		dog.setColor("rainbow");
//		dog.setAge(5);
		System.out.printf("名子:%s 顏色:%s 年齡:%d \n",dog.getName(),dog.getColor(),dog.getAge());
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
		System.out.println("帳戶名稱: ");
		String user=scan.next();
		
		
	}

}
