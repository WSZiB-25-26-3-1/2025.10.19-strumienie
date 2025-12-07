package pl.edu.wszib.strumienie.optionale;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Car> carBox = findCar("KR77");
        /*Car car = carBox.orElseGet(App::defaultCarSupplier);
        Optional<Car> or = carBox.or(App::otherCar);
        System.out.println(car.getBrand());*/

        if(carBox.isPresent()) {
            Car car = carBox.get();
            System.out.println(car);
        }

        carBox.ifPresent(System.out::println);

        //
        try {
            Car car = carBox.get();
            System.out.println(car);
        } catch (NoSuchElementException e) {
            throw new CarNotFoundException();
        }

        System.out.println(carBox.orElseThrow(CarNotFoundException::new));
        //
    }

    public static Optional<Car> findCar(String plate) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", "KR11"));
        cars.add(new Car("Toyota", "Corolla", "KR22"));
        cars.add(new Car("Honda", "Civic", "KR33"));
        cars.add(new Car("Kia", "Ceed", "KR44"));
        cars.add(new Car("Fiat", "500", "KR55"));

        for(Car car : cars) {
            if(car.getPlate().equals(plate)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }

    public static Car defaultCarSupplier() {
        return new Car("", "", "");
    }

    public static Optional<Car> otherCar() {
        return Optional.empty();
    }
}
