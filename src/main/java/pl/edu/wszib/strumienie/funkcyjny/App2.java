package pl.edu.wszib.strumienie.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        loadAndProcess(App2::loadDataFromFile, App2::processData1);

        loadAndProcess(App2::loadDataFromWeb, App2::processData2);

        loadAndProcess(App2::loadDataFromDb, App2::processData3);
    }

    public static int loadDataFromDb() {
        return 2;
    }

    public static int loadDataFromFile() {
        return 3;
    }

    public static int loadDataFromWeb() {
        return 4;
    }

    public static int processData1(int x) {
        return x*3;
    }

    public static int processData2(int x) {
        return x*4;
    }

    public static int processData3(int x) {
        return x*5;
    }

    public static int loadAndProcess(Supplier<Integer> loader, UnaryOperator<Integer> processor) {
        int x = loader.get();
        return processor.apply(x);
    }
}
