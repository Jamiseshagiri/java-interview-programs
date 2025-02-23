package corejava;
import java.util.Scanner;

public class Ts13_Tables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Table number is:");
		int n=sc.nextInt();
		System.out.println("How many Numbers table:");
		int i=sc.nextInt();
		System.out.println("Start Code");
		for(int s=1;s<=i;s++) {
			System.out.println(n+"  *  "+s+"  =  "+n*s);
		}
		
		System.out.println("End Code");
			}

}//5*1=5;
