package com.sagar;
import java.util.Scanner;
public class Compound_interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal:");
		double principal = sc.nextInt();
		System.out.println("enter rate:");
		double rate = sc.nextInt();
		System.out.println("enter n:");
		double n = sc.nextInt();
		
		double CI = principal * (Math.pow((1+rate/100), n)) - principal;
		System.out.println("Compound interest:"+CI);

	}

}
