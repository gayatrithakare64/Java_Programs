package com.programs.JavaPrograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        String input = "Gayatri#123";
	        
	        // Use a regular expression to replace all non-alphanumeric characters with an empty string
	        String output = input.replaceAll("[^a-zA-Z0-9]", "");
	        
	        // Print the result
	        System.out.println("Output: " + output);
	    }
	}

