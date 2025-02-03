import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n + 1]; // Create an array with extra space for the new element

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to add and its position
        System.out.println("Enter the element you want to add:");
        int adder = sc.nextInt();

        System.out.println("Enter the position where you want to add the element (0-based index):");
        int index = sc.nextInt();

        // Validate the index
        if (index < 0 || index > n) {
            System.out.println("Invalid position! Please enter a position between 0 and " + n);
        } else {
            // Shift elements and insert the new element
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = adder;

            // Print the updated array
            System.out.println("Updated array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
