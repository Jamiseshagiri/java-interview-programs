package corejava;

public class Ts29_pattern4 {
	public static void main(String[] args) {
		for( int i=1;i<=4; i++) {
			for(int j=1;j<=6;j++) {
				if(i==1 && j==2) {
				System.out.print("g  ");
				}else if(i==3 && j==1) {
					System.out.print("s  ");
				}
				else if(i==4 && j==5) {
					System.out.print("J  ");
				}else {
					System.out.print("*  ");
					
				}
			}
			System.out.println(" ");
	}

}
}
	