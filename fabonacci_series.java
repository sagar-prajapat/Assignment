package com.sagar;
import java.util.Scanner;
public class fabonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		while(n3<50) {
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}
		

	}

}
