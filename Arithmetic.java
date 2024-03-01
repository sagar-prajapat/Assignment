package com.sagar;
import java.util.Scanner;
public class Arithmetic {
	int additionNumber(int x,int y,int z) {
		return x+y+z;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int n1 = sc.nextInt();
		System.out.println("enter second number:");
		int n2 = sc.nextInt();
		System.out.println("enter third number:");
		int n3 = sc.nextInt();
		
		Arithmetic obj = new Arithmetic();
		int result = obj.additionNumber(n1, n2, n3);
		System.out.println("addition of number:"+result);

	}

}
