package array;

public class FindMaxElement {

	public static void main(String[] args) {
		
		int[] arr = {25,30,40,70,10};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The max value is : "+max);
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The min value is : "+min);
	}
}
