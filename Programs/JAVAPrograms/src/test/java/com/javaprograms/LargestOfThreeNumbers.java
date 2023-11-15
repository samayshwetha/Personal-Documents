package com.javaprograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		
		int a=100;
		int b=40;
		int c=250;
		
		//Approach1
		/*if(a>b && a>c)
			System.out.println("a is greater");
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");*/
		
		//Approach2: Using ternary operator
		/*int large = a>b ? a : b;
        large = large>c ? large : c;
        System.out.println("largest num is: "+large);*/
        
		//Apprach3 : converting two lines into single line
        int large = (a>b ? a : b) > c ? (a>b ? a : b) : c;
        System.out.println("largest num is: "+large);
	}

}
