package pl.edu.wszib.strumienie.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Ala");
        strings.add("Ola");
        strings.add("Ela");
        strings.add("Ula");
        strings.add("Janusz");
        strings.add("Zbyszek");
        strings.add("Mateusz");
        strings.add("Karol");

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Focus", 2021));
        cars.add(new Car("BMW", "X5", 2022));
        cars.add(new Car("Audi", "A4", 2018));
        cars.add(new Car("Mercedes", "C-Class", 2023));
        cars.add(new Car("Volkswagen", "Golf", 2020));
        cars.add(new Car("Mazda", "CX-5", 2021));
        cars.add(new Car("Nissan", "Qashqai", 2019));
        cars.add(new Car("Hyundai", "Tucson", 2022));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYear() - o2.getYear();
            }
        });

        System.out.println(cars);

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };

        JakisInterfejs jakisInterfejs = new JakisInterfejs() {
            @Override
            public void a() {
                System.out.println("Metoda a");
            }

            @Override
            public void b() {
                System.out.println("Metoda b");
            }

            @Override
            public void c() {
                System.out.println("Metoda c");
            }
        };

        jakisInterfejs.a();
        jakisInterfejs.b();
        jakisInterfejs.c();

        Car car = new Car("Test", "TestModel", 2000) {
            @Override
            public String toString() {
                return "To jest testowy samochod: " + super.toString();
            }
        };
    }
}
