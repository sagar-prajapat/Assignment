package com.sagar;

import java.util.Scanner;

public class Duplicate_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		String a = sc.next();
		
		int n = a.length();
		int count=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}
