// WAJP to rotate each element of an array by one position in right side

package array;

public class program14 {
    
    // Method to rotate the array by one position to the right
    public static void rotateRightByOne(int[] arr) {
        // Store the last element of the array
        int last = arr[arr.length - 1];
        
        // Shift all elements to the right by one position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first position
        arr[0] = last;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed

        // Rotate the array by one position to the right
        rotateRightByOne(arr);

        // Print the rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
