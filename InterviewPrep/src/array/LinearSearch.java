package array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int key = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]){
				System.out.println("Key found at index : "+i);
				flag = true;
			}
		}
		if(flag==false)
		     System.out.println("Key is not found");
	}
}
