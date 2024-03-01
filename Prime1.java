package com.sagar;

import java.util.Scanner;

public class Prime1 {
	public static void Prime(int n) {
		if(n==1) {
			System.out.println("prime");
		}
		else if(n==2) {
			System.out.println("prime");
		}
		else {
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					System.out.println("not prime");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Prime(n);
	}

}
