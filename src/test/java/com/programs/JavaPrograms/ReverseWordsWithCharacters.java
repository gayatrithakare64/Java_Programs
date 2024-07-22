package com.programs.JavaPrograms;

public class ReverseWordsWithCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  string ="Gayatri Thakare";
		
		String [] wordStrings = string.split(" ");
		
		StringBuilder words = new StringBuilder();
		for (int i=wordStrings.length-1;i>=0;i--) {
			words.append(new StringBuilder(wordStrings[i]).reverse().toString());
			if(i!=0) {
				words.append(" ");
	
			}
			
		}

		System.out.println(words);
		
	}

}
