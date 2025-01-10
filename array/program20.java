// ShiftZerosAndOnes

package array;

public class program20 {

    // Method to shift all 0's to the left and all 1's to the right
    public static void shiftZerosAndOnes(int[] nums) {
        int n = nums.length;  // Get the length of the array
        int zeroIndex = 0;    // Pointer for the position of the next zero

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // If the current element is 0, move it to the front
            if (nums[i] == 0) {
                // Swap the current element with the element at zeroIndex
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;  // Increment the index for the next zero
            }
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 1, 1, 0, 0, 1, 0, 0};  // You can modify this array as needed

        // Shift zeros to the left and ones to the right
        shiftZerosAndOnes(nums);

        // Print the modified array
        System.out.print("Array after shifting 0's to the left and 1's to the right: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
