package corejava;

public class Ts10_String_Revers {
public static void main(String[] args) {
	String s1= "Hi java programing";
	String rev="";
	int  s = s1.length();
	for(int i=s-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
	
}
}
