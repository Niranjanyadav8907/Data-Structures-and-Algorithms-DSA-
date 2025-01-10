// WAJP to find the maximum product of two integers in a given array of positive integer  9*7 = 63


package array;

public class program34 {

    // Method to find the maximum product of two integers in the array
    public static int findMaxProduct(int[] nums) {
        // Check if the array has at least two elements
        if (nums.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return -1; // Return -1 to indicate an error
        }

        int max1 = Integer.MIN_VALUE; // To store the maximum value
        int max2 = Integer.MIN_VALUE; // To store the second maximum value

        // Loop through the array to find the two largest numbers
        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Update second maximum
                max1 = num;  // Update maximum
            } else if (num > max2) {
                max2 = num;  // Update second maximum
            }
        }

        // Calculate and return the maximum product
        return max1 * max2;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 5, 3, 6, 7}; // You can modify this array as needed

        // Find the maximum product
        int maxProduct = findMaxProduct(nums);

        // Print the result
        if (maxProduct != -1) {
            System.out.println("Maximum product of two integers: " + maxProduct);
        }
    }
}

