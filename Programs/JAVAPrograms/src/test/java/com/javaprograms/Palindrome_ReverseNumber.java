package com.javaprograms;

import java.util.Scanner;

public class Palindrome_ReverseNumber {

	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the number");
		  int num = sc.nextInt();
		  
		  //Using Algorithm
		  /*int rev=0;
		  
		  while(num!=0)
		  {
			  rev=rev*10 + num%10;
			  num = num/10;
		  }
		  System.out.println("reversed number is :"+rev);
		  
		  if(num==rev)
		  System.out.println("given num is palindrome");
		  else
		  System.out.println("given num is not paindrome");*/
		  
		  
		  //using String buffer class
		  /*StringBuffer sb = new StringBuffer(String.valueOf(num));
		  System.out.println(sb.reverse());*/
		  
		  //
		  
		  //Using StringBuilder
		  StringBuilder sb = new StringBuilder();
		  sb.append(num);
		  System.out.println("reversed String is : "+sb.reverse());
		  	  
		  sc.close();
	}

}
