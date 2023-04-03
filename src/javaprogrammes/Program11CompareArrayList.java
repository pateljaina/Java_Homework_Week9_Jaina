package javaprogrammes;

import java.util.ArrayList;

/**
 * Declare following two arraylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */

public class Program11CompareArrayList {

    public static void main(String[] args) {//main method

        ArrayList<String> c1 = new ArrayList<String>();//declaring two arrays
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<String>();//Storing the comparison output in ArrayList<String>
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}

