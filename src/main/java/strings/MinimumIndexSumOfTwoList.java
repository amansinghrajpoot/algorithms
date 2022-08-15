package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoList {
	
	 public static String[] findRestaurant(String[] list1, String[] list2) {
	        
	        /*
	             ["Shogun","Tapioca Express","Burger King","KFC"]
	              ["KFC","Shogun","Burger King"]        
	        */
	        
	        HashMap<String, Integer> hm = new HashMap<>();
	        
	        for (int i = 0; i < list1.length; i++)  
	           hm.put(list1[i], i + 1);
	          
	         int minsum = Integer.MIN_VALUE;
	         int temp = 0;
	         ArrayList<String> al = new ArrayList<String>(list1.length);
	        
	        for(int i = 0; i< list2.length; i++){
	            
	                if(hm.containsKey(list2[i])){
	                   
	                    temp = hm.get(list2[i]);
	                    temp = -1 * (temp + i + 1);
	                    hm.put(list2[i], temp);
	                     if (minsum < temp ) 
	                        { minsum =  temp; } 
	                        
	                 } 
	         }
	          Integer idx = null;
	          for(int i = 0; i < list1.length; i++){
	              idx = hm.get(list1[i]);
	              if(idx != null && idx < 0 && idx == minsum ) al.add(list1[i]);
	          }
	    String[] res = new String[al.size()];
	    for(int i = 0; i < res.length; i++) res[i] = al.get(i);
	    return res;
	    }

}
