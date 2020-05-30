package abstarakcja;

import abstarakcja.figury.*;

import java.util.ArrayList;
import java.util.List;

public class AbstrakcjaMain {
    public static void main(String[] args) {

        Figura kwadrat = new Kwadrat(4);
        // Trojkat
        // Trojkat równoboczny
        // prostokąt
        // koło
        // wszystkie figury tworzymy w pakiecie figury

        /*
        Zadanie: Stwórz listę figur ,wypisz informacje
        zsumuj pola;
         */
        List<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(kwadrat);
        listaFigur.add(new Kolo(5));
        listaFigur.add(new Prostokat(3,4));
        listaFigur.add(new Trojkat(3,4,5));
        listaFigur.add(new TrojkatRownoboczny(5));

        int suma = 0;
        for(Figura figura : listaFigur){
            System.out.println(figura);// domyślne użycie toString()
            suma += figura.obliczPole();// zwiększenie sumy o pole
        }
        System.out.println("Suma pól figur: "+suma);


        /*Poniżej żarcik*/
        int a= 5;
        String kotki= null;
        spij(a,a,a,kotki,2);

    }

    public static void spij(int g,int b,int c, String t,int a){
        System.out.println("i dobranoc... zZzzz");
    }
}

