package static_topic;

public class Test4 {

	static int a;
	static {
		a=10;
		System.out.println("static block-1");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
