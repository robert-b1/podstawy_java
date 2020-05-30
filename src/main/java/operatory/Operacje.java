package operatory;

public class Operacje {
// Zadanie
    // zmniejsz, zwiększ, liczba parzysta, liczba ujemna

    public int zmniejsz(int liczba, int zmniejszenie){
        return  liczba-=zmniejszenie;
    }

    public int zwieksz(int liczba, int zwiekszenie){
        return liczba+=zwiekszenie;
    }

    public boolean liczbaParzysta(int liczba){
        return liczba%2==0;
    }

    public boolean liczbaUjemna(int liczba){
        return liczba<0;
    }
}
