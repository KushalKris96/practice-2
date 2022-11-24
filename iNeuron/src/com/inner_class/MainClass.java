package com.inner_class;

abstract class Computer{
	public abstract void config();
}
class Laptop extends Computer{
	public void config() {
		System.out.println("Its working");
	}
}
public class MainClass {
   public static void main(String[] args) {
//	Computer obj = new Laptop();
//	obj.config();
	   Computer obj = new Computer() //Annonymous inner class
	   {
		  public void config() {   
			  System.out.println("Its annonymous");
		  }
	   };
	   obj.config();
  }
}
