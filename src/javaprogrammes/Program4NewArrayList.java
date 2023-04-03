package javaprogrammes;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program4NewArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();//store heterogeneous elements// ArrayList for generic object
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Brown");
        list.add("Indigo");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//prints list
        }
    }
}
