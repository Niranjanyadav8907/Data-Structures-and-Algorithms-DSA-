//WAJP to rotate all the elements of array k position to its right.  array[] = {1,2,3,4,5,6,7} , k=2 ---- Output: {6 7 1 2 3 4 5}


package array;

public class program16 {

    // Method to rotate the array by k positions to the right
    public static void rotateRightByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k is greater than the array length
        
        // Create a temporary array to store the rotated result
        int[] temp = new int[n];

        // Copy the last k elements to the front of the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Copy the rest of the elements to the temp array
        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        // Copy the rotated elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        // Example array and rotation value k
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  // You can modify this array as needed
        int k = 2;  // Number of positions to rotate

        // Rotate the array by k positions to the right
        rotateRightByK(arr, k);

        // Print the rotated array
        System.out.println("Array after rotating " + k + " positions to the right:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
