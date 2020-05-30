package klasy;

public class KlasyMain {

    public static void main(String[] args) {
        //Example example = new Example();
        Kanapka mojaKanapka = new Kanapka();// utworzenie obiektu kanapka
        mojaKanapka.wyswietlSkladKanapki();// wywolanie metody na obiekcie kanapka
        // wyswietli "nutella" czyli domyslna kanapka

        Kanapka kanapkaZPomidorem = new Kanapka("pomidor");
        kanapkaZPomidorem.wyswietlSkladKanapki();
        // wyswietli "pomidor" czyli konstruktor argumentowy ze skladem

    }
}
