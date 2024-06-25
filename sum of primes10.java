public class SumOfPrimes {

    public static void main(String[] args) {
        long limit = 2_000_000L;
        long sum = sumOfPrimesBelow(limit);
        System.out.println("The sum of all primes below " + limit + " is: " + sum);
    }

    public static long sumOfPrimesBelow(long n) {
        boolean[] isPrime = new boolean[(int)n];
        long sum = 0;

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Marking multiples of p as false (non-prime)
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
