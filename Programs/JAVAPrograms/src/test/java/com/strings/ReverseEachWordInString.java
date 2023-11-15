package com.strings;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		
		String str = "Welcome to JAVA and Selenium";
		String[] words = str.split(" ");      ///splitting string into array
		String revStr = "";
		
		//Approach1
		/*for (String w : words) {
			String rev="";
			for(int i=w.length()-1;i>=0;i--)
			{
				rev=rev+w.charAt(i);
			}
			revStr = revStr+rev+" ";
		}
		System.out.println("Reversed string: "+revStr);*/
		
		//Approach2
		/*for (String w : words) {
		StringBuffer sb = new StringBuffer(w);
		String revwords = sb.reverse().toString(); 
		revStr = revStr+revwords+" ";
		}
		 System.out.println("Reversed string: "+revStr);*/
		
		
		//Approach 3
		for (String w : words) {
		StringBuffer sb = new StringBuffer(w);
		String revWord = sb.reverse().toString();
		revStr = revStr+revWord+" ";
		}
		System.out.println("Reversed String : "+revStr);
		 
	}

}
