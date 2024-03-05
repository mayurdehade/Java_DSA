//Program to find substring of given string 
package string;

public class Substring {
	
	public static String substring(String str, int si, int ei) {
		String substr = "";
		for(int i=si; i<ei; i++) {
			substr += str.charAt(i);
		}
		return substr;
	}

	public static void main(String[] args) {
		String str = "Hello Mayur";
		
		System.out.println("Substring form index 6 to 11: " + substring(str, 6, 11));

	}

}
