// WAJP to print each element of the array which has appeared only once in the array.

/*Appeared only once" ka matlab hota hai ki koi bhi element array mein sirf ek baar dikhai diya hai. 
Iska matlab hai ki agar kisi element ki frequency (ginti) 1 hai, toh woh element "appeared only once" hai. */

package array;

public class program24 {
    
    // Method to print elements that appear only once in the array
    public static void printUniqueElements(int[] nums) {
        System.out.println("Elements that appeared only once:");

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true; // Flag to track if the element is unique

            // Check if the current element is found in the rest of the array
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false; // Found a duplicate
                    break; // No need to check further
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {4, 5, 6, 4, 7, 5, 9}; // You can modify this array as needed

        // Call the method to print unique elements
        printUniqueElements(nums); // This will display the elements that appeared only once
    }
}
