package petle.do_while;

import java.util.Scanner;

public class DoWhileMain {
    public static void main(String[] args) {
        //Program ma pobierać liczby większe od zera oraz po wpisaniu zera ma wypisać sumę liczb
            Scanner skaner = new Scanner(System.in);
            int pobranaLiczba;
            int suma = 0;
            do {
                pobranaLiczba = skaner.nextInt();
                suma = suma + pobranaLiczba;
                // System.out.println(pobranaLiczba);
            } while (pobranaLiczba > 0);
            System.out.println(suma);
        }
    }

