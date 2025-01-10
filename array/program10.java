// WAJP to swap two index values of the array.


package array;

public class program10 {

    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed

        // Indices to swap
        int index1 = 1;  // Swap element at index 1 (20)
        int index2 = 3;  // Swap element at index 3 (40)

        System.out.println("Array before swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Swap elements at index1 and index2
        int temp = arr[index1];  // Store the value of arr[index1] in a temporary variable
        arr[index1] = arr[index2];  // Assign the value of arr[index2] to arr[index1]
        arr[index2] = temp;  // Assign the value of temp (which is the original arr[index1]) to arr[index2]

        System.out.println("\nArray after swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
