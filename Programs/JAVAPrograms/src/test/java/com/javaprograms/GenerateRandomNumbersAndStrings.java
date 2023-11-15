package com.javaprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
	
		//Approach1--using Random class
	   /*Random ran = new Random();
	   int rand_num=ran.nextInt(1000);
	   System.out.println(rand_num);
	   
	   double rand_dou= ran.nextDouble(); //range 0.0 to less than 1.0
	   System.out.println(rand_dou);*/
	   
	   //Approach2--using Math class
	   /*System.out.println(Math.random());*/
		
		//Approach3 --using Apache common -lang API
		
		System.out.println(RandomStringUtils.randomNumeric(2));
		System.out.println(RandomStringUtils.randomAlphabetic(5));

	}

}
