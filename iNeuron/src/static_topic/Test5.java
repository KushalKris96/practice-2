package static_topic;

class Hello
{
	static int a;
	static {
		a=10;
	}
	static void disp() {
		System.out.println("static display "+a);
	}
}
public class Test5 {

	static void disp2() {
		System.out.println("Display 2 ");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		disp2();
		Hello.disp();
		
		Hello hello = new Hello();
		hello.disp();
		
	}
}
