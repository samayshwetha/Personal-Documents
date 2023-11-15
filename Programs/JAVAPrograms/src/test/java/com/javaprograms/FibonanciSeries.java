package com.javaprograms;

import java.util.Scanner;

public class FibonanciSeries {

	public static void main(String[] args) {
		
		System.out.println("enter first n fibonanci number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1=0;
		int n2=1;
		int sum;
		
		//Approach1
		/*for(int i=1;i<=10;i++)
		{ 
			System.out.print(n1 +"\t");
			sum= n1+n2;
			n1=n2;
			n2=sum;
		}*/
		
		//Approach2
		
		System.out.print(n1+"\t"+n2);
		for(int i=2;i<num;i++)
		{
			sum=n1+n2;
			System.out.print("\t"+sum);
			n1=n2;
			n2=sum;
		}
	

	}

}
