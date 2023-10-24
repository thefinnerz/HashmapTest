import java.util.Comparator;

public class ValueCompareByName implements Comparator<City> {

    @Override
    public int compare(City city1, City city2) {
        return city1.getName().compareTo(city2.getName());
    }
}
