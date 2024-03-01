package com.sagar;
//convert array to string
public class String_fun1 {

	public static void main(String[] args) {
		String str = new String();
		System.out.println("empty string is:"+str);
		
		char arr[] = {'a','e','i','o','u'};
		String obj = new String(arr);
		System.out.println("content is: "+obj);
		
		String ob = new String(arr,0,3);
		System.out.println("conten is: "+ob);
		
		String data = new String(ob);
		System.out.println(data);
	}

}
