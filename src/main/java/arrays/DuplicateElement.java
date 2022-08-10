package arrays;

import java.util.HashSet;

public class DuplicateElement {
	
	 public static boolean containsDuplicate(int[] nums) {
	     
		 HashSet<Integer> seensofar = new HashSet<>();
		 
		 for(int i = 0; i< nums.length; i++) {
			 
			 if(!seensofar.add(nums[i])) return true;			 
		 }
		 
		 return false;
	    }
	
}

/*
 *   [1,2,3,1]
 * 
 * 
*/
