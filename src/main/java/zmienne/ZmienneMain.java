package zmienne;

public class ZmienneMain {

    //psvm
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");// polecenie wypisuje na konsole


        int number = 5;// deklaracji i inicjalizacji
        System.out.println("To jest liczba "+ number);

        // inny przyklad

        int rok; // deklaracja
        rok = 2019; // inicjalizacja
        //skrót : sout
        System.out.println(rok);
        System.out.println("rok");// to jest napis w cudzysłowie


        //>>> typy obiektowy a prymitywny

        String napisObiekt = "torun".toUpperCase();
        // "torun" === new String("torun")
        String nazwaObiektu = new String("Torun");
        nazwaObiektu.toUpperCase();// metoda na obiekcie napis

        int liczbaPrymitywna = 2019;
        Integer liczbaObiektowa = new Integer(2019);
        liczbaObiektowa.equals(9);// porównanie do liczby 9 sprawdzenie warunku równości equal
        // na liczbie obiektowej można wykonać metodę ponieważ jest obiektem
        //liczbaPrymitywna == 9;// sprawdzenie czy jest równa liczba 9 i liczbaPrymitywna

    }
}
