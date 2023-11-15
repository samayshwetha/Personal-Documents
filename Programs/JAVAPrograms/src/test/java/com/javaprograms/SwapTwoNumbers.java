package com.javaprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=15;
		int b=25;
		int temp;
		System.out.println("Before Swapping: " + a+ "\t" + b);
		
		//Approach1 using 
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: " + a+ "\t" + b);
		
		//Approach2 using + and -
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: " + a+ "\t" + b);*/
		
		//Approach3 using * /
		/*a= a*b;
		b= a/b;
		a= a/b;
		System.out.println("After Swapping: " + a+ "\t" + b);*/
		
		//Approach4
		/*b = a+b-(a=b);
		System.out.println("After Swapping: " + a+ "\t" + b);*/
		
		

	}

}
