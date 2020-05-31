package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaApp {
    static Scanner scanner= new Scanner(System.in);
    public static int inputInt() throws InputMismatchException {
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a =1;
        int b = 1;
        try {
            System.out.println("podaj bok a:");
            a = scanner.nextInt();
            System.out.println("podaj bok b");
            b = inputInt();
        } catch (Exception e){
            System.out.println("użytkowniku wpisuj tylko liczby!! Przejęto wartość 1 dla niepoprawnego boku");
        }
        finally {
            System.out.println("pole: " + a * b);
        }

        try {
            System.out.println(obliczBok(10,0));
        } catch (DivideByZeroException e) {
            System.out.println("zgłoszono wyjątek dzielenia przez zero:"+e.getMessage());;
        } catch (IllegalArgumentException e){
            System.out.println("zgłoszono wyjątek niepoprawnych argumentów:"+e.getMessage());
        }

        try {
            Object info =getInfo(null);
            System.out.println(info.toString());
        }catch (NullPointerException e){
            System.out.println("MASZ NULLA!!!");
        }


    }
    public static double obliczBok(double pole, double bok) throws DivideByZeroException,IllegalArgumentException{
        if(bok==0.0){
            throw new DivideByZeroException("Pamiętaj ch.. nie dziel przez zero!!!");
        }
        if(bok<0.0 || pole <0.0){
            throw new IllegalArgumentException();
        }
        return pole/bok;
    }

    public static Object getInfo(String content){
        //uwaga tak nie wolno robić. nie zwracamy nulli!!!!
        if(content==null){
            return null;
        }
        return new Object();
    }
}
