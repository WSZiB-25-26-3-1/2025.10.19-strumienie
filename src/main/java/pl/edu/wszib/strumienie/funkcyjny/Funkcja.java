package pl.edu.wszib.strumienie.funkcyjny;

import java.util.function.Function;

public class Funkcja implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 5;
    }
}
