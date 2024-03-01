package com.sagar;
import java.util.Scanner;
public class Product_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		
		int product=1;
		while(n!=0) {
			int num = n%10;
			product = product*num;
			n = n/10;
		}
		System.out.println("product of number:"+product);

	}

}
