package project_oops;
import java.util.Scanner;

abstract class Shapes{
	float area;
	abstract public void input();
	abstract public void compute();
	public void display() {
		System.out.println("The Area is : "+area);
	}
}
class Geometry{
	void permit(Shapes s) {
		s.input();
		s.compute();
		s.display();
	}
}
class Rectangle extends Shapes{
	float length;
	float breath;
//	float area;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of Rectangle");
		length = sc.nextFloat();
		System.out.println("Please enter the breadth of Rectangle");
		breath = sc.nextFloat();
	}
	public void compute() {
		area=length*breath;
	}
}
class Square extends Shapes{
	float length;
	//float area;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of square");
		length = sc.nextFloat();
	}
	public void compute() {
		area=length*length;
	}

}
class Circle extends Shapes{
	final float pi=3.14f;
	float radius;
	//float area;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter radius of circle");
		radius = sc.nextFloat();
		
	}
	public void compute() {
		area=pi*radius*radius;
	}

}
public class Main {
    public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		System.out.println("Hello");
		
		/*
		 * r.input(); r.compute(); r.display();
		 * 
		 * s.input(); s.compute(); s.display();
		 * 
		 * c.input(); c.compute(); c.display();
		 */
		
	}
}




