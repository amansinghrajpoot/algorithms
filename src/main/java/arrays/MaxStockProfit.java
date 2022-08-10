package arrays;

public class MaxStockProfit {
   
    public static int maxProfit(int[] prices) {
        
    	 int l = 0,r = 1;
         int max = 0;
         int diff = 0;
         
         while(r < prices.length){
           if(prices[l] <= prices[r]){
            
        	   diff = prices[r] - prices[l];
        	   if(max < diff) max = diff; 
        	   r++;
          
           }else{
             l ++;
           }
         }
         return max;
    }
}


/*   
                     max = 4
    [1,0,5,3,6,14]
                 

*/