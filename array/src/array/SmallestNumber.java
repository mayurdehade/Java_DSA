//Program to find smallest number in give array
package array;

public class SmallestNumber {
	
	public static int getSmallest(int numbers[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int numbers[] = {57, 23, 89, 42, 11, 65, 78, 33, 5, 91, 20, 74, 8, 50, 16, 29, 63, 37, 3, 68};
		
		System.out.println("Smallest number is : " + getSmallest(numbers));

	}

}
