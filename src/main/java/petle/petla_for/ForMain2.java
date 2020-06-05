package petle.petla_for;

import java.util.Random;
import java.util.Scanner;

public class ForMain2 {
    public static void main(String[] args) {
        //Pobierz liczbę z klawiatury i wypisz ją, potem wylosuj liczbę
        // od 0 do 10 , jeśli wylosowana jest mniejsza dodaj punkt, pobierasz liczbę 3 razy
        int i3;
        int wynik = 0;
        for (i3 = 0; i3 < 3; i3++) {
            Scanner skaner1 = new Scanner(System.in);
            int liczba1 = skaner1.nextInt();
            System.out.println(liczba1);
            Random losowanie = new Random();
            int wylosowana = losowanie.nextInt(10);
            System.out.println(wylosowana);
            if (liczba1 > wylosowana) {
                wynik++;

                System.out.println("twój wynik to: " + wynik);
            }
        }
    }
}
