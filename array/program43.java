// SmallestMissingPositive


package array;

public class program43 {
    
    // Method to find the smallest missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // First pass: place each number in its correct position
        for (int i = 0; i < n; i++) {
            // Swap until the current number is at its right position
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1]; // Place it at the correct index
                nums[temp - 1] = temp;     // Swap to the correct position
            }
        }

        // Second pass: find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // Return the missing positive
            }
        }

        // If all positions are correct, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 0}; // You can modify this array as needed
        
        // Find and print the smallest missing positive integer
        int result = firstMissingPositive(nums);
        System.out.println("The smallest missing positive integer is: " + result);
    }
}

