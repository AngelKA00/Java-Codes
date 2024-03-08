package BasicPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, n = 1422, sum = 0;
		while(n>0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of digits: "+sum);
	}

}
