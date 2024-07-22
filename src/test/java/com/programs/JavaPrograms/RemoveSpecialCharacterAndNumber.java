package com.programs.JavaPrograms;

public class RemoveSpecialCharacterAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "Gayatri#123";
String output = input.replaceAll("[^a-zA-Z]", "");
System.out.println("Output is:= "+output);
	}

}
