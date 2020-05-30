package wyrazenia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaMain {

    public static void main(String[] args) {
        {
            // wzorzec wyszukiwania
            String wyrazenieRegularne = "\\d{3}";//"Marcin";
            //Pattern compiledPattern = Pattern.compile("\\d{3}");
            Pattern compiledPattern = Pattern.compile(wyrazenieRegularne);

            // zamiast \\d{3} można wpisać Marcin

            // porównywarkę matchera
            Matcher matcher = compiledPattern.matcher("A tata Marcina powiedział 007");

            System.out.println("Czy występuje częściowo ? " + matcher.find());
            // czy jest w danym tekscie jako fragment

            System.out.println("Czy jest dokładnie taki jaki szukamy ? " + matcher.matches());
            // czy jest dokładnie taki sam - pasujący do wzorca

            String tekst = "123-123-123";
            matcher = compiledPattern.matcher(tekst);
            System.out.println("Czy występuje wzorzec '" + wyrazenieRegularne + "' w tekscie '" + tekst + "' ? " + matcher.matches());
        }
        /**
         * Zadanie: Stwórz program który pobiera z klawiatury numer telefonu
         * gdy jest poprawny - "Numer został poprawnie wprowadzony"
         * gdy jest nie poprawny "Proszę wprowadzić numer ponownie"
         *
         * Przykład wprowadzonego numeru:
         * 123-123-123
         *
         * Podpowiedź: użyj matches()
         *
         * Dodatkowo: numer może mieć ale nie musi +48
         */
        {
            System.out.println("\n====== TEST WPROWADZANIA NUMERU TELEFONU ======");
            // utworzenie skanera
            Scanner skaner = new Scanner(System.in);

            // for while ?
            while (true){// pętla w nieskończoność
                // pytanie o wprowadzenie numeru
                System.out.println("Wprowadź numer telefonu: ");

                // pobieranie z klawiatury do zmiennej
                String odpowiedz = skaner.nextLine();

                // porównanie ze wzorcem

                // wynik porównania - informacja na konsole
                String wyrazenieRegularne = "\\d{3}-\\d{3}-\\d{3}";
                wyrazenieRegularne = "(\\+48 \\d{3}-\\d{3}-\\d{3}|\\d{3}-\\d{3}-\\d{3})";// z numerem +48
                Pattern compiledPattern = Pattern.compile(wyrazenieRegularne);
                Matcher matcher = compiledPattern.matcher(odpowiedz);

                boolean czyPasuje = matcher.matches();// .matches()

                // gdy wynik porównania jest ok przerwanie pętli
                if (czyPasuje) {
                    System.out.println("Numer poprawny :)");
                    break;// zakonczenie pętli
                    // przerwanie pętli
                }else{
                    System.out.println("Numer nie poprawny!");
                }
            }



        }
    }
}
