package BasicPrograms;

public class PrimeNumber {
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumberInstance = new PrimeNumber();
        int result = primeNumberInstance.countPrimes(2, 10);
        System.out.println("Number of primes between 2 and 10:\n" + result);
    }
}
