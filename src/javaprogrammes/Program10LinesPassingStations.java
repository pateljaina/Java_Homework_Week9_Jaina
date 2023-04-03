package javaprogrammes;

import java.util.HashMap;
import java.util.Scanner;


/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Program10LinesPassingStations {
    public static void main(String[] args) {
        char result;
        String stationName;
        System.out.println("Zone 1 Tube Stations");//store some zone 1 stations
        System.out.println("Oxford Circus, Bond Street, Green Park, Warren Street, South Kensington, Marble Arch, Tottenham Court Road");
        HashMap<String, String> zone = new HashMap<>();
        zone.put("Oxford Circus", "Victoria Line and Bakerloo Line");//store corresponding lines in Hashmap
        zone.put("Bond Street", "Central Line and Jubilee Line");
        zone.put("Green Park", "Victoria Line, Picadilly Line and Jubilee Line");
        zone.put("Warren Street", "Victoria Line and Northern Line");
        zone.put("South Kensington", "District Line & Picadilly Line");
        zone.put("Marble Arch", "Central Line");
        zone.put("Tottenham Court Road", "Central and Northern Line");

        do {
            Scanner scanner = new Scanner(System.in); //use scanner for user to input requested station
            System.out.println("Enter station name from above");
            stationName = scanner.nextLine();
            for (String str : zone.keySet()) {
                if (stationName.equals(str)) {
                    System.out.println("Tubes lines crossing this station are " + zone.get(str));
                }

            }
            System.out.println("  ");
            System.out.println("Would you like to check another station? 'Y' or 'N'");//Asking user if they wish to check another station
            result = scanner.next().charAt(0);
            scanner.close();
        } while (result == 'Y' || result == 'y');//will ask again if 'y' chosen
    }
}