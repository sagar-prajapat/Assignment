package com.sagar;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int temp=num;
		int rem=0;
		int rev=0;
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(temp==rev) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
