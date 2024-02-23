//Subarray with min and max sum of subarray
package array;

public class SubArray2 {
	
	public static void printSubarray(int numbers[]) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i+1; j<numbers.length; j++) {
				int end = j;
				int sum = 0;
				for(int k=start; k<=end; k++) {
					System.out.print(numbers[k]+ " ");
					sum += numbers[k];
				}
				System.out.print("  Sum is: " + sum);
				if(sum < min) {
					min = sum;
				}
				else if (sum > max) {
					max = sum;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Max sum: " + max + " Min sum: " + min);
	}

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		
		printSubarray(numbers);
		

	}

}
