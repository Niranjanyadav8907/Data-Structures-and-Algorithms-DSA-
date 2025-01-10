// WAJP to print the frequency of each element of the array when elements provided are in any range.


package array;

public class program23{

    // Method to print the frequency of each element in the given array
    public static void printFrequency(int[] nums) {
        // Find the minimum and maximum elements in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (num < min) {
                min = num; // Update min if the current number is smaller
            }
            if (num > max) {
                max = num; // Update max if the current number is larger
            }
        }

        // Create a frequency array based on the range [min, max]
        int range = max - min + 1; // Total number of different elements
        int[] frequency = new int[range]; // Frequency array for counting

        // Count the frequency of each element in the input array
        for (int num : nums) {
            frequency[num - min]++; // Increment the count for the respective number
        }

        // Print the header for the output
        System.out.println("Element Frequency");

        // Loop through the frequency array to print counts
        for (int i = 0; i < frequency.length; i++) {
            // Only print elements that have a frequency greater than 0
            if (frequency[i] > 0) {
                System.out.println((i + min) + "      " + frequency[i]); // Print the number and its frequency
            }
        }
    }

    public static void main(String[] args) {
        // Example input array with numbers in any range
        int[] nums = {3, 5, -2, 3, 5, -2, 8, 8, -1}; // You can modify this array as needed

        // Call the method to print the frequency of elements
        printFrequency(nums); // This will display the frequency of each element in the array
    }
}

