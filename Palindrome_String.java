package com.sagar;

//palindrome string
import java.util.Scanner;

public class Palindrome_String {
	public static boolean isPalindrome(String str) {
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)==str.charAt(n-1)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string :");
		String str = sc.next();
		
		System.out.println(isPalindrome(str));
	
	}

}
