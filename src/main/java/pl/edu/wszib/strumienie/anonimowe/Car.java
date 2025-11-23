package pl.edu.wszib.strumienie.anonimowe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car /*implements Comparable<Car>*/ {
    private String brand;
    private String model;
    private int year;

    /*@Override
    public int compareTo(Car o) {
        return -this.brand.compareTo(o.brand);
    }*/
}
