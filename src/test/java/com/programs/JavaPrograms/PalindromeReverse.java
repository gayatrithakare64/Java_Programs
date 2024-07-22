package com.programs.JavaPrograms;

public class PalindromeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string = "MadaM";
String reverseString = "";
for(int i=string.length()-1;i>=0;i--) {
	reverseString = reverseString+string.charAt(i);
}
if(string.equals(reverseString)) {
	System.out.println("It is Palindrome");
}
else {
	System.out.println("It is not Palindrome");
}
	}

}
