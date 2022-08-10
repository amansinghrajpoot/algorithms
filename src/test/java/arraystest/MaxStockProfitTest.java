package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.MaxStockProfit;

public class MaxStockProfitTest {
	
	@Test
	public void isCorrect() {
		
		int[] prices = {7,1,5,3,6,4};
		int result = MaxStockProfit.maxProfit(prices);
		Assert.assertEquals(5, result);
	}

	@Test
	public void isCorrect2() {
		
		int[] prices = {7,6,4,3,1};
		int result = MaxStockProfit.maxProfit(prices);
		Assert.assertEquals(0, result);
	}
}
