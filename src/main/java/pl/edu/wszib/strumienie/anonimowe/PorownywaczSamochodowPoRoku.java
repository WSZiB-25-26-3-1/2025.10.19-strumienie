package pl.edu.wszib.strumienie.anonimowe;

import java.util.Comparator;

public class PorownywaczSamochodowPoRoku implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}
