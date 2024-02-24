//Given n non-negative integers representing an elevation map where the width 
//of each bar is 1, compute how much water it can trap after raining.
package array;

public class TrappingRainWater {
	
	public static int waterTraped(int height[]) {
		int water = 0;
		int n = height.length;
		
		if(n > 2) {
			int rightMax[] = new int[n];
			int leftMax[] = new int[n];
			
			leftMax[0] = height[0];
			rightMax[n-1] = height[n-1];
			
			//left max
			for(int i=1; i<n; i++) {
				leftMax[i] = Math.max(leftMax[i-1], height[i]);
			}
			
			//right max
			for(int i=n-2; i>=0; i--) {
				rightMax[i] = Math.max(rightMax[i+1], height[i]);
			}
			
			//for calculating water
			for(int i=0; i<n; i++) {
				water += Math.min(leftMax[i], rightMax[i]) - height[i];
			}
		}
		
		return water;
	}

	public static void main(String[] args) {
		
		int height[] = {4,2,0,6,3,2,5};

		System.out.println("Trapped Water: " + waterTraped(height));
	}

}
