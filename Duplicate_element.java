package com.sagar;

import java.util.Scanner;

public class Duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String s = sc.next();
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
		
				if(s.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
			
			}
			
		}
		
		System.out.println(count);

	}
}
