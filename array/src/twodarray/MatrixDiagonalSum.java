package twodarray;

public class MatrixDiagonalSum {
	
	public static int matrixSum(int matrix[][]) {
		int sum = 0;
		for(int i=0; i<matrix.length; i++) {
			sum += matrix[i][i] + matrix[i][matrix.length-1-i];
		}
		if(matrix.length/2 == 1) {
			sum -= matrix[(matrix.length-1)/2][(matrix.length-1)/2];
		}
		return sum;
	}

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println("Sum: "+ matrixSum(matrix));

	}

}
