package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest  {
	
	@Test//快捷鍵:ctrl+shift+o
	public void arrayTest1() {
		double[] degree= {25,22,24,20,26,21,23};
		System.out.println(degree[0]);
		System.out.println(degree[3]);
		
//		double sum=degree[0]+degree[1]+degree[2]+degree[3]+degree[4]+degree[5]
//				+degree[6];
//		System.out.println(sum);
		double sum=0;
		for(int i=0 ; i<degree.length ; i++) {
			sum=sum + degree[i];//第一個索引值進來[0]-25，[1]-22....，[6]-23
		}
		System.out.println(sum);
	}
	
	@Test
	public void arraryTest2() {
		int[] arr=new int[5];
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<5 ;i++) {
			System.out.println("請輸入一個數字，輸入0結束: ");
			int x=scan.nextInt();
			if(x==0) {
				break;
			}
			arr[i]=x;
		}
		int sum=0;
		int count=0;
		for(int i=0; i<arr.length ;i++) {
			if(arr[i] != 0 ) {
				System.out.println(arr[i]);
				sum += arr[i];
				count++;
			}
			System.out.println("輸入數字的平均: "+sum/arr.length);
		}
		
	}
	
	@Test
	public void arraryTest3() {
		List<Integer> list= new ArrayList<>();
			//list的<>內只能放完整的單詞
			//list是介面(interface)，不能new出來，所以只能去new出一個實作該介面的類別ArraryList
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<5 ;i++) {
			System.out.println("請輸入一個數字，輸入0結束: ");
			int x=scan.nextInt();
			if(x==0) {
				break;
			}
			list.add(x);
			//add():將輸入的值有順序的排入進去list中
			
		}
	}
	
	@Test
	public void test() {
		int target=56;
		List<Integer> list=new ArrayList<>();
		for (int i=1 ; i<=target ;i++) {
			if(list.contains(i)) {
				break;
			}
			if(target%i == 0) {
				list.add(i);
				list.add(target/i);
			}
		}
		for(int i=0;i<list.size();i+=2) {
			System.out.printf("%2d * %2d \n",list.get(i),list.get(i+1));
		}
	}
	
	@Test
	public void test1() {;
		List<Integer> list=new ArrayList<>();
		
		System.out.println("非質數的有: ");
		for(int i=2;i<20;i++) {
			if (i==2 || i==3) {
				list.add(i);
				continue;
			}
				if (i%2==0 || i%3==0) {
					continue;	
			}
				
//			System.out.println("非質數的有: "+ i);
			list.add(i);
			
		}for(int i=0;i<list.size();i++) {
//			System.out.println("非質數的有:");
			System.out.printf(" %2d ,",list.get(i));
		}
		
	}
	
	@Test
	public void test2() {;
		List<Integer> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.println("請輸入一個值，計算其內的質數: ");
		int unprim=scan.nextInt();
		System.out.printf("%2d內的質數的有: ",unprim);
		for(int i=2;i<unprim;i++) {
			if (i==2 || i==3 || i==5 || i==7) {
				list.add(i);
				continue;
			}
				if (i%2==0 || i%3==0) {
					continue;	
			}
				if (i%5==0 || i%7==0 ) {
					continue;
				}
				
			list.add(i);
		
			
		}for(int i=0;i<list.size();i++) {
			System.out.printf(" %2d ",list.get(i));
			count++;
			
		}	
		System.out.printf("\n %2d 內共有%2d 個質數",unprim,count);
		
	}
}
