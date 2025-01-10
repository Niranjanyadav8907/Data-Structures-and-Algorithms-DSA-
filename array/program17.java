// WAJP to rotate each element of an array by one position in left side.


package array;

public class program17 {

    // Method to rotate the array by one position to the left
    public static void rotateLeftByOne(int[] arr) {
        // Store the first element of the array
        int first = arr[0];
        
        // Shift all elements to the left by one position
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place the first element at the last position
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  // You can modify this array as needed

        // Rotate the array by one position to the left
        rotateLeftByOne(arr);

        // Print the rotated array
        System.out.println("Array after rotating one position to the left:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
