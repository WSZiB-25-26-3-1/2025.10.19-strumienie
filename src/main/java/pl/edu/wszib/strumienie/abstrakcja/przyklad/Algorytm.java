package pl.edu.wszib.strumienie.abstrakcja.przyklad;

public abstract class Algorytm {

    public void wykonaj() {
        wczytajDane();
        przetworzDane1();
        przetworzDane2();
        przetworzDane3();
        zapiszWyniki();
    }

    public abstract void wczytajDane();

    public void przetworzDane1() {
        System.out.println("przetwarzanie danych 1...\n");
    }

    public void przetworzDane2() {
        System.out.println("przetwarzanie danych 2...\n");
    }

    public void przetworzDane3() {
        System.out.println("przetwarzanie danych 2...\n");
    }

    public abstract void zapiszWyniki();
}
