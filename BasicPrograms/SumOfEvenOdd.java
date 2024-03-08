package BasicPrograms;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int even = 0, odd = 0, digit;
		while(n>0) {
			digit = n%10; //4, 3, 2, 1
			n = n/10;     //123, 12, 1, 0
			if(digit%2 != 0) {
				odd += digit; //4,7,7,8
			}else {
				even += digit; //0,0,2,2
			}
			
		}
		System.out.println("Even: "+even+ "\n"+"Odd: "+ odd);

	}

}
