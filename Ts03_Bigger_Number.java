package corejava;
import java.util.Scanner;
public class Ts03_Bigger_Number {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter The Two Number is  ");
		 n1=sc.nextInt();
		  n2=sc.nextInt();
		if(n1 >n2) {
			System.out.println(n1+" is Bigger Number then "+n2);
		
	}else {
		System.out.println(n2+" is Bigger Number  then "+n1);
	}

}
}