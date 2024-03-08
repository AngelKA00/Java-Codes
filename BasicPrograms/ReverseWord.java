package BasicPrograms;

import java.util.Scanner;

public class ReverseWord {
	static String reverseeachword(String input) {
		String []words = input.split("\\st"); // splits the words
		StringBuilder reversed = new StringBuilder();
		for(String word: words) {
			StringBuilder wordB = new StringBuilder(word); // each splitted word will be stored here
			wordB.reverse(); // that word will be reversed
			reversed.append(wordB); // all the words will be appended
		}
		return reversed.toString().trim(); // it prints
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word or sentence:");
		String input = sc.nextLine();
		String ans = reverseeachword(input);
		System.out.println(ans);

	}

}
