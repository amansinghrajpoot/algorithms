package stringtest;

import org.junit.Assert;
import org.junit.Test;

public class MinimumIndexSumOfTwoListTest {
	
	@Test
	public void checkList() {
		
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Shogun","Burger King"};
		
		String[] result = strings.MinimumIndexSumOfTwoList.findRestaurant(list1, list2);
		String[] expected = {"Shogun"};
		
		Assert.assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void checkList2() {
		
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Burger King", "Tapioca Express", "Shogun" };
		
		String[] result = strings.MinimumIndexSumOfTwoList.findRestaurant(list1, list2);
		String[] expected = {"Shogun","Tapioca Express","Burger King","KFC"};
		
		Assert.assertArrayEquals(expected, result);
		
	}

}
