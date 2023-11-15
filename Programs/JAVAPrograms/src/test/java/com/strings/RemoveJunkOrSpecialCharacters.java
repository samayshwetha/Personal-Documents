package com.strings;

public class RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {
		
		//Uisng regular expression remove all the special characters
		String str = "$%^*&&shwetha$#%$#%$%";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);        //output: shwetha
		
		String str1="'?<>@#$%^&Samay@#$%^&8~``Gowda";
		str1=str1.replaceAll("[a-zA-Z0-9]", "");
				System.out.println(str1);   //output:'?<>@#$%^&@#$%^&~``

	}

}
