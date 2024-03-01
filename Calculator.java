package com.sagar;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		while(true) {
			System.out.println("enter operator:");
			char op = sc.next().trim().charAt(0);
			
			if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
				
				System.out.println("enter the first number:");
				int n1 = sc.nextInt();
				System.out.println("enter the second number:");
				int n2 = sc.nextInt();
				
				if(op=='+') {
					answer = n1+n2;
				}
				
				if(op=='-') {
					answer = n1-n2;
				}
				
				if(op=='*') {
					answer = n1*n2;
				}
				
				if(op=='/') {
					answer = n1/n2;
				}
				
				if(op=='%') {
					answer = n1%n2;
				}
				
				else if(op=='x' || op=='X') {
					break;
				}
				
				}
			else {
				System.out.println("tum calculation ke layak nahi ho!");
			}
			
			System.out.println("your answer:"+answer);
		}

	}
}


