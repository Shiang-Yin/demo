package com.example.demo;

import org.junit.jupiter.api.Test;

public class ExtendsText {
	
	
	@Test
	public void ant(){
		
//		Animal ant=new Animal();
//		ant.setName("Ant");
//		�ͦ��غc��k��A�W���o���i�H�X�֡A�ܦ�(�ݤU�@��)
		Animal ant=new Animal("Ant");//�����O
		ant.eat();
		ant.sleep();
		Dog dog=new Dog();//�l���O
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
	public void father1(){//�ϥΦh���ޥ�
		Father father=new Father("daddy");
		father.walk();
		Father son=new Son("Son");
		son.walk();
//		son.playBall();
		Father daughter=new Daughter("Daughter");
		daughter.walk();
//		daughter.shopping();(�]���ϥΤ����O�ҥH�l���O�������A�L�k���)
		System.out.println("=======================");
//	�t��	===============================================================
//		Father son1=new Son("Son");
//		Father daughter1=new Daughter("Daughter");
//		act(son1);
//		act(daughter1);
		
	}
////�]���p���ҥH�ϥ�private
//	private void act(Father father) {
//		father.walk();
//	�ܳ·�.......�����ΤW������son.walk();�A�N�n
//	}
	
	@Test
	public void shape() {
//		Shape shape=new Shape();  ->>�ѩ�O�Q�����O�A�ҥH�L�k�Qnew�X��
		Circle cir=new Circle();
		cir.draw();
		Square squ=new Square();
		squ.draw();
	}
	
	@Test
	public void fly() {
		Bird bird=new Bird();
//		�b�o�̧䤣��U���o��
//		bird.flying3();
//		�]���o�Ostatic�A�ҥH�n��(�ݤU�C)
		Fly.flying3();
	}
	
}