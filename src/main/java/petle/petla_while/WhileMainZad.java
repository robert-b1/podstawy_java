package petle.petla_while;

import java.util.Random;

public class WhileMainZad {
    public static void main(String[] args) {
        //Wylosuj i wypisz 6 liczb w przedziale od 0 do 36
        System.out.println("Zadanie 1");
        int liczba2 = 6;
        int i2 = 0;
        while (i2 <= liczba2) {
            Random losowanie = new Random();
            int wylosowanaLiczba = losowanie.nextInt(37);
            System.out.println("nr losowania" + i2 + "." + "\t" + wylosowanaLiczba);
            i2++;
        }
        System.out.println("------------------------------------------");

        System.out.println("Zadanie 2");
        //Napisz program który wypisze tabliczkę mnożenia od 2 do 9

        int liczba = 10;
        int i = 2;
        while (i < liczba) {
            for (int j = 1; j < 10; j++) {
                int wynik2 = i * j;
                System.out.println(i + " * " + j + " = " + wynik2);
            }
            i++;

        }
    }
}
