//WAJP to print the frequency of each element of the array if all given elements are in range from 0 to 1000.


package array;

public class program22 {
    
    // Method to print the frequency of each element in the given array
    public static void printFrequency(int[] nums) {
        // Create an array to count frequencies of numbers in the range 0 to 1000
        int[] frequency = new int[1001]; // Size is 1001 to include index 0 to 1000

        // Count the frequency of each element in the input array
        for (int num : nums) {
            // Check if the number is within the valid range
            if (num >= 0 && num <= 1000) {
                // Increment the count for the respective number
                frequency[num]++;
            }
        }

        // Print the header for the output
        System.out.println("Element Frequency");
        
        // Loop through the frequency array to print counts
        for (int i = 0; i < frequency.length; i++) {
            // Only print elements that have a frequency greater than 0
            if (frequency[i] > 0) {
                System.out.println(i + "      " + frequency[i]); // Print the number and its frequency
            }
        }
    }

    public static void main(String[] args) {
        // Example input array with some numbers in the range 0 to 1000
        int[] nums = {0, 1, 2, 3, 0, 1, 2, 0, 4,}; // You can modify this array as needed

        // Call the method to print the frequency of elements
        printFrequency(nums); // This will display the frequency of each element in the array
    }
}
