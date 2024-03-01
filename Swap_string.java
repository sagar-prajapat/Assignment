package com.sagar;

import java.util.Scanner;

public class Swap_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1:");
		String str1 = sc.next();
		System.out.println("enter string 2:");
		String str2 = sc.next();
		
		System.out.println("before swap:");
		System.out.println("string 1:"+str1);
		System.out.println("string 2:"+str2);
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println();
		System.out.println("after swap:");
		System.out.println("string 1:"+str1);
		System.out.println("string 2:"+str2);
		

	}

}
