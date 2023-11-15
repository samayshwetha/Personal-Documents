package com.javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
	
		
		 FileWriter fw = new FileWriter("D:\\Selenium\\Programs\\Text123.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write("Selenium with Java");
		 System.out.println("Finished");
		 bw.close();
	}

}
