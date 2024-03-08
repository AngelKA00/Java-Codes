package BasicPrograms;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = sc.nextInt();
		int temp = 1;
		System.out.println("Enter the power:");
		int n = sc.nextInt();
		while(n != 0) {
			temp = temp * x; // 1*2, 2*2, 4*2, 8*2, 16*2
			n--; //4, 3, 2, 1, 0
		}
		System.out.println(temp);
	}

}
