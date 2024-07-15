package com.example.demo;

public class Dog extends Animal{

//	public class Dog {(原本，後改成(上面))
//	存取權限 屬性資料型態 變數名稱
//	private String name;(因為animal重複所以可以刪掉)
	
	
	
	private String color;
	
	private int age;
//	如果沒有get與set的話，當我在書寫時，dog. 點後面不會跑出東西來
	
	
	
	public Dog() {
//		super();
		System.out.println("+++++++++++++++");
	}	
//	右鍵->source->倒數第二個
//	自定義建構方法
	

	public Dog(String name, String color, int age) {
	super();
	super.setName(name);
//	this.name = name;
	this.color = color;
	this.age = age;
}
//	右鍵->source->倒數第三個
//	預設建構方法
	
	public Dog(String name, String color) {
	super();
	super.setName(name);
	this.color = color;
	}


	public Dog(String name) {
		super(name);
		
	}
//	原本dog name的刪掉了，但可在預設建構(倒數第二個)裡面看見
//	因為我們把它原本的以父類別(super)給取代了
	

//==============================================================

	//	public String getName() {
//		return name;
//	}
//return不能輸入任何值，void不回傳任何值
//	getName(參數)，如裡裡面沒有參數，填寫時在裡面填寫參數就會出現錯誤
//	例如System.out.println(dog.getName(a));裡面的a需要空白不能有文字
//	public void setName(String name) {
//		this.name = name;
//	}
//void與string為方法(setName)回傳值的資料型態
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
		System.out.printf("%s正在睡\n",super.getName());
	}
	
	public void barking() {
		System.out.println("正在叫");
	}
	
	//Override:重新定義/覆寫:指重新定義父類別的方法(可寫可不寫)
	@Override
	public void eat() {
		System.out.println("dog正在吃");
	}
	
	@Override //父類別有的地方，子類別再重新定義
	public void sleep() {
		System.out.println("dog正在睡");
	}

}
