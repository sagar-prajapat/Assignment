package com.sagar;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
			char ch = sc.next().trim().charAt(0);
			if(ch>='a' && ch<='z') {
				System.out.println("lowercase");
			}
			else {
				System.out.println("uppercase");
			}
			break;
			
		default:System.out.println("invalid character");
		break;
		}

	}

}
