//WAJP to check no is even or odd without using if else/Conditional Operator statement .


package array;
public class program13 {
    public static void checkEvenOdd(int[] nums) {
        for (int num : nums) {
            // Using switch to check if the number is even or odd
            switch (num % 2) {
                case 0:
                    System.out.println(num + " is Even");
                    break;
                case 1:
                    System.out.println(num + " is Odd");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Example array of multiple numbers
        int[] numbers = {10, 23, 45, 60, 72};  // You can modify the numbers

        // Call the method to check even or odd for multiple inputs
        checkEvenOdd(numbers);
    }
}
