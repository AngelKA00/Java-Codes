package BasicPrograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		for(int i=0; i<n.length(); i++) {
			char ch = n.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("No. of vowels in the given sentence is " + count);

	}

}
