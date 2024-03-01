package com.sagar;

import java.util.Scanner;

public class Swapwithout_3rdvar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("enter first number:");
		x = sc.nextInt();
		System.out.println("enter second number:");
		y = sc.nextInt();
		
		swap(x,y);
		
		sc.close();
	}
	
	static void swap(int a,int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("vallue after swapping: "+ a + " " + b);
	}

}
