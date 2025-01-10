//WAJP to count all the even numbers of the array.


package array;

public class program2 {
    public static int countEvenNumbers(int[] arr) {
        int count = 0;  // Initialize a counter for even numbers

        // Loop through the array to count even numbers
        for (int num : arr) {
            if (num % 2 == 0) {  // Check if the number is even
            System.out.println(num); //  Print the even number
                count++;  // Increment the count if the number is even
            }
        }

        return count;  // Return the total count of even numbers
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 21, 30, 41, 50, 63, 74};  // You can modify this array as needed

        // Call the method to count even numbers
        int evenCount = countEvenNumbers(arr);

        // Print the count of even numbers
        System.out.println("Total even numbers: " + evenCount);
    }
}
