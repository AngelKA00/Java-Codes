package BasicPrograms;

import java.util.Scanner;

public class SumOfEvenTillN {
	public static long evenSumTillN(long n) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(long i =2; i<= n; i +=2) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		long n = sc.nextLong();
		long sum = evenSumTillN(n);
		System.out.println(sum);

	}

}
