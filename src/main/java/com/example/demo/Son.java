package com.example.demo;

public class Son extends Father{

	public Son() {
		super();
		System.out.println(this.getName());
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
//	�p�G���@�˥i�H"���ݭn�Ѽg"�o�@�q
//	�]��walk�l���O���F�A�ҥH���ơA�l���O�i�H�u��
// 	���p�G�Q�n�g�X�Ӥ]�O�i�H��
//	��1:
//	public void walk() {
//		System.out.printf("%s is walking.\n",this.getName());
//	}
//	��2:
//	public void walk() {
//		super.walk();
//	}
	
//	���s�w�q�i�H�� �k��->source->implement method...->��ܧڭ̭n�ק���л\��
//	�Ҧp�b�o�̧ڭ̴N�i�H�� walk�o�ﶵ
// 	�M��NSystem.out.printf("���")
	
	@Override
	public void walk() {
		System.out.printf("%s is running.\n",this.getName());
	}
	
	public void playBall() {
		System.out.printf("%s is play ball.\n",this.getName());
	}

}
