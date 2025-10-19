package pl.edu.wszib.strumienie.abstrakcja;

public class Main {
    public static void main(String[] args) {
        JakisInterfejs klasaKolegi = new KlasaKolegi();
        klasaKolegi.jakasMetoda1();
        klasaKolegi.jakasMetoda2(5, 10);

        klasaKolegi.jakasMetoda1();

        Klasa klasa = new Klasa();
        klasa.y();
    }
}
