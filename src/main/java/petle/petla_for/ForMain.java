package petle.petla_for;

import java.util.ArrayList;
import java.util.List;

public class ForMain {
    public static void main(String[] args) {

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

    }
}
