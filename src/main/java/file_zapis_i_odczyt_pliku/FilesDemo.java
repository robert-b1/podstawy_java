package file_zapis_i_odczyt_pliku;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesDemo {
    public static void main(String[] args) {

        //czytanie z pliku
        Path path = Paths.get("C:\\Users\\Lenovo\\Desktop\\nauka_java\\podstawy_java\\podstawy_java\\src\\main\\resources\\plik1.txt");
        Scanner scn = new Scanner(System.in);
        List<String> lines;

        try {
            lines = Files.readAllLines(path);
            List<String> words = new ArrayList<>();
            for (String line : lines) {
                System.out.println(line);
                List<String> lineWords = Arrays.asList(line.split(" "));
                words.addAll(lineWords);
            }
            String line = scn.nextLine();
            //szuka wyrazu ktróry wpiszemy ręcznie
            if (lines.contains(line)) {
                System.out.println("znalazłem");
            } else {
                System.out.println("Nie ma takiego wyrazu");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku");
        }
    }
}
