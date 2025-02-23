package corejava;

public class Ts32_pattern7 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				if(j==3 && i==2) {
					System.out.print("$ ");
				}else if(j==5&&i==1){
					System.out.print("s ");
				}else {
				System.out.print("*  ");
			}
			
		}
			System.out.println(" ");
	}

}
}