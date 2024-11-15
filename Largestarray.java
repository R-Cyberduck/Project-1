import java.util.Scanner;

public class Largestarray {

    // Method to find the largest element in the array
    public static int findLargest(int[] array) {
        // Assume the first element is the largest initially
        int largest = array[0];

        // Loop through the array to compare each element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if the current element is greater
            }
        }

        // Return the largest element found
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many elements to enter (up to 7)
        System.out.print("Enter the number of elements in the array (up to 7): ");
        int size = scanner.nextInt();

        // Check that the size is within the allowed range (1 to 7)
        if (size < 1 || size > 7) {
            System.out.println("Please enter a valid number between 1 and 7.");
            return;  // Exit if the size is out of range
        }

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Ask the user to input each element of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the largest element in the array
        int largest = findLargest(array);

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
