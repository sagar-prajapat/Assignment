package com.sagar;

import java.util.Scanner;

public class Perfect_square {
	public static int perfect(int n) {
		int sum = 0;
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		int result = perfect(n);
		System.out.println("sum : "+result);
		
		if(result==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}

}
