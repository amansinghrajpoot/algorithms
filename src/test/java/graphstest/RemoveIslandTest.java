package graphstest;

import org.junit.Assert;
import org.junit.Test;

import graphs.RemoveIsland;

public class RemoveIslandTest {

	@Test
	public void isOutputCorrect() {
		
		int[][] matrix = { {1, 0, 1, 1, 0, 1, 1},
                           {0, 0, 1, 0, 1, 1, 1},
                           {0, 1, 0, 1, 0, 1, 0},
                           {1, 0, 1, 0, 0, 0, 0},
                           {0, 1, 0, 0, 0, 0, 0}};
		
		RemoveIsland.solution(matrix);
		
		int[][] expectedMatrix = { {0, 0, 0, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0, 0, 0},
                                   {0, 1, 0, 1, 0, 0, 0},
                                   {0, 0, 1, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0, 0, 0}};
		Assert.assertArrayEquals(expectedMatrix, matrix);
		
	}
	
	@Test
	public void oneElement() {
		
		int[][] matrix = {{1}};
		
		RemoveIsland.solution(matrix);
		
		int[][] expectedMatrix = {{0}};
		Assert.assertArrayEquals(expectedMatrix, matrix);
		
	}
	
	@Test
	public void emptyArray() {
		
		int[][] matrix = {{}};
		
		RemoveIsland.solution(matrix);
		
		int[][] expectedMatrix = {{}};
		Assert.assertArrayEquals(expectedMatrix, matrix);
		
	}
	

	@Test
	public void allBorderSetToOne() {
		
		int[][] matrix = { {1, 1, 1, 1, 1},
                           {1, 0, 0, 0, 1},
                           {1, 0, 0, 0, 1},
                           {1, 0, 0, 0, 1},
                           {1, 1, 1, 1, 1}};
		
		RemoveIsland.solution(matrix);
		
		int[][] expectedMatrix = { {0, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0},
                                   {0, 0, 0, 0, 0 }};
		Assert.assertArrayEquals(expectedMatrix, matrix);
		
	}
	
	@Test
	public void allNonBorderSetToOne() {
		
		int[][] matrix = { {0, 0, 0, 0, 0},
                           {0, 1, 1, 1, 0},
                           {0, 1, 1, 1, 0},
                           {0, 1, 1, 1, 0},
                           {0, 0, 0, 0, 0}};
		
		RemoveIsland.solution(matrix);
		
		int[][] expectedMatrix = {  {0, 0, 0, 0, 0},
									{0, 1, 1, 1, 0},
									{0, 1, 1, 1, 0},
                					{0, 1, 1, 1, 0},
                					{0, 0, 0, 0, 0}};
		
		Assert.assertArrayEquals(expectedMatrix, matrix);
		
	}
	
	
}
