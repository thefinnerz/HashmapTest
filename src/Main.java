import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> cities = new HashMap<String, ArrayList<String>>();

        cities.put("UK", new ArrayList<>(Arrays.asList("London", "Manchester")));
        cities.put("France", new ArrayList<>(Arrays.asList("Paris", "Bordeaux")));
        cities.put("Spain", new ArrayList<>(Arrays.asList("Barcelona", "Madrid")));

        System.out.println(cities);
        System.out.println(cities.get("Spain"));

        for (String country : cities.keySet()) {
            System.out.println("The key value : " + country + " with these cities: " + cities.get(country));
        }
    }
}