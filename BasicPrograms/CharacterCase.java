package BasicPrograms;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character:");
		String str = sc.next();
		char ch = str.charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("1");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("0");
		}else {
			System.out.println("-1");
		}

	}

}
