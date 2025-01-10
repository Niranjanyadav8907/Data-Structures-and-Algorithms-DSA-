// WAJP to print true if elements of an array are same when it is read from front or from back otherwise print false. (i.e., checks if the array is a palindrome):


package array;

public class program39 {
    // Method to check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Compare elements from the front and back
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) { // Check if the front and back elements are not equal
                return false; // If they are not equal, return false
            }
        }
        return true; // If all elements match, return true
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {12, 23, 15, 15, 23, 12}; // You can modify this array as needed

        // Check if the array is a palindrome
        boolean result = isPalindrome(arr);

        // Print the result
        System.out.println(result); // Print true if palindrome, otherwise false
    }
}

