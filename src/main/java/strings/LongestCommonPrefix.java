package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	 public static String longestCommonPrefix(String[] strs) {
	        
	        Arrays.sort(strs);
	        int last = strs.length;
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 0 ; i < strs[0].length(); i++ ){
	            
	            try{
	                if(strs[0].charAt(i) == strs[last - 1].charAt(i))
	                    sb.append(strs[0].charAt(i));
	                else
	                    break;
	            }
	            catch(Exception e){
	                return sb.toString();
	            }
	            
	        }
	        return sb.toString();
	        
	    }

}
