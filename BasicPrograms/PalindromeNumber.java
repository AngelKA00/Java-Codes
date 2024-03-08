package BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, rev = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		temp = n;
		while(n>0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println(rev);
		if(rev == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
