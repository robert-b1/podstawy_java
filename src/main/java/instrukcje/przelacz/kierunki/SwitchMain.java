package instrukcje.przelacz.kierunki;

import instrukcje.Status;

public class SwitchMain {

    public static void main(String[] args) {

        // Przykład ze statusem
        Status statusUzytkownika = Status.AKTYWNY;
        switch (statusUzytkownika){
            case AKTYWNY:
                System.out.println("Użytkownik jest aktywny");
                break;
            case ZALOGOWANY:
                System.out.println("Użytkownik jest zalogowany");
                break;
        }

        // ubieranie się
        System.out.println("=====================\n");
        Ubior etapUbieraniaSie = Ubior.SPODNIE;
        switch (etapUbieraniaSie){
            case SKARPETY:
                System.out.println("Ubieramy skarpety");
            case SPODNIE:
                System.out.println("Ubieramy spodnie");
            case KOSZULA:
                System.out.println("Ubieramy koszule");
            case GARNITUR:
                System.out.println("Ubieramy garnitur");
            case BUTY:
                System.out.println("Ubieramy buty");
        }


        //Zadanie z tablicy
        // enum Kierunkek { 4 strony świata }
        // switch do jakich miast dojedziemy

        Kierunek gdzieJedziemy = Kierunek.POLNOC;
        switch (gdzieJedziemy){
            case POLNOC:
                System.out.println("Jedziemy do Gdańska");
                break;
            case WSCHOD:
                System.out.println("Jedziemy do Bydgoszcz");
                break;
            case ZACHOD:
                System.out.println("Jedziemy do Łódź");
                break;
            case POLUDNIE:
                System.out.println("Jedziemy do Warszawa");
                break;
        }

    }
}
