// WAJP to print the element and its frequency which has appeared for the maximum time in the array.


package array;

public class program28 {

    // Method to print the element with maximum frequency and its count
    public static void printMaxFrequencyElement(int[] nums) {
        int maxCount = 0; // To keep track of the maximum frequency
        int maxElement = nums[0]; // To keep track of the element with maximum frequency

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Variable to count occurrences of nums[i]

            // Count the frequency of nums[i] in the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++; // Increment count if a match is found
                }
            }

            // Check if this count is greater than the current maximum count
            if (count > maxCount) {
                maxCount = count; // Update maxCount
                maxElement = nums[i]; // Update maxElement
            }
        }

        // Print the element and its frequency
        System.out.println("Element: " + maxElement + ", Frequency: " + maxCount);
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {4, 5, 6, 4, 7, 5, 9, 9}; // You can modify this array as needed

        // Call the method to print the element with maximum frequency
        printMaxFrequencyElement(nums); // This will display the element with maximum frequency
    }
}

