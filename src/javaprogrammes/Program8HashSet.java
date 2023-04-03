package javaprogrammes;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Program8HashSet {
    public static void main(String[] args) {//Main method
        HashSet<Integer> set = new HashSet<>();//Storing values in set
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++) {//loop to go through 1-10, to check which exists or does not exist
            if (set.contains(i)) {
                System.out.println("Number " + i + " does exist in set");
            } else {
                System.out.println("Number " + i + " does not exist in set");
            }
        }
    }
}
