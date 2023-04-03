package javaprogrammes;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Program7ArrayEmptyTest {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(10);//Create an empty array list
        boolean ans = arr.isEmpty();//checking to see if list is empty or not
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");

        arr.add(1);//adding an element to array list

        ans = arr.isEmpty();//checking to see if list is empty or not
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
    }
}




