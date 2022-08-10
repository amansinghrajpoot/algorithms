package strings;

import java.util.HashSet;

public class LongestPalindrome {
	
    public static String longestPalindrome(String s) {
        
        int maxlen = 0;
        int curlen = 0;
        
        int bs = 0, be = 0;
        
        HashSet<String> hs = new HashSet<>();
        hs.add("0,0");
        for(int i = 1; i < s.length(); i++) {
            hs.add(i+","+i);
        	if(s.charAt(i) == s.charAt(i - 1)) hs.add((i - 1)+","+i);
        }
        
        if(s.length() == 1 || ( s.length() == 2 && s.charAt(0) == s.charAt(1))) return s;
        int i = 0, j = 0;
        
        for(int step = 0; step < s.length(); step ++) {
      
        	j = i + step;
        	
        	while(j < s.length() && i < s.length()) {
        		
        		curlen = j - i + 1;
        		if(curlen >= maxlen && isPalindrome(s, i, j, hs)) {
        			maxlen = curlen;
        			bs = i; be = j;
        		}
        		i++; j++;
        	}
        	i = 0;
        }
    	
    	return s.substring(bs, be + 1);
    }
    
    private static boolean isPalindrome(String s, int i, int j, HashSet<String> hs) {
    	
    	if(hs.contains(i+","+j)) return true;
    	int subi = i + 1, subj = j -1; 
    	
    	if(s.charAt(i) == s.charAt(j) && hs.contains(subi+","+subj)) 
    	{
    		hs.add(i+","+j);
    		return true;
    	}
        return false;
    	
    }

}


/*
   "babad"               baba     "a b a b b a a b b a a"
   "abcba"                         0 1 2 3 4 5 6 7 8 9 10
                 {2, 4}
                          
    
*/     