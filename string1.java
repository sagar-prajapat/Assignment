package com.sagar;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sagar = "";
		System.out.println("enter name:");
		sagar = sc.next();
		String sagars = greetings(sagar);
		System.out.println(sagars);

	}
	
	static String greetings(String sagar) {
		String message = "Welcome"+ " " +sagar;
		return message;
	}

}
