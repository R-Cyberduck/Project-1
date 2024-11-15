import java.util.Scanner;

public class sumofelement {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (up to 7): ");
        int size = scanner.nextInt();
        if (size < 1 || size > 7) {
            System.out.println("Please enter a valid number between 1 and 7.");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = calculateSum(array);
        System.out.println("The sum of the elements in the array is: " + sum);
        scanner.close();
    }
}
