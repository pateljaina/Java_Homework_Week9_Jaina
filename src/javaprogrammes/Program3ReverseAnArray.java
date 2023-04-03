package javaprogrammes;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Program3ReverseAnArray {
    public static void main(String[] args) {//Main method

        int[] arr = new int[]{1, 2, 3, 4, 5};//initialise the array
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Array in reverse order is: ");

        for (int i = arr.length - 1; i >= 0; i--) {//Loop through array in reverse order
            System.out.print(arr[i] + " ");
        }
    }
}
