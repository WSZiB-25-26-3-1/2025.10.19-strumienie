package pl.edu.wszib.strumienie.optionale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String brand;
    private String model;
    private String plate;
}
