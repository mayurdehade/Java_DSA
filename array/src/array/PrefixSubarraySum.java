//Prefix subarray sum -> Efficient way
package array;

public class PrefixSubarraySum {

	public static void prefixSubarraysum(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];
		
		//calculating prefix array
		prefix[0] = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			prefix[i] = prefix[i-1] + numbers[i];
		}
		
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i+1; j<numbers.length; j++) {
				int end = j;
				
				//Prefix Logic
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
				
				if(maxSum < currSum) { maxSum = currSum; }
			}
		}
		System.out.println("Max sum: " + maxSum);
	}
	
	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,5};
		prefixSubarraysum(numbers);
		
	}

}
