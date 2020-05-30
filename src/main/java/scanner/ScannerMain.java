package scanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) throws IOException {
        /*
        Utwórz tablice zawierającą liczby wczytane za pomocą scanner
        użyj nextInt()

        warunki zakończenia:
        * na początku pytanie ile liczb chcesz wprowadzić
        * po każdym dodaniu pytanie czy chcesz zakończyć [t/n]


        Dla chętnych:
        Utwórz tablice zawierającą liczby wylosowane z użyciem Random()
         */


        Scanner skaner = new Scanner(System.in);
        System.out.println("Jak masz na imię ?");
        String wprowadzoneImie = skaner.nextLine();// wczytanie napisu
        System.out.println("\nCześć, "+wprowadzoneImie+" miło Cię poznać");
        System.out.println("Wprowadź liczby. Ile masz dla mnie liczb ? ");
        int iloscLiczb = skaner.nextInt();
        Integer[] tablica = new Integer[iloscLiczb];
        // a) pętla i warunek zakończenia (for)
        for(int i=0; i < iloscLiczb;i++){
            tablica[i] = skaner.nextInt();
        }
        System.out.println("Wprowadziłeś:");
        for (int liczba : tablica){
            System.out.print(liczba+" ");
        }
        // b) pętla (while) i ilosc--
        //skaner.close();
        System.out.println("\n=========================================");
        //================ wersja z pytaniem
        // w pętli
        boolean czyKoniecPobierania = false;
        List<Integer> listaLiczb = new ArrayList<>();
        Scanner odczyt = new Scanner(System.in);

        while (!czyKoniecPobierania){


            System.out.println("\nWprowadź liczbę:");
            int liczba = odczyt.nextInt();
            listaLiczb.add(liczba);

            odczyt.nextLine();// znak enter po wpisaniu liczby

            System.out.println("Czy chcesz zakończyć wprowadzanie [t/n] ?");
            String odpowiedz = odczyt.nextLine();
            System.out.println("odpowiedz: "+odpowiedz);
            if(odpowiedz.equals("t")){
                // ma się zakończyć
                System.out.println("Koniec wprowadzania");
                czyKoniecPobierania = true;
            }
        }
        // wypisanie wprowadzonych liczb
        odczyt.close();
        skaner.close();

    }
}
