package BasicPrograms;

import java.util.Scanner;

public class CountWords {
	static int countallwords(String input) {
		if(input == null || input.isEmpty()) {
			return 0;
		}
		String[]words = input.trim().split("\\s+");
		return words.length;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Write something...");
		String input = sc.nextLine();
		int output = countallwords(input);
		System.out.println(output);
	}

}
