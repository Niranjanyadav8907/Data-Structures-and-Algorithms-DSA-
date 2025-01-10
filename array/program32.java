// WAJP to print Biggest and second biggest element of the array.


package array;

public class program32 {

    // Method to find the biggest and second biggest elements
    public static void findBiggestAndSecondBiggest(int[] nums) {
        // Check if the array has at least two elements
        if (nums.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int biggest = Integer.MIN_VALUE;  // Initialize biggest to the smallest possible integer
        int secondBiggest = Integer.MIN_VALUE; // Initialize second biggest to the smallest possible integer

        // Loop through the array to find the biggest and second biggest elements
        for (int num : nums) {
            if (num > biggest) {
                secondBiggest = biggest; // Update second biggest
                biggest = num;           // Update biggest
            } else if (num > secondBiggest && num < biggest) {
                secondBiggest = num;     // Update second biggest if current number is less than biggest but greater than second biggest
            }
        }

        // Print the results
        if (secondBiggest == Integer.MIN_VALUE) {
            System.out.println("There is no second biggest element (all elements might be the same).");
        } else {
            System.out.println("Biggest element: " + biggest);
            System.out.println("Second biggest element: " + secondBiggest);
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {3, 5, 7, 2, 8, 6, 5}; // You can modify this array as needed

        // Call the method to find biggest and second biggest elements
        findBiggestAndSecondBiggest(nums);
    }
}
