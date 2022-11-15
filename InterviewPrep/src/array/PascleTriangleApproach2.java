package array;

public class PascleTriangleApproach2 {  //Here T.C. - O(n2) and S.C. - O(n2)

	static void printPascal(int n) {
		int[][] a = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j) 
					a[i][j] = 1;
				else
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 int n=5;
		 printPascal(n); 
	}
}
