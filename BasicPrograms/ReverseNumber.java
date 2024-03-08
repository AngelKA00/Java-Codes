package BasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, n = 123, rev = 0;
		while(n>0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println("Reverse: " + rev);

	}

}
