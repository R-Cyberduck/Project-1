import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the position in the Fibonacci sequence: ");
        int position = scanner.nextInt();

        if (position < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int result = fibonacci(position);

            System.out.println("Fibonacci number at position " + position + " is: " + result);
        }

        scanner.close();
    }
}