package corejava;
import java.util.Scanner;

public class Ts14_Trafic_Signals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Coluor is: ");
//	String s1=sc.nextLine();
	String s1="mor";
	System.out.println("Start code");
	if(s1=="green") {
		System.out.println("move the Vehicles");
	}
	else if(s1=="yellow") {
		System.out.println("Start the Vehicles");
	}
	else if(s1=="red"){
		System.out.println("stop the Vehicles");
	}else {
		System.out.println("Enter a Trafic Signal Colors only ! try agin...");
		
	}
	System.out.println("End code");
	
}
}
