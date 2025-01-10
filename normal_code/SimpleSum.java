package normal_code;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Output the sum
        System.out.println("Sum: " + (num1 + num2));
        
        scanner.close();
    }
}
