
public class _7demo {
	public static void main(String args[]){
		int m = 3;
		int n = 4;
		int[][] matrix_1 = new int[m][n];
		matrix_1[0][0] = 0;
		matrix_1[0][1] = 1;
		matrix_1[0][2] = 2;
		matrix_1[0][3] = 3;
		
		matrix_1[1][0] = 4;
		matrix_1[1][1] = 5;
		matrix_1[1][2] = 0;
		matrix_1[1][3] = 7;
		
		matrix_1[2][0] = 8;
		matrix_1[2][1] = 9;
		matrix_1[2][2] = 10;
		matrix_1[2][3] = 11;

		int[][] matrix_2 = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
		
		System.out.println("Method print2DMatrix");
		System.out.println("matrix_1 is (before) ");
		print2DMatrix(matrix_1);
		System.out.println();	
		System.out.println("Method replaceRowAndColWith0If0");
		System.out.println("matrix_1 is (after) ");
		print2DMatrix(replaceRowAndColWith0If0(matrix_1));
		System.out.println();
		
		System.out.println("Method print2DMatrix");
		System.out.println("matrix_2 is (before)");
		print2DMatrix(matrix_2);
		System.out.println();
		System.out.println("Method replaceRowAndColWith0If0");
		System.out.println("matrix_2 is (after)");
		print2DMatrix(replaceRowAndColWith0If0(matrix_2));
		
		
	}
	
	public static void print2DMatrix(int[][] matrix){
		System.out.println("[");
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("]");
	}
	
	public static int[][] replaceRowAndColWith0If0(int[][] matrix){
		int[][] duplicated = new int[matrix.length][matrix[0].length];
		for(int r = 0; r<matrix.length; r++){
			for(int c = 0; c<matrix[0].length; c++){
				duplicated[r][c] = matrix[r][c];
			}
		}
		
		for(int row=0; row<matrix.length; row++){
			for(int col=0; col<matrix[0].length; col++){
				if(matrix[row][col] == 0){
					for(int cc = 0; cc < duplicated[0].length; cc++) {
						duplicated[row][cc] = 0;
					}
					for(int rr = 0; rr < duplicated.length; rr++) {
						duplicated[rr][col] = 0;
					}
					break;
				}
			}
		}
		return duplicated;
	}
}
