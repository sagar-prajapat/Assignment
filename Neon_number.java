package com.sagar;

import java.util.Scanner;

public class Neon_number {
	public static void neonNum(int n) {
		double power = Math.pow(n, 2);
		System.out.println(power);
		
		double sum = 0;
		while(power!=0) {
			int rem = (int) (power % 10);
			sum = sum + rem;
			power = power/10;
		}
		
		System.out.println(sum);
		
		if(sum==n) {
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		neonNum(n);
		

	}

}
