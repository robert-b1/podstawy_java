package algorytmy;

public class Silnia {
    public static int rekurencyjnie(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return n*rekurencyjnie(n-1);//5*silnia(5-1)
    }

    public static void main(String[] args) {
        int wynik=Silnia.rekurencyjnie(5);
        System.out.println("Silnia "+wynik);
    }
}
