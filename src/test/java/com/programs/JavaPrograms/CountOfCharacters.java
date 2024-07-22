package com.programs.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string = "GayatriThakare";

Map<Character, Integer> hMap = new HashMap<Character, Integer>();

char [] chars = string.toLowerCase().toCharArray();

for(char ch :chars) {
	
	if(hMap.containsKey(ch)) {
		
		hMap.put(ch, hMap.get(ch)+1);
	}
	else {
		hMap.put(ch, 1);
	}
}
		
		System.out.println(hMap);
		
	}

}
