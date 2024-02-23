//Print max sum of subarray
package array;

public class MaxSubarraySum {
	
	public static void maxSubarraySum(int numbers[]) {
		int maxsum = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i+1; j<numbers.length; j++) {
				int end = j;
				int currentSum = 0;
				for(int k=start; k<=end; k++) {
					currentSum += numbers[k];
				}
				System.out.print(currentSum + " ");
				if(currentSum > maxsum) maxsum = currentSum;
			}
		}
		System.out.print("\nMaximum Subarray sum: " + maxsum);
	}

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		
		maxSubarraySum(numbers);

	}

}
