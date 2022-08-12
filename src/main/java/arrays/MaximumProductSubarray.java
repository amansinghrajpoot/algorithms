package arrays;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        
    	int curmin = 1;
    	int curmax = 1;
        int temp = 1;
        int res = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 0) {curmin = 1; curmax = 1;}
            temp = curmax;
            
            curmax = Math.max( Math.max(curmax * nums[i], curmin * nums[i]), nums[i]);
    		curmin = Math.min( Math.min(curmin * nums[i], nums[i] ), temp * nums[i]);
    		res = Math.max(res, curmax);
    	}    	
    	return res;
    }
}
 /*
    negative product =  -12
    positive product =  6
    
   [2,3,-2,4]
   
*/