package pl.edu.wszib.strumienie.strumienie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,5,6,-2,7,4,7,8,9,0,11,12,13);

        list.stream()
                .map(i -> "" + i)
                .filter(s -> s.startsWith("1"))
                .peek(System.out::println);

        /*List<Car> cars = List.of(
                new Car("C1", "C1", new Car.Engine("E1", "X"), List.of("Z", "N", "C")),
                new Car("C2", "C2", new Car.Engine("E1", "X"), List.of("Z", "N", "C")),
                new Car("C3", "C3", new Car.Engine("E1", "X"), List.of("Z", "N", "C")),
                new Car("C4", "C4", new Car.Engine("E1", "X"), List.of("Z", "N", "C")),
                new Car("C5", "C5", new Car.Engine("E1", "X"), List.of("Z", "N", "C")),
                new Car("C6", "C6", new Car.Engine("E1", "X"), List.of("Z", "N", "C"))
        );

        cars.stream()
                .flatMap(c -> c.getColors().stream())
                .forEach(System.out::println);*/

        /*cars.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(cars);*/
    }
}
