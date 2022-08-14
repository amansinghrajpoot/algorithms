package strings;

import java.util.Arrays;

public class FindMissingLetters {
	
	public static String solution(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		//str = "aaa"
		
		String[] lowercase = "abcdefghijklmnopqrstuvwxyz".split("");
		int j = 0;
		String[] input = str.toLowerCase().split("");
		Arrays.sort(input);
		String temp = null;

		for(String i : input) System.out.print(i);

		for(int i = 0; i < input.length && j < lowercase.length; i++) {
			if(( (int) input[i].charAt(0) >= 65 && (int) input[i].charAt(0) <= 90 ) || ( (int) input[i].charAt(0) >= 97 && (int) input[i].charAt(0) <= 122 )) {
				
				if(input[i].equals(lowercase[j])) { temp = input[i]; j++; continue; }
				else if( temp != null && !temp.equals(input[i])) {
					i = i - 1;
					sb.append(lowercase[j]);
					j++;
				}
				
			}
		}
		for(int i = j; i < lowercase.length; i++) sb.append(lowercase[i]);
		
		return sb.toString();
	}

}
