package com.programs.JavaPrograms;

public class ReverseWordsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String string ="Gayatri Thakare";
	
	String [] words = string.split(" ");
	
	StringBuilder result = new StringBuilder();
	
	for(String word:words) {
		
		String reverseWord = new StringBuilder(word).reverse().toString();
		result.append(reverseWord).append(" ");
	}
		
		System.out.println("Output: ="+result);
		
		
		
	}

}
