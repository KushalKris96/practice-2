package array;

public class PascalTriangleApproach3 {

	static void printPascal(int n) {    //Here T.C. - O(n2) and S.C. - O(1)
		for(int i=0;i<n;i++) {
			int C = 1;
			System.out.print(C+" ");
			for(int j=1;j<=i;j++) {
				C = C * (i-j+1)/j;
				System.out.print(C+" ");
			}
	    	System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=7;
		printPascal(n); 
	}
}
