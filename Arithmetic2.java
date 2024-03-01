package com.sagar;
import java.util.Scanner;
public class Arithmetic2 {
	int sub(int x,int y) {
		return x-y;
	}
	
	int mul(int x,int y) {
		return x*y;
	}
	
	int div(int x,int y) {
		return x/y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x:");
		int n1 = sc.nextInt();
		System.out.println("enter y:");
		int n2 = sc.nextInt();
		
		Arithmetic2 obj = new Arithmetic2();
		int subtraction = obj.sub(n1,n2);
		int multiply = obj.mul(n1,n2);
		int divide = obj.div(n1,n2);
		
		System.out.println(subtraction);
		System.out.println(multiply);
		System.out.println(divide);

	}

}
