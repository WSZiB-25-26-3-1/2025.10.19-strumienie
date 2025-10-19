package pl.edu.wszib.strumienie.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    int x;

    public KlasaAbstrakcyjna(int x) {
        this.x = x;
    }

    public KlasaAbstrakcyjna() {
    }

    void x() {
        System.out.println("Metoda z klasy abstrakcyjnej " + x);
    }

    abstract void metodaAbstrakcyjna();
    abstract void metodaAbstrakcyjna2();
    abstract void metodaAbstrakcyjna3();
}
