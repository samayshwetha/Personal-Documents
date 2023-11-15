package com.strings;

public class CountOccurenceOfCharactersInString {

	public static void main(String[] args) {
		
		String str = "Java Programming Java OOOOPS";
		int total_count=str.length();
		int after_count = str.replaceAll("J","").length();
		int occurence = total_count-after_count;
		System.out.println("Number of occurence: "+occurence);
		System.out.println(total_count);
		System.out.println(after_count);
	}

}
