package com.example.demo;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("畫圈圈");
	}

//	因為draw1是抽象方法，所以一定要重新定義
	@Override
	public void draw1() {
		System.out.println("=====畫圈圈=====");
	}
	
	
	

}
