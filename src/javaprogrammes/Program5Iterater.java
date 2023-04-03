package javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Program5Iterater {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();//HashSet declaration

        set.add("Audi");
        set.add("Mercedes");
        set.add("BMW");
        set.add("Honda");
        set.add("Toyota");
        set.add("Ford");
        set.add("Porsche");

        Iterator<String> list = set.iterator();//will iterate and store into list
        while (list.hasNext()) {//condition will show next value
            System.out.println(list.next());
        }
    }
}
