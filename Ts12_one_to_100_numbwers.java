package corejava;
import java.util.Scanner;

public class Ts12_one_to_100_numbwers {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number is:");
		int num=n.nextInt();
		System.out.println("START METHOD");
		for(int s=0;s<=num;s++) {
			System.out.println("Nubmber\t"+s);
		}
		System.out.println("END METHOD");
		
	}

}
