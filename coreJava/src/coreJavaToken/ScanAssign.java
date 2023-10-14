package coreJavaToken;

import java.util.Scanner;

public class ScanAssign {
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The value of A:");
		int a=sc.nextInt();
		System.out.println("The value of B:");

		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The value of c:" + c);
		//sc.close();
	}
	static void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The value of A:");
		int a1=sc.nextInt();
		System.out.println("The value of B:");

		int b=sc.nextInt();
		int c=a1-b;
		System.out.println("The value of c:" + c);
		//sc.close();
		

	}
	static void multiply()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The value of A:");
		int a=sc.nextInt();
		System.out.println("The value of B:");

		int b=sc.nextInt();
		int c=a*b;
		System.out.println("The value of c:" + c);
	//	sc.close();
		

	}
	
	static void div()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The value of A:");
		int a=sc.nextInt();
		System.out.println("The value of B:");

		int b=sc.nextInt();
		int c=a/b;
		System.out.println("The value of c:" + c);
		sc.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		multiply();
		div();

	}

}
