package interfejsy;

public class User {

    String imie, nazwisko;
    int wiek;

    public User(String podaneImie, String podaneNazwisko, int podanyWiek) {
        imie = podaneImie;
        nazwisko = podaneNazwisko;
        wiek = podanyWiek;
    }

    public String toString() {
        return "Użytkownik: " + imie + " " + nazwisko + " wiek: " + wiek;
    }
}
