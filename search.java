import java.util.Scanner;

public class search {
    public static boolean containsElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element you want to search for: ");
        int elementToSearch = scanner.nextInt();
        if (containsElement(array, elementToSearch)) {
            System.out.println("Element " + elementToSearch + " is found in the array.");
        } else {
            System.out.println("Element " + elementToSearch + " is not found in the array.");
        }
        scanner.close();
    }
}
