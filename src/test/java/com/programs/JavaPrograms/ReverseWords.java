package com.programs.JavaPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		 // Split the input string into words
		String string = "Gayatri Thakare";
		
		String [] wordString = string.split(" ");
		 // Initialize a StringBuilder to build the result
		StringBuilder result = new StringBuilder();
		// Traverse the words array in reverse order and append to the result
		for(int i = wordString.length-1;i>=0;i--) {
			
			 result.append(wordString[i]);
	            if (i != 0) {
	                result.append(" ");
			}
		}
		System.out.println(result.toString());
		
	}

}
