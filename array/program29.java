// WAJP to print the index and the value of the first non-repeating element in an array.

package array;

public class program29 {

    // Method to print the index and value of the first non-repeating element
    public static void printFirstNonRepeatingElement(int[] nums) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true; // Flag to check if the element is unique

            // Check if the current element is repeated in the array
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false; // If found, it's not unique
                    break; // No need to check further
                }
            }

            // If the element is unique, print its index and value
            if (isUnique) {
                System.out.println("Index: " + i + ", Value: " + nums[i]);
                return; // Exit after finding the first non-repeating element
            }
        }

        // If no non-repeating element is found
        System.out.println("No non-repeating element found.");
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {2, 3, 5, 2, 3, 6, 7}; // You can modify this array as needed

        // Call the method to print the first non-repeating element
        printFirstNonRepeatingElement(nums); // This will display the first non-repeating element
    }
}
