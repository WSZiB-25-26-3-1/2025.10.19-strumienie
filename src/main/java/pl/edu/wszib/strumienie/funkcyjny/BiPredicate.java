package pl.edu.wszib.strumienie.funkcyjny;

@FunctionalInterface
public interface BiPredicate<T, X> {
    boolean test(T t, X x);
}
