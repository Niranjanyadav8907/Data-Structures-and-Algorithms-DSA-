// WAJP find missing element


package array;

public class program40 {
    // Method to find the missing element in the array
    public static int findMissingElement(int[] arr, int n) {
        // Calculate the expected sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num; // Sum up all elements in the array
        }

        // The missing element is the difference between the expected sum and the actual sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {7, 4, 3, 5, 1, 6}; // You can modify this array as needed

        // The total count of elements should be one more than the length of the array
        int n = arr.length + 1; // Since one element is missing

        // Find the missing element
        int missingElement = findMissingElement(arr, n);

        // Print the missing element
        System.out.println("Missing element: " + missingElement);
    }
}

