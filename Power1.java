package com.sagar;

import java.util.Scanner;

public class Power1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		System.out.println("enter power:");
		int m = sc.nextInt();
		int result=(int) Math.pow(n, m);;
		 
		System.out.println("power:"+result);

	}

	}


