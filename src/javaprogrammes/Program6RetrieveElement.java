package javaprogrammes;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Program6RetrieveElement {
    public static void main(String[] args) {//Main Method
        List<String> list_Strings = new ArrayList<String>();//storing colours to a list
        list_Strings.add("Red");//0 position
        list_Strings.add("Orange");//1 position
        list_Strings.add("Yellow");//2 position
        list_Strings.add("Green");// 3 position
        list_Strings.add("Brown");// 4 position
        list_Strings.add("Indigo");// 5 position
        list_Strings.add("Violet");//6 position

        String element = list_Strings.get(3);//get position 3
        System.out.println("The fourth element is:" + element);// Retrieve 3rd and 5th element
        element = list_Strings.get(5);
        System.out.println("The sixth element is:" + element);
    }
}
