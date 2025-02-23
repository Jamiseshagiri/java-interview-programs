
package corejava;

import java.util.Scanner;

public class Ts19_pattern2 {
public static void main(String[] args) {
	int n,i,j;
	Scanner a=new Scanner(System.in);
	System.out.println("enter the Number is:");
	n =a.nextInt();
	System.out.println("-------------Start code------------------");
	System.out.println();
	for(  i=0;i<=n; i++) {
		for(j=0;j<=i;j++) {
		
			System.out.print("*  ");
			
		}
		System.out.println(" ");
		
}
	System.out.println();
	System.out.println("-------------End code-------------------");
	}

}

