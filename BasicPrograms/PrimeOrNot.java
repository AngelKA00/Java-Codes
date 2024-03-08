package BasicPrograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) { 
			if(n%i == 0) {
				c++;
			}
		}
		if(c == 2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}

}
