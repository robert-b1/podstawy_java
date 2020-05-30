package formatowanie;

public class FormatMain {

    public static void main(String[] args) {
        String napisCudzyslow = "";
        String napisZKonstruktorem = new String("");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";
        System.out.print(napis);// wypisanie napis bez entera na końcu
        // println("abc") == print("abc"+"\n")
        System.out.printf(napis,12);// f - formater
        // %d - oznacza liczbę decimal
        String format = "Liczba zmiennoprzecinkowa %.2f\n";// .2 oznacza 2 miejsca po przecinku
        System.out.printf(format,1.8888f);// zaokrąglenie liczby .2
        System.out.println("Napis");
        System.out.println(napisZKonstruktorem);
        System.out.println(napisNull);
        //System.out.println(napisBezInicjalizacji);

    }
}
