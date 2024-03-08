package BasicPrograms;

import java.util.Scanner;

public class PossibleSubstrings {
	
	public static void AllSubstring(String str) {
		// TODO Auto-generated method stub
		int n = str.length(); // 3 
		for(int len = 1; len <= n; len++) { 
			for(int i = 0; i <= n-len; i++) { 
				int j = i+len-1; 
				for(int k = i; k <= j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string:");
		String input = sc.nextLine();
		sc.close();
		AllSubstring(input);

	}

}
