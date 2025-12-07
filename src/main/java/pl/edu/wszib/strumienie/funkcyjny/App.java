package pl.edu.wszib.strumienie.funkcyjny;

import java.util.ArrayList;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list;

        /*Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };*/

        Function<String, Integer> function = String::length;

        Integer janusz = function.apply("janusz");
        System.out.println(janusz);

        /*UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return "Tekst: " + s;
            }
        };*/

        UnaryOperator<String> unaryOperator = s -> "Tekst: " + s;

        String abc = unaryOperator.apply("abc");
        System.out.println(abc);

        /*BiFunction<String, String, Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };*/

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();

        Integer apply = biFunction.apply("abc", "xxxxxx");
        System.out.println(apply);

        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        };*/

        Predicate<String> predicate = s -> s.length() > 3;

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("mateusz"));

        /*Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return new String("default string");
            }
        };*/

        Supplier<String> supplier = () -> new String("default string");

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };*/

        Consumer<String> consumer = System.out::println;

        consumer.accept("abc");
        consumer.accept("janusz");

        String jacek = unaryOperator.apply("jacek");
        System.out.println(jacek);

        final int zmienna = 5;
        Function<Integer, Integer> f2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * zmienna;
            }
        };

        BiFunction<Integer, Integer, Integer> f3 = (x,y) -> x*y;

        System.out.println(f2.apply(3));
        System.out.println(f2.apply(3));
    }
}
