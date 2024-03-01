package com.sagar;

import java.util.Scanner;

class addition{
	int a;
	int b;
	int c;
	 
	void add(int a,int b) {
		c=a+b;
		System.out.println("addition :"+c);
	}
}

class subtract extends addition{
//	void sub(int a,int b) {
//		int c;
//		c=a-b;
//		System.out.println("subtract :"+c);
//	}
//	
//	void multiply(int a,int b) {
//		int c;
//		c=a*b;
//		System.out.println("multiply :"+c);
//	}
//	
//	void str(String str1,String str2) {
//		System.out.println("before swap :");
//		System.out.println("str1 :"+str1);
//		System.out.println("str2 :"+str2);
//		
//		String temp = str1;
//		str1 = str2;
//		str2 = temp;
//		System.out.println("after swap :");
//		System.out.println("str1 :"+str1);
//		System.out.println("str2 :"+str2);
//	}
	
	void alphabet(char c) {
		for(int i='a')
	}
}
public class Objext_orientedp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a :");
		int a = sc.nextInt();
		System.out.println("enter b :");
		int b = sc.nextInt();
		System.out.println("enter string1 :");
		String str1 = sc.next();
		System.out.println("enter string2 :");
		String str2 = sc.next();
		System.out.println("enter char :");
		String c = sc.next();
		
		
		subtract obj = new subtract();
		obj.add(a,b);
		obj.sub(a,b);
		obj.multiply(a,b);
		obj.str(str1, str2);
	}

}
