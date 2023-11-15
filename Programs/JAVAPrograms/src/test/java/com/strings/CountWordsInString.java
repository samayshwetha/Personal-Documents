package com.strings;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str = "Welcome to JAVA Selenium And TestNG";
		
		//Approach1
		String[] words = str.split("\\s");    //str.split(" ");
		int count=0;
		for (String word : words) {
			count++;
		}
		System.out.println(count);
		
		//Approach2
		/*int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);*/
	}

	
}
