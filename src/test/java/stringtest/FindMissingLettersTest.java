package stringtest;

import org.junit.Assert;
import org.junit.Test;

import strings.FindMissingLetters;

public class FindMissingLettersTest {
	
	@Test
	public void findMissingLetter1() {
		
		String str = "aaaa";
		String res = FindMissingLetters.solution(str);
		String expected = "bcdefghijklmnopqrstuvwxyz";
		
		Assert.assertEquals(expected, res);
		
	}
	
	@Test
	public void findMissingLetter2() {
		
		String str = "t y!qwertyuoplkjnmbvgas xdcFgvqacsvxbdgetryuibn ";
		String res = FindMissingLetters.solution(str);
		String expected = "hz";
		
		Assert.assertEquals(expected, res);
		
	}
	
	@Test
	public void findMissingLetter3() {
		
		String str = "t y!qwertyuoplkjnmbvgas xdcFgvqacsvxbdgetryuibnh ";
		String res = FindMissingLetters.solution(str);
		String expected = "z";
		
		Assert.assertEquals(expected, res);
		
	}
	
	@Test
	public void findMissingLetter4() {
		
		String str = "The quick brown fox jumps over the lazy dog";
		String res = FindMissingLetters.solution(str);
		String expected = "";
		
		Assert.assertEquals(expected, res);
		
	}

}
