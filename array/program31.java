// WAJP to print true if all the elements in the  array are unique.

package array;

public class program31 {

    // Method to check if all elements in the array are unique
    public static boolean areElementsUnique(int[] nums) {
        // Create a temporary array to keep track of seen elements
        int[] tempArray = new int[nums.length];
        int uniqueCount = 0; // Counter for unique elements

        // Loop through the original array
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false; // Flag to check for duplicates

            // Check if the current element is already in the tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (nums[i] == tempArray[j]) {
                    isDuplicate = true; // Found a duplicate
                    break; // No need to check further
                }
            }

            // If it's not a duplicate, add it to the tempArray
            if (!isDuplicate) {
                tempArray[uniqueCount] = nums[i];
                uniqueCount++; // Increment the unique count
            } else {
                // If a duplicate is found, return false immediately
                return false;
            }
        }

        // If no duplicates were found, return true
        return true;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 2, 3, 4, 5}; // You can modify this array as needed

        // Call the method to check for unique elements
        boolean isUnique = areElementsUnique(nums);

        // Print the result
        System.out.println("Are all elements unique? " + isUnique);
    }
}

