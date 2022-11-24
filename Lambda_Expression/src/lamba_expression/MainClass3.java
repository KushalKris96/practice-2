//WAP to compute length of String
package lamba_expression;
@FunctionalInterface
interface CLS{
	int getLength(String str);
}

/*
 * class LOS implements CLS{
 * 
 * @Override public int getLength(String str) { int length = str.length();
 * return length; } }
 */
public class MainClass3 {

	public static void main(String[] args) {
//		LOS l = new LOS();
//		System.out.println(l.getLength("ineuron.ai"));
	
		/*
		 * CLS cls = new CLS(){
		 * 
		 * @Override public int getLength(String str) { return str.length(); } };
		 * System.out.println(cls.getLength("ineuron.ai"));
		 */
		
		CLS cls = str -> str.length();
		System.out.println(cls.getLength("ineuron.ai"));
	}
}
