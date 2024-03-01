package com.sagar;
import java.util.Scanner;
public class Armstrong1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		int temp=num;
		int tem=num;
		int rem=0;
		double arm=0;
		int count=0;
		
		while(num>0) {
			rem = num%10;
			count++;
			num = num/10;
		}
		
		while(tem>0) {
			rem = tem%10;
			arm = (int) (arm + Math.pow(rem,count));
			tem = tem/10;
		}
		if(temp==arm) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
