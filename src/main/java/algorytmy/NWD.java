package algorytmy;

public class NWD {

    public static int obliczOdejmując(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //    public static int obliczReszteZDzielenia(int a, int b){w domu do zrobienia
//
//    }
    public static void main(String[] args) {
        int wynik = NWD.obliczOdejmując(97, 13);
        System.out.println("NWD odejmując= " + wynik);
    }
}
