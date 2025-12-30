import java.util.Scanner;

public class Array_Problems {
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		/*

		// Problem - 1 (Find the Second Largest Element in an Array)			(Approach by taking max and secondMax as null)

		System.out.print("Enter the length of the array : ");
		int length = scn.nextInt();

		int[] arr = new int[length];

		for(int i = 0; i < length; i++) {
			
			System.out.print("Enter the array element : ");
			int num = scn.nextInt();
			arr[i] = num;
		}

		Integer max = null;
		Integer secondMax = null;

		for(int i = 0; i < arr.length; i++) {
			
			if (max == null || arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if (arr[i] < max && (secondMax == null || arr[i] > secondMax)) {
				secondMax = arr[i];
			}
		}

		if (secondMax != null) {
			System.out.println("Second largest element : "+secondMax);
		}
		else {
			System.out.println("Second largest element does not exists !");
		}

		// Problem - 2	(Move Zeros to the Last)		(First, move all non‑zero elements to the front, then fill the rest of the array with zeros.)

		System.out.print("Enter the length of the array : ");
		int len = scn.nextInt();

		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.print("Enter next element of the array : ");
			arr[i] = scn.nextInt();
		}

		// Solution - 1 Brute force

		int start = 0;
		int end = len - 1;

		while (start < end) {	
			
			if (arr[start] == 0) {
				
				for (int i = start; i < end; i++) {
					arr[i] = arr[i+1];
				}
				arr[end] = 0;
				end--;
			}
			else {
				start++;
			}
		}

		// Solution - 2  Best Approach with TC - O(n)

		int index = 0;

		for (int i = 0; i < len; i++) {

			if (arr[i] != 0) 
				arr[index++] = arr[i];
			}
		}

		while (index < len) {
			arr[index++] = 0;
		}

		System.out.print("New Array : ");

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}

		*/

		scn.close();
	}
}