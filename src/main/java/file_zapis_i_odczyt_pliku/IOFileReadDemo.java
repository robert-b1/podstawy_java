package file_zapis_i_odczyt_pliku;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileReadDemo {
    public static void main(String[] args) throws IOException {
        //czytanie pliku i zapis w array liście
        File file= new File(
                "C:\\Users\\Lenovo\\Desktop\\nauka_java\\podstawy_java\\" +
                        "podstawy_java\\src\\main\\resources\\plik1.txt");
        FileInputStream inputStream= new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader =new BufferedReader(inputStreamReader);
        List<String> lines=new ArrayList<>();
        String line;
        while ((line =reader.readLine())!=null){
            System.out.println(line);
            lines.add(line);
        }
        reader.close();

        //zapis kopi w nowo utworzonym pliku pliku
        FileOutputStream outputStream =new FileOutputStream(
                "C:\\Users\\Lenovo\\Desktop\\nauka_java\\podstawy_java\\" +
                        "podstawy_java\\src\\main\\resources\\plik2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        PrintWriter printWriter =new PrintWriter(outputStreamWriter, true);
        for(String w:lines){
            printWriter.println(w);
        }
        printWriter.close();
    }
}
