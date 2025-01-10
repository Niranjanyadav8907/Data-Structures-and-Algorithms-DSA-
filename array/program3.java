//WAJP to print and count all the three digit numbers of the array.

package array;

public class program3 {
    public static void main(String[] args) {
        // Predefined array of integers
        int[] arr = {12, 123, 4567, 89, 999, 1000, 250, 304, 150, 76, 789};  // You can modify this array as needed

        // Variable to count three-digit numbers
        int count = 0;

        System.out.println("Three-digit numbers in the array:");

        // Loop through the array to check for three-digit numbers
        for (int num : arr) {
            // Check if the number is a three-digit number
            if (num >= 100 && num < 1000) {
                System.out.println(num);  // Print the three-digit number
                count++;  // Increment the count
            }
        }

        // Print the total count of three-digit numbers
        System.out.println("Total three-digit numbers: " + count);
    }
}
