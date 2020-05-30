package data_i_czas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataICzasMain {

    public static void main(String[] args) {

        LocalDateTime terazDateTime = LocalDateTime.now();// tworzenie daty
        System.out.println("Teraz jest "+terazDateTime);// wypisanie daty

        String formatDaty = "yyyy-MM-dd HH:mm:ss";
        String czasPosilku = "2019-12-01 13:00:00";
        // Zadanie
        // zamienić czas posilku na date wedlug formatu
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(formatDaty);
        // formater do formatowania daty zawiera on w argumencie wzór formatu
        LocalDateTime dataDateTime = LocalDateTime.parse(czasPosilku,formater);
        // data w formacie kodu Java czytelna dla interpretatora
        //dataDateTime.isBefore() // na LocalDateTime możemy wykonywać metody dostępne na dacie

        // Zadanie
        // wyswietlic date obecną według formatu
        String dataJakoNapis = terazDateTime.format(formater);// formatujemy za pomocą formatera

        // wypisanie informacji o dacie przy użyciu StringBuilder
        StringBuilder informacja = new StringBuilder();
        informacja.append("Data jako napis według formatu :"+formatDaty).append("\n");
        informacja.append(dataJakoNapis);

        System.out.println(informacja);

        String sylwesterData = "2019-12-31 23:59:59";
        System.out.println("Sylwester jako data :"+zamienNapisNaDate(sylwesterData));

        LocalDateTime koniecSwiataDateTime = LocalDateTime.of(2012,12,12,12,12);
        System.out.println("Koniec świata jest datą zmienioną jako napis :"+zamienDateNaNapis(koniecSwiataDateTime));


        // --- Zadanie
        LocalDateTime ostatnieLogowanieDateTime = LocalDateTime.of(2018,8,1,12,23);
        String formatLogowania = "HH:mm dd/MM/yyyy";
        DateTimeFormatter formaterLogowania = DateTimeFormatter.ofPattern(formatLogowania);
        String logowanieJakoNapis = ostatnieLogowanieDateTime.format(formaterLogowania);// formatujemy za pomocą formatera
        System.out.println("Zadanie data ostatniego logowania: "+logowanieJakoNapis);

    }

    private static LocalDateTime zamienNapisNaDate(String dataJakoNapis){
        String formatDaty = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(formatDaty);
        LocalDateTime dataDateTime = LocalDateTime.parse(dataJakoNapis,formater);
        return dataDateTime;// data jako data obiekt a nie jako napis
    }

    private static String zamienDateNaNapis(LocalDateTime terazDateTime){
        String formatDaty = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(formatDaty);
        String dataJakoNapis = terazDateTime.format(formater);// formatujemy za pomocą formatera
        return dataJakoNapis;
    }
}

