package strings;

public class Test3 {

	public static void main(String[] args) {
	/*	String s1 = "iNeuron java";
		String s2 = "";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);  */
		
	/*	String str1="ineuron java";
		String str2="";
		
		String[] a = str1.split(" ");
		for(String e : a)
		{
			for(int i=e.length()-1;i>=0;i--) 
			{
				str2 = str2+e.charAt(i);
			}
			str2=str2+" ";
		}
		System.out.println(str2); */
		
		String ss = "ineuron java";
		String ss2 = "";
		
		String[] a = ss.split(" ");
		for(int i=a.length-1 ; i>=0 ;i--) {
			ss2 = ss2+a[i]+" ";
		}
		System.out.println(ss);
		System.out.println(ss2);
	}
}
