package com.sagar;

import java.util.Scanner;

public class HCF_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n1:");
		int n1 = sc.nextInt();
		System.out.println("enter the value of n2:");
		int n2 = sc.nextInt();
		int hcf=0;
		
		for(int i=1;i<=n1 || i<=n2;i++) {
			
			if(n1%i==0 && n2%i==0) {
				hcf = i;
			}
			
		}
		System.out.println("HCF of numbers: "+hcf);
	}

}
