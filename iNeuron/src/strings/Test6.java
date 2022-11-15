package strings;

public class Test6 {
  public static void main(String[] args) {
	String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
    boolean flag=true;
	s1=s1.replace(" ", "");
	
	char[] ch=s1.toCharArray();
	
	int[] a = new int[26];
	
	for(int i=0;i<ch.length;i++) {
		int index=ch[i]-65;
		a[index]++;
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]==0) {
			flag=false;
		}
	}
	if(flag==true) System.out.println("Panagram");
	else System.out.println("not panagram");
}
}
