package BasicPrograms;

import java.util.Scanner;

public class FindLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter all n's:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter x to find the index:");
		int x = sc.nextInt();
		for(int i=n-1; i>=0; i--) {
			if(arr[i] == x) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}

}
