package array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int key = sc.nextInt();
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key==a[mid]) {
				System.out.println("the number is present at "+mid+" index");
				break;
			}
		    if(key<a[mid]) {
				high = mid-1;
				
			}
			else{
				low=mid+1;
			}
			if(low>high) {
				System.out.println("Key not found");
			}
		}
	}
}
