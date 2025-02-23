package corejava;
import java.util.Scanner;

public class Ts07_Swap_to_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A  Swap number is:");
		int num1=sc.nextInt();
		System.out.println("Enter B  Swap number is:");
		int num2=sc.nextInt();
		System.out.println("Before Swaping two Numbers");
		System.out.println("num1= "+num1+" num2= "+num2);
		System.out.println();
		num1=num1-num2;//n1=20-10=10
		num2=num1+num2;//n2=10+20=30
		num1=num2-num1;//n1=30-10=20
		System.out.println("After Swaping two Numbers");
		System.out.println("num1= "+num1+" num2= "+num2);
	}

}
