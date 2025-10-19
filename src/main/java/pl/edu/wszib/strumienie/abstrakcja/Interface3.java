package pl.edu.wszib.strumienie.abstrakcja;

public interface Interface3 {
    int zmienna = 5;

    void x();

    default void y() {
        y1();
        y2();
        y3();
    }

    private void y1() {
        System.out.println("cos tam");
    }

    private void y2() {
        System.out.println("cos tam");
    }

    private void y3() {
        System.out.println("cos tam");
    }
}
