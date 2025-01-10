// For the given array of Strings, print the largest string and smallest string.

package array;
public class program7 {
    public static void main(String[] args) {
        // Example array of strings
        String[] arr = {"apple", "banana", "kiwi", "grapefruit", "pear", "orange"};  // You can modify this array as needed

        // Initialize variables for the largest and smallest strings
        String largest = arr[0];
        String smallest = arr[0];

        // Loop through the array to find the largest and smallest strings
        for (String str : arr) {
            // Check if the current string is larger than the largest string
            if (str.length() > largest.length()) {
                largest = str;  // Update largest
            }
            // Check if the current string is smaller than the smallest string
            if (str.length() < smallest.length()) {
                smallest = str;  // Update smallest
            }
        }

        // Print the results
        System.out.println("Largest string: " + largest);
        System.out.println("Smallest string: " + smallest);
    }
}
