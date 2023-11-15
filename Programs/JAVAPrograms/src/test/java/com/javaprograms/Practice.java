package com.javaprograms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
	
		 Date d = new Date();
		 System.out.println(d);
		 
		 SimpleDateFormat  formatter = new SimpleDateFormat("dd-mm-yyyy");
		String newdate = formatter.format(d);
		System.out.println(newdate);
	}
}