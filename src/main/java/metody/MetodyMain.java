package metody;

public class MetodyMain {
    //psvm
    public static void main(String[] args) {
        int c; // deklaracja zmiennej c, która zawiera sumę
        c = suma(6,89); // przypisanie wyniku metody do zmiennej c
        System.out.println(c);
    }

    /**
     * Metoda sumująca liczby a i b
     * @param a liczba całkowita
     * @param b liczba całkowita
     * @return wynik sumy a+b
     */
    private static int suma(int a, int b) {
        return a+b;
    }
}
