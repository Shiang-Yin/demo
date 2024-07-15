package com.example.demo;

public class Bird implements Fly{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.printf("bird正在吃");
	}
	
	public void sleep() {
		System.out.printf("bird正在睡");
	}
	public void fly() {
		System.out.printf("bird正在飛");
	}

	@Override
	public void flying() {
		System.out.printf("bird正在飛ing");
		
	}

}
