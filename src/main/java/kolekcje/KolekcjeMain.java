package kolekcje;

import interfejsy.DworzecMcDonaldImpl;
import interfejsy.McDonald;
import interfejsy.User;
import operatory.PozycjaZamowienia;

import java.util.ArrayList;
import java.util.List;

public class KolekcjeMain {
    public static void main(String[] args) {


        // McDonald -> interfejs
        // DworzecMcDonaldImpl -> implementacja McDonald
        McDonald sklep = new DworzecMcDonaldImpl();
        sklep.poproszeFrytki(10f);

        // lista liczb
        // ArrayList -> implementacja List
        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(2);
        listaLiczb.add(0);
        listaLiczb.add(1);
        listaLiczb.add(9);

        System.out.println("== for z użyciem : ==================================\n\n");
        // w pętli wypisujemy listę liczb
        // pętla for()
        // : -> z
        for (Integer liczba : listaLiczb){
            System.out.print(liczba);
        }
        System.out.println("\n\n====== for z iteratorem ============================\n\n");

        // for z iteratorem
        // deklaracja i inicjalizacja iteratora ; warunek zakończenia ; krok
        for(int i=0; i<4; i++){
            System.out.println(listaLiczb.get(i));
        }


        List<User> listaUzytkownikow = new ArrayList<>();


        // Utworz liste pozycji w zamówieniu
        // Lista PozycjaZamowienia 3 pozycje
        PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Pizza Vege",29.99f);
        PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Pizza Margarita",9.99f);
        PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Pizza Mefisto",19.99f);

        List<PozycjaZamowienia> listaPozycji = new ArrayList<>();
        listaPozycji.add(pozycja1);
        listaPozycji.add(pozycja2);
        listaPozycji.add(pozycja3);

        //Zadanie z użyciem pętli for wypisz pozycje ( uwaga użyj toString())

        for (PozycjaZamowienia pozycja : listaPozycji){
            System.out.println(pozycja);
        }
    }
}
