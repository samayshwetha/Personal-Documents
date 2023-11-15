
package com.javaprograms;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random ran = new Random(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("how many random");
		int value = sc.nextInt();
		for(int i=0;i<value;i++)
		{
			int ranValue = ran.nextInt(100);
			 System.out.println(ranValue);
		}

	}

}
