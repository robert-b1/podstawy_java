package instrukcje.warunkowe;

import instrukcje.Status;

public class Sprawdz {

    // metoda sprawdzajaca pelnoletniosc
    // boolean jestPelnoletni(int wiek)

    public static boolean czyJestPelnoletni(int wiek) {
        return wiek>17;
    }

    public static boolean czyJestAktywny(Status status) {
        return status.equals(Status.AKTYWNY);
    }

    // string toLowerCase()
    public static boolean czyJestKobieta(String plec) {
        return plec.toLowerCase().equals("kobieta");
    }

    /**
     * Wersja powyższej metody z użyciem typu wyliczeniowego
     *
     * @param plecOsoby
     * @return prawda/fałsz
     */
    public static boolean czyJestKobieta(Plec plecOsoby) {
        return plecOsoby.equals(Plec.KOBIETA);
    }
}
