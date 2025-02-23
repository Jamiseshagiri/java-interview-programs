package corejava;

import java.util.Scanner;

public class Ts35_Do_While_loop {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the a value numbers is :: ");
	int n=sc.nextInt();
	int a=1;
	do {
		System.out.println("a vlues is:: "+a);
		a++;
	}while(a<=n);
	
	}
	
}


	


