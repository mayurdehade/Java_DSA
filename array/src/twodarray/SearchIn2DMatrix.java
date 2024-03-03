//Program to search in 2D matrix
package twodarray;

public class SearchIn2DMatrix {
	
	public static boolean searchMatrix(int matrix[][], int key) {
		int row = 0, col = matrix[0].length-1;
		
		while(row < matrix.length && col >= 0) {
			if(matrix[row][col] == key) {
				System.out.println("Key found at ("+row+", "+col+")");
				return true;
			}
			else if(matrix[row][col] > key) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(searchMatrix(matrix, 10));
	}

}
