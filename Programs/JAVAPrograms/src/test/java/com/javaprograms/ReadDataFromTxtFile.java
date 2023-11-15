package com.javaprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws IOException {
		
		//Approch1: using Filereader and bufferedreader class, readline method of Bufferedreader
		  /*FileReader fr = new FileReader("D:\\Selenium\\Programs\\Text123.txt");
		  BufferedReader br = new BufferedReader(fr);
		  String str;
		  while((str=br.readLine())!=null)
		  {
			  System.out.println(str);
		  }
		  br.close();*/
		
		//Approach2: using File, scanner class and hasnextline method of scanner class
		  /*File fl = new File("D:\\Selenium\\Programs\\Text123.txt");
		  Scanner sc = new Scanner(fl);
		  while(sc.hasNextLine())
		  {
			  System.out.println(sc.nextLine());
		  }
		  sc.close();*/
		
		//Approach3: 
		  

	}

}
