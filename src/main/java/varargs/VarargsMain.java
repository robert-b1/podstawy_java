package varargs;

import klasy.Kulka;

import java.util.ArrayList;
import java.util.List;

public class VarargsMain {

    //Zadanie
    /*
    1. Stwórz pakiet: varargs w javapodstawy
    2. Stwórz klase VarargsMain
    3. W klasie VarargsMain stwórz metodę
    zwracajacą sumę 3 liczb całkowitych
    suma3(int a, int b, int c)
    4. Przetestuj jej działanie w main
     */

    public static void main(String[] args) {
        // testy sumy
        int a = 5;int b =4; int c =2;int d = 7;int e=8;
        {// stała ilość argumentów
            int suma = suma3(a, b, c);
            //int sumaAb = suma3(a,b);// nie mamy takiej metody
            //int sumaAe = suma3(a,b,c,d,e); // nie mamy takiej metody
        }
        // varargs zmienna liczba argumentów
        {
            int suma = sumaN(a);
            suma = sumaN(a,b);
            suma = sumaN(a,b,c);
            System.out.println("11 = "+suma);// weryfikacja działania sumaN
            suma = sumaN(a,b,c,d,e);
        }
        {
            //Zadanie
            wypiszImiona("Jan","Anna","Andrzej","Janusz");
        }
        {
            Kulka kulka1 = new Kulka(1,4);
            Kulka kulka2 = new Kulka(2,8);
            Kulka kulka3 = new Kulka(6,4);

            // tradycyjne tworzenie kulek
            List<Kulka> listaKulek = new ArrayList<>();
            listaKulek.add(kulka1);
            listaKulek.add(kulka2);
            listaKulek.add(kulka3);

            // tworzenie kulek z wykorzystaniem metody - dynamiczna lista
            List<Kulka> listaKulekM = stworzListeKulek(kulka1,kulka2,kulka3);

            // podobne do tablicy - statyczna nie zmienna ilość elementów
            Kulka tablicaKulek[] = {kulka1,kulka2,kulka3};
        }
    }

    /*
    Metoda zawiera dokładnie 3 argumenty
     */
    public static int suma3(int a, int b, int c){
        return a+b+c;
    }
    /*
    3 kropki dają informację o zmiennej ilości argumentów
     */
    public static int sumaN(int... liczby){
        // podpowiedź +=
        // zmienna pomocnicza 'suma'
        int suma = 0;
        for (int element : liczby){
            // oblicz sume
            // zwiększanie sumy o element
            suma+=element;
        }
        return suma;
    }

    /**
     * Stwórz metodę wypisz imiona używając varargs
     */
    public static void wypiszImiona(String... imiona){

        for (/*Typ nazwaElementu: lista/tablica*/
                String imie : imiona){
            System.out.print(imie+",");
        }
    }

    public static List<Kulka> stworzListeKulek(Kulka... kulki){
        List<Kulka> rezultat = new ArrayList<>();
        for (Kulka element : kulki){
            rezultat.add(element);
        }
        return rezultat;
    }

}