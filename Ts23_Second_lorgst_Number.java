
package corejava;

import java.util.Arrays;

public class Ts23_Second_lorgst_Number {
	public static void m1(int a[]){
		int size=a.length;
		if(size<2){
			System.out.println("Invalid Input");
			return;
		}
		Arrays.sort(a);
		System.out.println(a[size-2]);
	
	}
	public static void main(String[] args){
		int[] a={1,3,4,5,6,36,40,41,47};
		m1(a);
	}

}
