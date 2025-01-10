// MoveZerosToEnd 


package array;

public class program19 {

    // Method to move all zeros to the end of the array
    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;  // Pointer for the position of the next non-zero element

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, place it at the non-zero index
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;  // Move the non-zero index forward
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            nums[i] = 0;  // Fill the rest of the array with zeros
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 1, 0, 3, 12};  // You can modify this array as needed

        // Move zeros to the end
        moveZeros(nums);

        // Print the modified array
        System.out.print("Array after moving zeros to the end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
