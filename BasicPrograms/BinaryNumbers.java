package BasicPrograms;

import java.util.Scanner;

public class BinaryNumbers {
	public static int countSetBits(int n) {
		int count = 0;
		while(n > 0) {
			count += n & 1; // checks last bit is 1
			n = n >> 1; // right shifts, this value become n
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		sc.close();
		if(n < 0) {
			System.out.println("Enter a non-negative integer!");
			return;
		}
		int onesCount = countSetBits(n);
		System.out.println("Number of set bits: " + onesCount);
	}

}
