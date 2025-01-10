//  Method to count prime numbers



package array;

public class program45 {

    // Method to count prime numbers less than n
    public static int countPrimes(int n) {
        // Edge case: if n is less than or equal to 2, there are no prime numbers
        if (n <= 2) return 0;

        // Create a boolean array to track prime status
        boolean[] isPrime = new boolean[n];
        
        // Initialize all entries as true (assuming all numbers are prime)
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Implement the Sieve of Eratosthenes algorithm
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark all multiples of p as non-prime
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++; // Increment count for each prime found
            }
        }

        return count; // Return the total count of primes
    }

    public static void main(String[] args) {
        // Example input
        int n = 10; // You can modify this value as needed

        // Call the method and print the result
        int primeCount = countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + ": " + primeCount);
    }
}
