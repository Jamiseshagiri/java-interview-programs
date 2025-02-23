//How do you remove leading and trailing spaces from a string in Java.
package corejava;

public class Ts09_Remove_leading_and_Trailing_Spaces {
	public static void main(String[] args) {
		String s="        bbc abc ddd/t";
		s=s.strip();
		System.out.println(s);
	}

}
