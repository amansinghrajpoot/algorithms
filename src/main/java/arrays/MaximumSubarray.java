package arrays;

public class MaximumSubarray {

	public static int solution(int[] nums) {
		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(currsum + nums[i] < nums[i]) currsum = nums[i];
			else currsum = nums[i] + currsum;
			
			if(maxsum < currsum) maxsum = currsum;
		}
		
		return maxsum;
	}
}


/*
      [-2,1,-3,4,-1,2,1,-5,4]   max = 1    cursum = 1
      
      [1, 3, 4, -1, 3, 5, 6, 7]
      
*/