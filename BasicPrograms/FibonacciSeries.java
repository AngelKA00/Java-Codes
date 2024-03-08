package BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(a + " ");
			int c = a+ b;
			a = b;
			b = c;
		}

	}

}
