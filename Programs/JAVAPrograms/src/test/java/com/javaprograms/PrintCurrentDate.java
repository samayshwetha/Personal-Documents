package com.javaprograms;

import java.util.Date;

public class PrintCurrentDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		String[] dArr = d.toString().split(" ");
		String currentDate = dArr[0]+" "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(currentDate);

	}

}
