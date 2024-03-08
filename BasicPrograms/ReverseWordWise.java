package BasicPrograms;

import java.util.Scanner;

public class ReverseWordWise {
	static String reversewordwise(String input) {
		String[]words = input.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for(int i = words.length - 1; i>=0; i--) {
			reversed.append(words[i]);
			if(i>0) {
				reversed.append(" ");
			}
		}
		return reversed.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = sc.nextLine();
		String ans = reversewordwise(input);
		System.out.println(ans);

	}

}
