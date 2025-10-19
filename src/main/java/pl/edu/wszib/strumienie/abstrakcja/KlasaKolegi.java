package pl.edu.wszib.strumienie.abstrakcja;

public class KlasaKolegi implements JakisInterfejs, Interface2 {
    @Override
    public void jakasMetoda1() {
        System.out.printf("Cos sie dzieje");
    }

    @Override
    public int jakasMetoda2(int x, int y) {
        return x+y;
    }

    @Override
    public void method1() {

    }

    @Override
    public void x() {

    }
}
