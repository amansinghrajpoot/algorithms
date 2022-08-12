package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesSortedArray {
	
    public static int removeDuplicates(int[] nums) {
        
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
              
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(!hs.contains(nums[i])) {
            	hs.add(nums[i]);
            	nums[j] = nums[i];
            	j++;
            }
            
        } 
        
        return hs.size();
        
        
    }

}

/*
      [0,0,1,1,1,2,2,3,3,4]
      
      [0, 1, 2]
      temp = 0;
      
*/