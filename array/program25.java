// WAJP to print each element of the array which has appeared more than once/which has duplicate values in the array.


package array;

public class program25 {
    
    // Method to print elements that appear more than once in the array
    public static void printDuplicateElements(int[] nums) {
        System.out.println("Elements that appeared more than once:");

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false; // Flag to track if the element is a duplicate

            // Check if the current element is found in the rest of the array
            for (int j = 0; j < nums.length; j++) {
                // If it's a duplicate and not the same index, set flag
                if (i != j && nums[i] == nums[j]) {
                    isDuplicate = true; // Found a duplicate
                    break; // No need to check further
                }
            }

            // If the element is a duplicate, print it
            if (isDuplicate) {
                System.out.println(nums[i]);
                
                // To avoid printing the same duplicate again, we can mark it as visited
                // Loop through the array to mark duplicates as visited
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == nums[i]) {
                        nums[k] = Integer.MIN_VALUE; // Mark as visited (or any other marker)
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {4, 5, 6, 4, 7, 5, 9}; // You can modify this array as needed

        // Call the method to print duplicate elements
        printDuplicateElements(nums); // This will display the elements that appeared more than once
    }
}

