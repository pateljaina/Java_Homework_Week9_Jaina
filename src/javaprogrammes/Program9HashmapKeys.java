package javaprogrammes;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9HashmapKeys {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap();
        people.put("Australia", 1);
        people.put("Uk", 2);
        people.put("Germany", 3);
        people.put("France", 4);

        for (Map.Entry<String, Integer> country : people.entrySet()) {//iterates values
            System.out.println(country.getKey() + " " + country.getValue());

        }
    }
}
