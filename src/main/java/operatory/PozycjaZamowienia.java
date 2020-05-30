package operatory;

public class PozycjaZamowienia {
    String nazwa;
    private float cena;// ustaliliśmy że cena jest widoczna tylko w tej klasie

    /**
     * Konstruktor tworzy pozycje zamowienia
     */
    public PozycjaZamowienia(String wstawNazwa, float wstawCena){
        nazwa = wstawNazwa;
        cena = wstawCena;
    }

    public float pobierzCena(){
        return cena;
    }

    public String pobierzNazwa() {
        return nazwa;
    }

    public String toString(){
        return nazwa+" \t"+cena;
    }

    public String info(){
        return nazwa+" ............"+cena;
    }
}
