package strings;

public class HaystackAndNeedle {
	
	 public static int strStr(String haystack, String needle) {
	        
		 int len = needle.length();
	        int count = 0;
	        int k = 0;
	        
	        if(haystack.equals(needle)) return 0;
	        
	        for(int i = 0; i < haystack.length() - len + 1; i++){
	           
	            k = i;     
	            
	            for(int j = 0; j < len; j++ ){
	                
	                if(haystack.charAt(k) == needle.charAt(j)){
	                count++; 
	                }
	                k++;
	                
	            }  
	            if (count == len) return i;
	            count = 0;
	            
	        }
	            
	        return -1;
	        
	        
	    }

}
