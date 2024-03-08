package BasicPrograms;

import java.util.Scanner;

public class SortArray {
	public static void sortarray(int[] array, int n) {
		int zero = 0, one = 0, two = 0;
		int i = 0;
		while(i<n) {
			if(array[i] == 0) {
				zero += 1;
			}else if(array[i] == 1) {
				one += 1;
			}else if(array[i] == 2) {
				two += 1;
			}
			i++;
		}
		i = 0;
		while(i<zero) {
			array[i] = 0;
			i++;
		}
		while(i<one+zero) {
			array[i] = 1;
			i++;
		}
		while(i<two+one+zero) {
			array[i] = 2;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the digit:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the number:");
		int []array = new int [100];
		for(int i =0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		sortarray(array,n);
		for(int i=0; i<=n; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}
	

}
