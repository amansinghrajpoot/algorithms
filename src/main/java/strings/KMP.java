package strings;

public class KMP {
    
	public static boolean solution(String str, String pattern) {
		
		if(str.equals("") || pattern.equals("")) return false;
		int[] p = PrefixArray.build(pattern);
		
		int j = 0, i = 0;
        
		while ( i < str.length() && j < pattern.length()) {
			
			if(str.charAt(i) == pattern.charAt(j)) { i++; j++; continue;}
			while(str.charAt(i) != pattern.charAt(j) && j > 0) {
				j = p[j - 1];
			}
			if(str.charAt(i) != pattern.charAt(j) && j == 0) i++;
			
		}
        if( j == (pattern.length() )) return true;
		return false;
	}
}
