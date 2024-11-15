import java.util.Scanner;

public class factorialsequence {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate its factorial: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
        scanner.close();
    }
}
