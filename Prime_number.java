package com.sagar;
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		
		if(n==2) {
			System.out.println(n+" is prime");
		}
		else {
			boolean isprime = true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isprime = false;
				}
			}
			if(isprime==true) {
				System.out.println(n+" is prime");
			}
			else {
				System.out.println(n+" is not prime");
			}
		}

	}

}
