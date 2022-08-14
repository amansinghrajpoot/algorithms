package arrays;

public class SearchInsertPosition {
	
	 public static int searchInsert(int[] nums, int target) {
	        
	        int idx = binarySearch(0, nums.length -1, nums, target);
	        return idx;
	        
	    }
	    
	    private static int binarySearch(int low, int high, int[] nums, int target){
	        
	        if(low >= high ) {
	            if(target > nums[low]) return low + 1;
	            return low;
	        }
	        
	        int idx = low;
	        int mid = (low + high)/ 2;
	        
	        if(nums[mid] == target) return mid;
	        
	        if(target > nums[mid]){
	            idx =  binarySearch(mid + 1, high, nums, target);  // 2, 3  //22
	        }
	        else if(target < nums[mid]) {
	            idx = binarySearch(low, mid - 1, nums, target); }
	        
	        
	        
	        return idx;
	    }

}
