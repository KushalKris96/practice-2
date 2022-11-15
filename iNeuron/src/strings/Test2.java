package strings;

public class Test2 {
	public static void main(String[] args) {
		
	/*	char ch = 'a';//97  97-32=65
		System.out.println(ch);
		 ch = (char)(ch-32);
		System.out.println(ch); */
		
	/*	String s1 = "ineuron";
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			s2 = s2+(char)(s1.charAt(i)-32); //int --> char explicit type casting but  char-->int  implicit type casting
		}
		System.out.println(s2); */
		
	/*	String s1="INEURON";
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			s2 = s2+ (char)(s1.charAt(i)+32);
		}
		System.out.println(s2); */
		
		String ss = "InEUrOn";
		String ss2 = "";
		
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)>='a' && ss.charAt(i)<='z') {
				ss2 = ss2+(char)(ss.charAt(i)-32);
			}
			else {
				ss2 = ss2+(char)(ss.charAt(i)+32);
			}
		}
		System.out.println(ss);
		System.out.println(ss2);
	}
}
