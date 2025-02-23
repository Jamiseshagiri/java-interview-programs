/**	what is Constructor method over loading in java?
 *  		-The process of creating multiple constructor with a  same name but
 *  		 different parameter list is  called constructor over loading
 */


package corejava;
class main{
	public void m1(int a, int b) {
		System.out.println("1");
	}
	public void m1(String a, int b) {
		System.out.println("2");
	}
	public void m1(String a, int b,double f1) {
		System.out.println("3");
	}
}
public class Ts33_constructor_over_loading {
public static void main(String[] args) {
	main a=new main();
	a.m1(1,2);
	a.m1("boom", 3);
	a.m1("boom",3,8.3);
}
}
