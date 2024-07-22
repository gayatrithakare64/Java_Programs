package com.programs.JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Gayatri Thakare";
		String revString= "";
		for(int i=string.length()-1;i>=0;i--) {
			
			revString = revString+string.charAt(i);
		}
		System.out.println("Reverse String is: "+ revString);
	}

}
