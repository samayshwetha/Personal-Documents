package com.strings;

public class RevomeWhiteSpacesInaString {

	public static void main(String[] args) {
		
		String str = "Shwetha    Lingaraja     Nadagi";
		System.out.println("Before removing white spaces: "+str);
		str =str.replaceAll("\\s", "");
		System.out.println("After removing white spaces: "+str);

	}

}
