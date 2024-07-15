package com.example.demo;

public class Father {
	
	private static String name;

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.printf("%s is walking.\n",this.getName());
	}

}
