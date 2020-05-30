package petle.petla_while;

public class WhileMain {
    public static void main(String[] args) {
        {
            int liczba = 0;
            while (liczba < 10) {
                System.out.print(liczba);
                // Zadanie
                // zrób tak aby na końcu nie było przecinka
                if (liczba < 9) {
                    System.out.print(",");
                }
                liczba++;
            }
        }
        // Zadanie: wypisz w pętli
        // while liczby podzielne przez 3 od
        // 0 do 100
        // Dodatkowo : zlicz ile ich jest
        {
            System.out.println("\n\n==================");
            int liczba = 0;
            int licznik = 0;
            while (liczba<=100){
                if(liczba % 3 == 0){
                    System.out.print(liczba+" ");
                    licznik++;
                }
                liczba++;
            }
            System.out.println("\n\nLiczb jest : "+licznik);

        }
    }
}
