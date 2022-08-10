package strings;

public class LongestPalindrome2 {
	
	 public static String longestPalindrome(String s) {
		
		 int len1 = 0, len2 = 0, len = 0;
		 int start = 0, end = 0;
		 
		 for(int i = 0; i< s.length(); i++) {
			 
			 len1 = searchPalindrome(s, i, i);
			 len2 = searchPalindrome(s, i, i+1);
			 
			 len = Math.max(len1, len2);
			 
			 if(len > end - start) {
				 start = i - ((len -1)/2);
				 end = i + (len/2);
			 }
		 }
		 
		 return s.substring(start, end + 1);
	 }
	 
	 private static int searchPalindrome(String s, int i , int j) {
		 
         while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
        	 i--; j++;
         }
         
         return j - i - 1;
	 }

}


/* 

    "r a c e c a r"
     0 1 2 3 4 5 6     3 - ((7-1)/2) = 0          3 + (7/2) = 6

*/