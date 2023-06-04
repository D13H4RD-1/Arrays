package Arrays_PCK;

import java.util.Scanner;

public class ARR {
	
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] getInteger (int size) {
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			Scanner sc1 = new Scanner(System.in);
			arr[i]=sc1.nextInt();
		}
		
		return arr;
	}
	
	public static int[] sortIntegers(int[] ar) {
		for(int j=0;j<ar.length-1;j++) { // will run n-1 so as not to get array out of bound error
			for(int i=0;i<ar.length-j-1;i++) { // will run n-j-i to ignore last number
				if(ar[i]<ar[i+1]) {
					int a = ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=a;
				}
		}
		
	}
		return ar;
}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] ar = getInteger(s);
		System.out.println("Entered array is");
		printArray(ar);
		int[] arn =sortIntegers(ar);
		System.out.println("\r\n " + "Sorted array is");
		printArray(arn);
		
	}

}
