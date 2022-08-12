package arrays;

public class RemoveElement {
	
	 public static int removeElement(int[] nums, int val) {
		 
		 int j = nums.length - 1;
		 int temp = 0;
		 int count = 0;
        
		 for (int i = 0; i < nums.length; i ++) {
			 
			 if(nums[i] != val)	{ continue; }
                 
			 while (nums[j] == val && j > i) j--;
			 temp = nums[j]; nums[j] = nums[i]; nums[i] = temp;
             
		 }
		 
       
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val) break;
            count++;
        }
		 return count;
	    }

}


//[0,1,2,2,3,0,4,2]