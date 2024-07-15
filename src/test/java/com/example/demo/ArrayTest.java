package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest  {
	
	@Test//�ֱ���:ctrl+shift+o
	public void arrayTest1() {
		double[] degree= {25,22,24,20,26,21,23};
		System.out.println(degree[0]);
		System.out.println(degree[3]);
		
//		double sum=degree[0]+degree[1]+degree[2]+degree[3]+degree[4]+degree[5]
//				+degree[6];
//		System.out.println(sum);
		double sum=0;
		for(int i=0 ; i<degree.length ; i++) {
			sum=sum + degree[i];//�Ĥ@�ӯ��ޭȶi��[0]-25�A[1]-22....�A[6]-23
		}
		System.out.println(sum);
	}
	
	@Test
	public void arraryTest2() {
		int[] arr=new int[5];
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<5 ;i++) {
			System.out.println("�п�J�@�ӼƦr�A��J0����: ");
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
			System.out.println("��J�Ʀr������: "+sum/arr.length);
		}
		
	}
	
	@Test
	public void arraryTest3() {
		List<Integer> list= new ArrayList<>();
			//list��<>���u��񧹾㪺���
			//list�O����(interface)�A����new�X�ӡA�ҥH�u��hnew�X�@�ӹ�@�Ӥ��������OArraryList
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<5 ;i++) {
			System.out.println("�п�J�@�ӼƦr�A��J0����: ");
			int x=scan.nextInt();
			if(x==0) {
				break;
			}
			list.add(x);
			//add():�N��J���Ȧ����Ǫ��ƤJ�i�hlist��
			
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
		
		System.out.println("�D��ƪ���: ");
		for(int i=2;i<20;i++) {
			if (i==2 || i==3) {
				list.add(i);
				continue;
			}
				if (i%2==0 || i%3==0) {
					continue;	
			}
				
//			System.out.println("�D��ƪ���: "+ i);
			list.add(i);
			
		}for(int i=0;i<list.size();i++) {
//			System.out.println("�D��ƪ���:");
			System.out.printf(" %2d ,",list.get(i));
		}
		
	}
	
	@Test
	public void test2() {;
		List<Integer> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.println("�п�J�@�ӭȡA�p��䤺�����: ");
		int unprim=scan.nextInt();
		System.out.printf("%2d������ƪ���: ",unprim);
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
		System.out.printf("\n %2d ���@��%2d �ӽ��",unprim,count);
		
	}
}
