package com.example.demo;

public class Daughter extends Father {

	public Daughter() {
		super();
		System.out.println(this.getName());
	}

	public Daughter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
//	��1:���Ѽg(���u����ڭ̭n��F���O�@�˪�)
	
//	��2:
//	public void walk() {
//		System.out.printf("%s is walking.\n",this.getName());
//	}
	
//	��3:
//	public void walk() {
//		super.walk();
//	}
	
	@Override
	public void walk() {
		System.out.printf("%s is going quickly.\n",getName());
	}
	
	public void shopping() {
		System.out.printf("%s is shopping.\n",this.getName());
	}

}
