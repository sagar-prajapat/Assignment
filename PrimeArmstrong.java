package com.sagar;

import java.util.Scanner;

public class PrimeArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		boolean answer = isPrime(n);
		boolean arm = isArmstrong(n);
		System.out.println(arm);
	}
	

}
