//Program to find largest number in array
package array;

public class LargestNumber {
	
	public static int getLargest(int numbers[]) {
		//stores minimum number
		int max = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > max ) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int numbers[] = {57, 23, 89, 42, 11, 65, 78, 33, 5, 91, 20, 74, 8, 50, 16, 29, 63, 37, 3, 68};
		
		System.out.println("Largest number is : " + getLargest(numbers));
		
	}

}
