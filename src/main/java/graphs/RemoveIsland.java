package graphs;

public class RemoveIsland {
	
	public static void solution(int[][] matrix) {
		
		if (matrix.length == 1 && matrix[0].length == 0 ) return;
		
		for(int i = 0; i < matrix[0].length; i++) {
		   if(matrix[0][i] == 1) 
			 rec(0, i, matrix);
		}
				
		for(int i = 0; i < matrix[0].length; i++ ) {
		   if(matrix[matrix.length - 1][i] == 1)
		      rec(matrix.length - 1, i, matrix);
		}
		
		for(int i = 0; i < matrix.length; i++ ) {
		  if(matrix[i][0] == 1)
			  rec(i, 0, matrix);
		}
	
		for(int i = 0; i < matrix.length; i++ )
			if(matrix[i][matrix[0].length - 1] == 1)
		      rec(i, matrix[0].length - 1, matrix);	
	}

	private static void rec(int i, int j, int[][] matrix) {
		
		if(!is_safe(i, j, matrix )) return;
		if(matrix[i][j] != 1) return;
		
		matrix[i][j] = 0;
		
		rec(i, j + 1, matrix);
		rec(i + 1, j, matrix);
		rec(i, j - 1, matrix);
		rec(i - 1, j, matrix);		
		
	}
	
	private static boolean is_safe(int i, int j, int[][] matrix) {
       
		if(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length)
			return true;
		return false;
	}
	
}
