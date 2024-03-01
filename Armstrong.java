package com.sagar;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		
		int num;
		
		int count=1;
		int temp = n;
		double sum=0;
		while(n!=0) {
			num=n%10;
			sum=sum+(Math.pow(num,3));
			n=n/10;
			
		}
		if(sum==temp) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		

	}

}
