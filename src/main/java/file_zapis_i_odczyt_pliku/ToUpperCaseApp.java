package file_zapis_i_odczyt_pliku;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToUpperCaseApp {
    public static void main(String[] args) {
        //program który sczytuje nazwę pliku z konsoli, wczytuje do listy,
        // zamienia wszystki litery na duże i zapisuje plik
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę/ścieżkę pliku");
        String wpiszPlik= scanner.nextLine();
        Path path= Paths.get("c:\\"+wpiszPlik);
        List<String> lines;
        try {
            lines= Files.readAllLines(path);
            List<String> result= new ArrayList<>();
            for(String line:lines){
                result.add(line.toUpperCase());
            }
            Files.write(path, result);
            System.out.println("Plik zapisano");
        } catch (IOException e) {
            System.out.println("Nie udało wpisać się pliku lub nie ma pliku");
        }
    }
}
