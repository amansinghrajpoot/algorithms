package arrays;

import java.util.LinkedList;

public class MaxSubsequentSum {

	public static int solution(int N, int K, LinkedList<Integer> A) {
		
		int i = - 1;
		int max = 0;
		int sum = 0;
		
		for(int j = 0; j < A.size(); j ++) {
			
			sum = (int) Math.pow(i, j + 1) *  A.get(j); // -1
			
			for(int k = j + 1; k < A.size(); k++) {
				       
             if(
                  (int) Math.pow(i, k + 1) *  A.get(k) -   // 3--2 = 5  // -2-3
                  (int) Math.pow(i, k) *  A.get(k-1) >= K)
            	 
				{ j = k; break;}
				
				sum = sum + (int) Math.pow(i, k + 1) *  A.get(k); // -1 + 3 = 2
				if (sum > max ) max = sum;
				//else j = k;
								
				
			}
		}
		
		
		return max;
	}
	
}

