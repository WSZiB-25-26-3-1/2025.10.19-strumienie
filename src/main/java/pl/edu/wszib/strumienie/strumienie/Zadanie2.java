package pl.edu.wszib.strumienie.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        /*
        chcemy dostać 2 liczbę
        podzielną przez 3 i przez 5 nie licząc duplikatów
         */
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

        List<Integer> noDuplicates = new ArrayList<>();
        for (int i : numbers) {
            if(!noDuplicates.contains(i) && i % 3 == 0 && i % 5 == 0) {
                noDuplicates.add(i);
            }
        }

        System.out.println(noDuplicates.get(1));

        numbers.stream()
                .distinct()
                .filter(i -> i % 5 == 0)
                .filter(i -> i % 3 == 0)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
