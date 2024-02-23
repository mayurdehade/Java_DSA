//Program to implement Binary Search
package array;

public class BinarySerach {
	
	public static int binarySearch(int numbers[], int key) {
		int start = 0;
		int end = numbers.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			//comparisons
			if(numbers[mid] == key) {
				return mid;
			}
			if(numbers[mid] < key) {
				start = mid + 1;
			}
			if(numbers[mid] > key) {
				end = mid - 1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int key = 18;
		
		System.out.println("Key is at index: " + binarySearch(numbers, key));

	}

}
