package pl.edu.wszib.strumienie.abstrakcja.przyklad;

public class App {
    public static void main(String[] args) {
        Algorytm algorytm = new Algorytm();

        algorytm.wykonaj();

        AlgorytmBaza algorytmBaza = new AlgorytmBaza();

        algorytmBaza.wykonaj();
    }
}
