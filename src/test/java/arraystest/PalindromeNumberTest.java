package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.PalindromeNumber;

public class PalindromeNumberTest {
	
	@Test
	public void isPalidrome1() {
		
		boolean result = PalindromeNumber.isPalindrome(-121);
		Assert.assertEquals(false, result);
		
	}
	@Test
	public void isPalidrome2() {
		
		boolean result = PalindromeNumber.isPalindrome(1221);
		Assert.assertEquals(true, result);
		
	}
	@Test
	public void isPalidrome3() {
		
		boolean result = PalindromeNumber.isPalindrome(1223);
		Assert.assertEquals(false, result);
		
	}
	@Test
	public void isPalidrome4() {
		
		boolean result = PalindromeNumber.isPalindrome(12);
		Assert.assertEquals(false, result);
		
	}
	
	@Test
	public void isPalidrome5() {
		
		boolean result = PalindromeNumber.isPalindrome(22);
		Assert.assertEquals(true, result);
		
	}
	
	@Test
	public void isPalidrome6() {
		
		boolean result = PalindromeNumber.isPalindrome(1);
		Assert.assertEquals(true, result);
		
	}

}
