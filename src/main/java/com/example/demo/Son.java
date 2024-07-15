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
	
	
//	如果都一樣可以"不需要書寫"這一段
//	因為walk子類別有了，所以重複，子類別可以沿用
// 	但如果想要寫出來也是可以的
//	解1:
//	public void walk() {
//		System.out.printf("%s is walking.\n",this.getName());
//	}
//	解2:
//	public void walk() {
//		super.walk();
//	}
	
//	重新定義可以用 右鍵->source->implement method...->選擇我們要修改或覆蓋的
//	例如在這裡我們就可以選 walk這選項
// 	然後將System.out.printf("更動")
	
	@Override
	public void walk() {
		System.out.printf("%s is running.\n",this.getName());
	}
	
	public void playBall() {
		System.out.printf("%s is play ball.\n",this.getName());
	}

}
