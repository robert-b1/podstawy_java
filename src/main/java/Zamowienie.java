public class Zamowienie {int numer;
    float cena;

    public Zamowienie(int wstawNumer, float wstawCena){
        numer = wstawNumer;
        cena = wstawCena;
    }

    public float pobierzCena(){
        return cena;
    }

    public void ustawCena(float wstawCena){
        cena = wstawCena;
    }
}