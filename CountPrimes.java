public class CountPrimes {
    public int countPrimes(int n) {
        int primeNumbers = 0;
        if(n >2) {
            boolean primes[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                primes[i] = true;
            }
            primes[0] = false;
            primes[1] = false;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (primes[i]) {
                    int j = i;
                    while (i * j < n) {
                        primes[i * j] = false;
                        j++;
                    }
                }
            }
            for (boolean prime : primes) {
                if (prime) {
                    primeNumbers++;
                }
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        System.out.println(cp.countPrimes(10));
    }
}
