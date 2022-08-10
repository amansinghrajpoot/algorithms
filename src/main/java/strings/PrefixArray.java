package strings;

/*
 *  Class create a prefix array from the given pattern string.
 *  [a, b, c, a, b, d]
 *  [0, 0, 0, 1, 2, 0]
 */

public class PrefixArray {

	public static int[] build(String pattern) {
		
		int[] p = new int[pattern.length()];
		
		int j = 0; int i = 1;
		p[j] = 0;
		
		while( i < pattern.length() && j < pattern.length()) {
	    
			    if(pattern.charAt(j) != pattern.charAt(i) && j == 0) { p[i] = 0; i++; continue;}      
  			    if(pattern.charAt(j) == pattern.charAt(i)) { p[i] = j + 1; i++; j++; continue; }
  			    
  			    while(pattern.charAt(j) != pattern.charAt(i) && j > 0)  j = p[j - 1];  			   
		}
		
		return p;
	}
}

