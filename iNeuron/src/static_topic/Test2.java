package static_topic;

public class Test2 {

	static int a;
	static int b;
	static
	{
		System.out.println("static block-2");
		a=90;
		b=200;
		System.out.println(a);System.out.println(b);
	}
	static
	{
		System.out.println("static block-1");
		a=10;
		b=20;
	}
	
	static void display()
	{
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		display();
	}
}
