//Check palindrome of string
package string;

public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		str = str.toLowerCase();
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("mAdaM"));
		
	}

}
