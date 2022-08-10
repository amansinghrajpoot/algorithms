package strings;

import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static int solution(String s) {
			
			int maxlen = 0;
			int len = 0;
			Integer idx = null;
			
			HashMap<Character, Integer> hm = new HashMap<>();
			for(int j = 0; j < s.length(); j++ ) {
				
				idx = hm.put(s.charAt(j), j);
				if (idx == null)
			    {
	                
					if(++len > maxlen) maxlen = len;
				}
				else { 
					len = 0;
					j = idx;
					hm.clear();	
				}
			}
			
			return maxlen;
	}
}


/*
     "abcabcdbb"


*/