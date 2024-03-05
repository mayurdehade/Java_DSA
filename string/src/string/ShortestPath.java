//Given a route containing 4 direction (E, W, N, S) find the shortest path to reach destination. 
package string;

public class ShortestPath {
	
	public static float shortestPath(String path) {
		int x=0, y=0;
		
		for(int i=0; i<path.length(); i++) {
			//west
			if(path.charAt(i) == 'W') x--;
			//east
			else if(path.charAt(i) == 'E') x++;
			//north
			else if(path.charAt(i) == 'N') y++;
			//south
			else y--;
		}
		
		int x2 = x*x;
		int y2 = y*y;
		return (float)Math.sqrt(x2 + y2);
	}

	public static void main(String[] args) {
		String path = "WNEENESENNN";
		
		System.out.println("Shortest path is " + shortestPath(path));

	}

}
