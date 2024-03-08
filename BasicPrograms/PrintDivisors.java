package BasicPrograms;

public class PrintDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
				System.out.print(i +" ");
			}
		}

	}

}
