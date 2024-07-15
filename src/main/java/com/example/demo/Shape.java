package com.example.demo;


//當程式過程中有一個類別為抽象方法時，class就必定需要是抽象類類別(abstract)
public abstract class Shape {
	
//一般類別只存有(1)建構方法(2)一般方法
//抽象類別中，可以包刮(1)建構方法(2)一般方法(3)抽象方法	(抽象方法只存在於抽象類別中)
	public Shape() {
		super();
		
	}

//	抽象類別中的方法，有大括號但無任何實作內容，只是定義用
	public void draw() {
		
	}

//	加上abstract後，不需要大括號{}，所以要改成分號;
//	用好後，circler及square得class會出現紅蚯蚓，滑鼠靠近點選這一個
	public abstract void draw1();
	
	
	
}
