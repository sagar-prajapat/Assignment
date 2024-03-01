package com.sagar;
import java.util.Scanner;
public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println("factorial of number:"+fact);

	}

}
