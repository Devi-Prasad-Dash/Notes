import java.util.Scanner;

public class String_Problems {
    
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		/*
	
		// Problem - 3 (First Non-Repeating Character)				Approach : Used LinkedHashMap to maintain the insertion order.

		// Time Complexity : O(n)									Space Complexity : O(n)
		// Edge Cases : Handled for empty String

		// Solution - 1 (Using LinkedHashMap)

		System.out.print("Enter a string : ");
		String str = scn.next();

		if (str.length() == 0) {
			System.out.println("Empty String !");
			scn.close();
			return;
		}
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : map.keySet()) {
			
			if (map.get(ch) == 1) {
				System.out.println(ch);
				scn.close();
				return;
			}
		}

		System.out.println(-1);

		// Solution - 2 (Using Array)

		System.out.print("Enter a string : ");
		String str = scn.next();

		if (str.length() == 0) {
			System.out.println("Empty String !");
			scn.close();
			return;
		} 

		int[] arr = new int[26];

		for (char ch : str.toCharArray()) {
			arr[ch-'a']++;
		}

		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if (arr[ch -'a'] == 1) {
				System.out.println(i);
				scn.close();
				return;
			} 
		}
		
		System.out.println(-1);

		*/

		scn.close();
	}
}