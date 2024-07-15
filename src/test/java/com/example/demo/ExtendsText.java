package com.example.demo;

import org.junit.jupiter.api.Test;

public class ExtendsText {
	
	
	@Test
	public void ant(){
		
//		Animal ant=new Animal();
//		ant.setName("Ant");
//		生成建構方法後，上面這兩行可以合併，變成(看下一行)
		Animal ant=new Animal("Ant");//父類別
		ant.eat();
		ant.sleep();
		Dog dog=new Dog();//子類別
//		dog.eat();
//		dog.sleep();
//		dog.barking();
//		
		
	}
	
	@Test
	public void father(){
		Father father=new Father("daddy");
		father.walk();
		Son son=new Son("Son");
		son.walk();
		son.playBall();
		Daughter daughter=new Daughter("Daughter");
		daughter.walk();
		daughter.shopping();
	}
	
	@Test
	public void father1(){//使用多型技巧
		Father father=new Father("daddy");
		father.walk();
		Father son=new Son("Son");
		son.walk();
//		son.playBall();
		Father daughter=new Daughter("Daughter");
		daughter.walk();
//		daughter.shopping();(因為使用父類別所以子類別的延伸，無法選擇)
		System.out.println("=======================");
//	另解	===============================================================
//		Father son1=new Son("Son");
//		Father daughter1=new Daughter("Daughter");
//		act(son1);
//		act(daughter1);
		
	}
////因為私有所以使用private
//	private void act(Father father) {
//		father.walk();
//	很麻煩.......直接用上面那種son.walk();，就好
//	}
	
	@Test
	public void shape() {
//		Shape shape=new Shape();  ->>由於是鄒項類別，所以無法被new出來
		Circle cir=new Circle();
		cir.draw();
		Square squ=new Square();
		squ.draw();
	}
	
	@Test
	public void fly() {
		Bird bird=new Bird();
//		在這裡找不到下面這行
//		bird.flying3();
//		因為她是static，所以要用(看下列)
		Fly.flying3();
	}
	
}