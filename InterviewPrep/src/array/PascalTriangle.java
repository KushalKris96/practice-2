package array;

public class PascalTriangle {
	
    static void printPascle(int n) {       //Here T.C. - O(n3) and S.C. - O(1)
    	for(int line=0;line<n;line++) {
    		for(int i=0;i<=line;i++) {
    			System.out.print(binomialCoefficient(line,i)+" ");
    		}
    		System.out.println();
    	}
    }
    static int binomialCoefficient(int n,int k) {
    	int res = 1;
    	
    	if(k>n-k) k=n-k;
    	
    	for(int i=0;i<k;i++) {
    		res *= (n-i);
    		res /= (i+1);
    	}
    	
    	return res;
    }
	public static void main(String[] args) {
		int n=6;
		printPascle(n);
	}
}
