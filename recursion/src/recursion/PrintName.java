//Print your name 100 times without using loop
package recursion;

public class PrintName {
	public static void printName(String name, int i) {
		
		if(i>0) {
			System.out.println(name);
			i--;
			printName(name, i);
		}
		
	}

	public static void main(String[] args) {
		
		printName("Mayur", 100);
	}

}
