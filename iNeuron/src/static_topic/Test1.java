package static_topic;

class Demo
{
	static int a;
	static int b;
	static
	{
		System.out.println("static block");
		a=10;
		b=20;
	}
	static void display()
	{
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
	
	}

	int x;
	int y;
	{
		x=30;
		y=40;
		System.out.println("Non static java block");
	}
	Demo()
	{
		System.out.println("Constructor");
	}
	void display1()
	{
		System.out.println("Non static method");
		System.out.println(x);
		System.out.println(y);
		
	
	}
	
}
public class Test1 {
   public static void main(String[] args) {
	   Demo.display();
//	   Demo d = new Demo();
//	   d.display1();
  }
}
