package com.example.demo;

public class Animal {
	
	private String name;



	public Animal() {
//		super();
		System.out.println("=======================");
	}
//	ネΘ箇砞篶よ猭(计材)
	



	public Animal(String name) {
		super();
		this.name=name;
	}



	public void setName(String name) {
		this.name = name;
	}
//ΩネΘ篶よ猭(计材)	
//璶ネΘ计材ネΘ计材
	
	public String getName() {
		return name;
	}
	
	
	
	public void eat() {
		System.out.println("Animalタ!!");
	}
	
	public void sleep() {
		System.out.println("Animalタ何!!");
	}
	

}
