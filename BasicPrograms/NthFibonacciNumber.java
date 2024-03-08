package BasicPrograms;

public class NthFibonacciNumber {
	static int fib(int n) { // fib - static method name
	if(n == 0) {
		return 0;
	}else if(n == 1 || n == 2) {
		return 1;
	}
	return fib(n-1) + fib(n-2); // 4 + 3, 3 + 2, 2 + 1, 1 + 0 -> it reached 1 so it stops
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));
	
	}
}
