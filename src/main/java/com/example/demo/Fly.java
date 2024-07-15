package com.example.demo;

public interface Fly {
	
//	在介面中定義的所有方法，預設值都是抽象方法(abstract可以省略)，所以不能有大括號{}
//	public abstract void fly();
	public void flying();
	
//	介面定義的方法中，如果加上default時，一定要有實作內容加上大括號{}，等同於"預設方法"
//	default不一定要重新定義(override)
	public default void flying2() {
		System.out.println("好想飛...");
	}
	
//	static一定需要一個{body}
//	不能被override，(不能被override的有三個(1)static(2)final(3)建構方法)
//	使用方法，Fly.flying3();
	public static void flying3() {
		System.out.println("真的太想飛了...");
	}
	
	

}
