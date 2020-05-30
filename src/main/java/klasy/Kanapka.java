package klasy;

public class Kanapka {

    String sklad;//to jest pole czyli właściwość kanapki​

    /**
     * konstruktor kanapki bezargumentowy
     */
    public Kanapka() {
        sklad = "nutella";
    }

    /**
     * konstruktor argumentowy
     *
     * @param podanySklad argument zawierający skład kanapki
     */
    public Kanapka(String podanySklad) {
        sklad = podanySklad;
    }
    /**
     * metoda wyświetlająca skład kanapki
     */
    public void wyswietlSkladKanapki() {
        System.out.println(sklad);
    }
}
