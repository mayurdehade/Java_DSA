//Max Subarray Sum (Kadane's Algorithm)
package array;

public class MaxSubarraySum2 {
	
	public static void maxSubarraySum(int numbers[]) {
		int currSum = 0, maxSum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			currSum += numbers[i];
			if(currSum < 0) currSum = 0;
			if(currSum > maxSum) maxSum = currSum;
		}
		System.out.println("Max Subarray Sum: " + maxSum);
	}

	public static void main(String[] args) {
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		maxSubarraySum(numbers);

	}

}
