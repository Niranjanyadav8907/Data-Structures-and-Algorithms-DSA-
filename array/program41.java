// WAJP to check if an array is strictly increasing.   3<7 (True)  


package array;

public class program41 {
    // Method to check if the array is strictly increasing
    public static boolean isStrictlyIncreasing(int[] arr) {
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // If the current element is not less than the next element, return false
            if (arr[i] >= arr[i + 1]) {
                return false; // Not strictly increasing
            }
        }
        return true; // Array is strictly increasing
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {2, 3, 7, 8, 9}; // You can modify this array as needed

        // Check if the array is strictly increasing and print the result
        if (isStrictlyIncreasing(arr)) {
            System.out.println("Array is strictly increasing");
        } else {
            System.out.println("Array is not strictly increasing");
        }
    }
}

