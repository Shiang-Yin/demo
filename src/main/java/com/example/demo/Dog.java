package com.example.demo;

public class Dog extends Animal{

//	public class Dog {(�쥻�A��令(�W��))
//	�s���v�� �ݩʸ�ƫ��A �ܼƦW��
//	private String name;(�]��animal���ƩҥH�i�H�R��)
	
	
	
	private String color;
	
	private int age;
//	�p�G�S��get�Pset���ܡA��ڦb�Ѽg�ɡAdog. �I�᭱���|�]�X�F���
	
	
	
	public Dog() {
//		super();
		System.out.println("+++++++++++++++");
	}	
//	�k��->source->�˼ƲĤG��
//	�۩w�q�غc��k
	

	public Dog(String name, String color, int age) {
	super();
	super.setName(name);
//	this.name = name;
	this.color = color;
	this.age = age;
}
//	�k��->source->�˼ƲĤT��
//	�w�]�غc��k
	
	public Dog(String name, String color) {
	super();
	super.setName(name);
	this.color = color;
	}


	public Dog(String name) {
		super(name);
		
	}
//	�쥻dog name���R���F�A���i�b�w�]�غc(�˼ƲĤG��)�̭��ݨ�
//	�]���ڭ̧⥦�쥻���H�����O(super)�����N�F
	

//==============================================================

	//	public String getName() {
//		return name;
//	}
//return�����J����ȡAvoid���^�ǥ����
//	getName(�Ѽ�)�A�p�̸̭��S���ѼơA��g�ɦb�̭���g�ѼƴN�|�X�{���~
//	�ҦpSystem.out.println(dog.getName(a));�̭���a�ݭn�ťդ��঳��r
//	public void setName(String name) {
//		this.name = name;
//	}
//void�Pstring����k(setName)�^�ǭȪ���ƫ��A
//==================================================================

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleeping() {
		System.out.printf("%s���b��\n",super.getName());
	}
	
	public void barking() {
		System.out.println("���b�s");
	}
	
	//Override:���s�w�q/�мg:�����s�w�q�����O����k(�i�g�i���g)
	@Override
	public void eat() {
		System.out.println("dog���b�Y");
	}
	
	@Override //�����O�����a��A�l���O�A���s�w�q
	public void sleep() {
		System.out.println("dog���b��");
	}

}
