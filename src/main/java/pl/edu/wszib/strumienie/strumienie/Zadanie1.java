package pl.edu.wszib.strumienie.strumienie;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> numbers = List.of(
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100)
        );

        System.out.println(numbers);

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double average = (double) sum / numbers.size();

        System.out.println(average);

        numbers.stream()
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);
    }
}
