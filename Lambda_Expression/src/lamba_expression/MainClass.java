package lamba_expression;
//@FunctionalInterface
interface Demo{
	void disp();
	void add(int a,int b);
}
/*
 * class Trial implements Demo{ public void disp() {
 * System.out.println("Hello Java Lovers"); } }
 */
public class MainClass {
	public static void main(String[] args) {
//		Demo d = ()-> System.out.println("Hello All");
//		d.disp();
		/*
		 * Trial t = new Trial(); t.disp();
		 */
		Demo d = new Demo() {
			public void disp() {
				System.out.println("Hello");
			}
			public void add(int a,int b) {
				int c = a+b;
				System.out.println(c);
			}
		};
		d.disp();
		d.add(10, 20);
		System.out.println("Hello all");
		System.out.println("1");
		System.out.println("2");
	}
}
