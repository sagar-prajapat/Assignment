package com.sagar;
import java.util.Scanner;
public class factorail {
	public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
        int n = sc.nextInt();
        int temp=n;
        int fact;
        int num;
        int sum=0;
        while(n==0){
            num=n%10;
            fact=factorial(num);
            sum=sum+fact;
            num=n/10;
        }
    
       if(temp==sum){
          System.out.println("Yes");
       }
       else{
          System.out.println("No");
        }
    }

	}


