package pl.edu.wszib.strumienie.strumienie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,5,6,-2,7,4,7,8,9,0,11,12,13);

        list.stream()
                .skip(5)
                .forEach(System.out::println);
    }
}
