// WAJP to print and count all the prime numbers of the array.


package array;

public class program15 {
    
    // Simple method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // Numbers less than or equal to 1 are not prime
        for (int i = 2; i < num; i++) {  // Check divisibility by numbers from 2 to num-1
            if (num % i == 0) return false;  // If divisible, it's not prime
        }
        return true;  // If no divisors, it's prime
    }

    // Method to print and count prime numbers in the array
    public static void printAndCountPrimes(int[] arr) {
        int count = 0;  // Counter for prime numbers

        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {  // Check if the number is prime
                System.out.println(num);  // Print the prime number
                count++;  // Increment the count
            }
        }

        // Print the total number of prime numbers found
        System.out.println("Total prime numbers: " + count);
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {2, 4, 5, 7, 8, 11};  // Modify this array as needed

        // Call the method to print and count prime numbers in the array
        printAndCountPrimes(arr);
    }
}
