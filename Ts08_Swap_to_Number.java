package corejava;

import java.util.Scanner;

public class Ts08_Swap_to_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A  Swap number is:");
		int num1=sc.nextInt();
		System.out.println("Enter B  Swap number is:");
		int num2=sc.nextInt();
		System.out.println("Before Swaping two Numbers");
		System.out.println("num1= "+num1+" num2= "+num2);
		System.out.println();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swaping two Numbers");
		System.out.println("num1= "+num1+" num2= "+num2);
	}

}
