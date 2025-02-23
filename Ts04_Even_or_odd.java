package corejava;
import java.util.Scanner;
public class Ts04_Even_or_odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number ");
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println(num+ "  is a Evenu Number");
	}else {
		System.out.println(num+"  is a Odd Number");
	}
		
}
}
