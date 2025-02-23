package corejava;
public class Ts00_Demo {

	public int m1(int a) {
		
		return a*2;
		
	}
public int m2(int a,int b) {
		
		return a+b;
		
	}
public int m3(int a,int b,int c) {
	
	return a*b*c;
	
}
public int m4(int a,int b,int c,int d) {
	
	int res1 =m1(a);
	int res2= m2(res1,b);
	int res3=m3(res1,res2,c);
	return res1+res2+res3+d;
	
}
public static void main(String[] args) {
	
	Ts00_Demo obj=new Ts00_Demo();
	int frs=obj.m4(1, 1, 1, 1);
	System.out.println("Finel results::"+frs);
}

	
	
}
