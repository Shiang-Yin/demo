package com.example.demo;

public class Animal {
	
	private String name;



	public Animal() {
//		super();
		System.out.println("=======================");
	}
//	���ͦ��w�]�غc��k(�˼ƲĤG��)
	



	public Animal(String name) {
		super();
		this.name=name;
	}



	public void setName(String name) {
		this.name = name;
	}
//�~��A���ͦ��غc��k(�˼ƲĤT��)	
//�n���ͦ��˼ƲĤG�Ӥ~��ͦ��˼ƲĤT��
	
	public String getName() {
		return name;
	}
	
	
	
	public void eat() {
		System.out.println("Animal���b�Y!!");
	}
	
	public void sleep() {
		System.out.println("Animal���b��!!");
	}
	

}
