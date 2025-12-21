package pl.edu.wszib.strumienie.strumienie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private List<String> colors;

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class Engine {
        private String engine;
        private String engineType;
    }
}
