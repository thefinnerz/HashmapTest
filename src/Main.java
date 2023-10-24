import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
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

        ArrayList<String> countries = new ArrayList<String>();

        countries.add("UK");
        countries.add("France");
        countries.add("Spain");

        Collections.sort(countries, new KeyCompareByName());

        cities.put(countries.get(0), cities1);
        cities.put(countries.get(1), cities2);
        cities.put(countries.get(2), cities3);

        for (String s : cities.keySet()) {
            Collections.sort(cities.get(s), new ValueCompareByName());
        }

        Iterator<String> it = cities.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            PrintByKey(key, cities);
        }

        System.out.println(cities2.get(0).getName());


        System.out.println(cities);
        System.out.println(cities.get("Spain"));

        for (String country : cities.keySet()) {
            System.out.println("The key value : " + country + " with these cities: ");
            for (City c : cities.get(country)) {
                System.out.println(c.getName());
            }
        }
    }

    public static void PrintByKey(String key, HashMap<String, ArrayList<City>> cities) {
        System.out.println("Country: " + key + ", Cities: " + cities.get(key).get(0).getName() + ", " + cities.get(key).get(1).getName());
    }
}