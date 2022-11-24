package lamba_expression;
@FunctionalInterface
interface Add{
	void add(int a,int b);
}
@FunctionalInterface
interface Sub{
	int sub(int num1);
}
public class MainClass2 {
     public static void main(String[] args) {
//		Add add = (a,b)->{
//			int res=a+b;
//			System.out.println(res);
//		};
    	 Add add = (a,b)->System.out.println(a+b);
		add.add(10,20);
//		
//		Sub s = num1->{
//			int res = num1-5;
//			return res;
//		};
		Sub s = num1 -> num1-5;
		System.out.println(s.sub(10));
	}
}
