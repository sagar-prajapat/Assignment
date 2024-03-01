package com.sagar;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		System.out.println("enter power:");
		int m = sc.nextInt();
		int result=0;
		for(int i=1;i<=n;i++) {
			 result = (int) Math.pow(n, m);
		}
	
		System.out.println("power:"+result);

	}

}
