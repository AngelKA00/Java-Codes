package BasicPrograms;

import java.util.Scanner;

public class RemoveChar {
	static String RemoveChar(String input, char c) {
		StringBuffer s = new StringBuffer(input.length());
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == c) {
				continue;
			}
			s.append(input.charAt(i));
		}
		String str = s.toString();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter characters:");
		String input = sc.next();
		System.out.println("Enter character to remove:");
		char c = sc.next().charAt(0);
		String ans = RemoveChar(input, c);
		System.out.println(ans);

	}

}
