package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class DemoApplicationTests {

	@Test
	public void contextLoads() {
		int x=5;//�ŧi�ܼ�x=5x�A��5�o�ӭȳ]�w���ܼ�x
		System.out.println(x);//�⵲�G�C�L�X�Ө�console�A�ֱ���:��Jsyso�A�b��alt+/
		x=10;//�ۦP���ܼ�x�i�H���ƨϥΡA������q�ƨϥΫŧi(�ܼ�x�e���[�W��ƫ��A)
		System.out.println(x);
		x=x+5;
		System.out.println(x);
	}
	
	@Test
	public void exam1() {
		int hourlySalary=120;
		//(�j/�p)�m�p:�u�n�ĤG�ӵ��N�ݭn�ܴ��j�p�C(�������p�m�p)
		//�p�m�p(�p�g�}�Y)�j�m�p(�j�g�}�Y)
		int HR=8;
		int z=hourlySalary*HR*300;
		System.out.println(z);
		System.out.println("�L���~��:"+z);
		//��ƭȦ걵�A�|�Nz�ƭȥ��ഫ��"�r��"�b�걵�A�]�����G�X�{���ƭ�"z"�H���r��D�ƭ�
		//��n����ܼƦW�ٮɡA�i���I��U�ϥզW���A�k��ç��refactor�A�b���rename
		//��ۧ�ʪ��ܼƦW���A�|�ھڰ϶��ܰʡA�ëD���������
		System.out.println("���~:"+hourlySalary+",�u�@�ɼ�:"+HR+",�`�~��:"+z);
		System.out.printf("���~:%d,�u�@�ɼ�%d,�`�~��:%d\n",hourlySalary,HR,z);
		System.out.printf("���~:%d,�u�@�ɼ�%d,�`�~��:%d",hourlySalary,HR,z);
	}	
	@Test
	public void exam2() {
		int x = 5;
		int y = 10;
		System.out.println(x+y);
		String str = "abc";
		String str1= "def";
		System.out.println(str+str1);
		System.out.println("�L���W�r:"+str+str1);
		//"�r��"���s���i��(+);"�Ʀr"�]�i�H�ϥάۥ[(�u���Ʀr�i�H��(+)�H�~���[���)		
	}
	
	@Test
	public void exam3() {
		int x=1111111111;
		long y=2222222222222222222L;
		float z=1.111F;
		double r=1.123;
	}
	
	@Test
	public void exam4() {
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(1 == 2);
		System.out.println(1>=2);
		System.out.println(1<=2);
		
	}
	
	@Test
	public void exam5() {
		int x=5;
		System.out.println(x);
		x++;//++:���W�[1�A���� x=x+1
		System.out.println(x);
		
	}
	
	@Test
	public void exam6() {
		int x=5;
		System.out.println("x = "+x);
		int y=++x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		int z=y--;
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}
	
	@Test
	public void scannertext() {
		//String:��ƫ��A;str:�ܼƦW��
		String str="abc";
		String str1=new String("ABC");
		Scanner scan=new Scanner(System.in);
		//new Scanner�W�w�A�b�A���̭��@�w�n��(System.in)
		//Scanner�O�ҲաA�ҥH�@�w�ݭn����import
		System.out.println("�п�J�@�ӼƦr: ");
		int x=scan.nextInt();
		//�n�ϥ�scan�̭����w�q��k�A�i�z�L(.)�i��I�s
		System.out.println("�A��J���Ʀr��: "+x);
		String y=scan.next();
		System.out.println("�A��J����r��: "+y);
		String z=scan.nextLine();
		System.out.println("�A��J���y�l��: "+z);
		
		
	
	}
	
}
