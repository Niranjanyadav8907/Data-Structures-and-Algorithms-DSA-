// WAJP to print Smallest and second Smallest element of the array.


package array;


public class program33 {

    // Method to find the smallest and second smallest elements
    public static void findSmallestAndSecondSmallest(int[] nums) {
        // Check if the array has at least two elements
        if (nums.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;       // Initialize smallest to the largest possible integer
        int secondSmallest = Integer.MAX_VALUE; // Initialize second smallest to the largest possible integer

        // Loop through the array to find the smallest and second smallest elements
        for (int num : nums) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest before updating smallest
                smallest = num;             // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;      // Update second smallest if it's different from smallest
            }
        }

        // Print the results
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {3, 5, 1, 2, 8, 6, 1}; // You can modify this array as needed

        // Call the method to find the smallest and second smallest elements
        findSmallestAndSecondSmallest(nums);
    }
}

