import javax.swing.text.html.HTMLDocument;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<City>> cities = new HashMap<String, ArrayList<City>>();

        City london = new City("London");
        City manchester = new City("Manchester");
        City paris = new City("Paris");
        City bordeaux = new City("Bordeaux");
        City barcelona = new City("Barcelona");
        City madrid = new City("Madrid");

        ArrayList<City> cities1 = new ArrayList<>(Arrays.asList(london, manchester));
        ArrayList<City> cities2 =new ArrayList<>(Arrays.asList(paris, bordeaux));
        ArrayList<City> cities3 =new ArrayList<>(Arrays.asList(barcelona, madrid));

        cities.put("UK", cities1);
        cities.put("France", cities2);
        cities.put("Spain", cities3);


        System.out.println(cities);
        System.out.println(cities.get("Spain"));

        for (String country : cities.keySet()) {
            System.out.println("The key value : " + country + " with these cities: " + cities.get(country));
        }

        Iterator<String> cityKeys = cities.keySet().iterator();

        while (cityKeys.hasNext()) {
            Collections.sort();
        }
    }
}