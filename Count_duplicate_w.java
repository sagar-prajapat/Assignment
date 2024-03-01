package com.sagar;

import java.util.Scanner;

public class Count_duplicate_w {
	public static void duplicate(String str) {
		int n = str.length();
		int count = 0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(j));
					count++;
				}
			}
		}
		System.out.println(count);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string :");
		String str = sc.next();
		
		duplicate(str);

	}

}
