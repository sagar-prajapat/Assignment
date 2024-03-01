package com.sagar;
import java.util.Scanner;
public class Area_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square:");
		int side = sc.nextInt();
		
		int area = side*side;
		System.out.println("area of square:"+area);
		

	}

}
