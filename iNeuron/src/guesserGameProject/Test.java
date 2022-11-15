package guesserGameProject;

import java.util.HashMap;
import java.util.Hashtable;

public class Test {

//	public static void main(String[] args) {
//		String s1 = "sachin";
//		String s2 = new String("sachin");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2)); //Here equals method checks the content
//		StringBuilder s1 = new StringBuilder("sachin");
//		StringBuilder s2 = new StringBuilder("sachin");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));  //StringBuilder class equals() method compares the reference(address of object) not the content of StringBuilder
	
//		Hashtable<String,Integer> h1 = new Hashtable<>();
//		h1.put(null, 1);
//		
//		HashMap<String,Integer> hm = new HashMap<>();
//		hm.put(null, 1);
		 void bubbleSort(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++)
		            for (int j = 0; j < n - i - 1; j++)
		                if (arr[j] > arr[j + 1]) {
		                    // swap arr[j+1] and arr[j]
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		    }
		 
		    /* Prints the array */
		    void printArray(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 0; i < n; ++i)
		            System.out.print(arr[i] + " ");
		        System.out.println();
		    }
		 
		    // Driver method to test above
		    public static void main(String args[])
		    {
		        Test ob = new Test();
		        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		        ob.bubbleSort(arr);
		        System.out.println("Sorted array");
		        ob.printArray(arr);
		    }
	
	//}
}
