package static_topic;

class Demo2
{
	int a;
	int b;
	
	static int count;
	{
		count++;
	}
	Demo2()
	{
		
	}
	Demo2(int a)
	{
		this.a=a;
	}
	Demo2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

}
public class Test3 {

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2(10);
		Demo2 d3 = new Demo2(10,20);
		
		System.out.println(Demo2.count);
	}
}
