package corejava;
import java.util.Scanner;

public class Ts11_Fat_Number {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number is:");
			int num=sc.nextInt();
			int fact=1,i;
			for(i=1;i<=num;i++) {
				
				fact=fact*i;
			}
			System.out.println("Factorial "+num+" of "+fact);
		}
		
		
		
	}

}
