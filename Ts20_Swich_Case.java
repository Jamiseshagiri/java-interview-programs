package corejava;
import java.util.*;

public class Ts20_Swich_Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day Number is :");
		int day=sc.nextInt();
		if(day==0) {
			System.out.println("Current Numbers 1 to 7 nunbers only!! Plz Try Agin???");
		}
		else {
			System.out.println("Current Numbers 1 to 7 nunbers only!! Plz Try Agin???");
		}
		switch (day) {
		case 1: 
			System.out.println("Welcome to Monday");
		break;
		case 2: 
			System.out.println("Welcome to Tuesday");
		break;
		case 3: 
			System.out.println("Welcome to Wednesday");
		break;
		case 4: 
			System.out.println("Welcome to Thursday");
		break;
		case 5: 
			System.out.println("Welcome to Friday");
		break;
		case 6: 
			System.out.println("Welcome to Saturday");
		break;
		case 7: 
			System.out.println("Welcome to sunday");
			break;
			
			
		}
		}
	}