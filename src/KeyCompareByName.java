import java.util.Comparator;

public abstract class KeyCompareByName implements Comparator<Main> {

    @Override
    public int compare(String city1, String city2) {
        return city1.compareTo(city2);
    }
}
