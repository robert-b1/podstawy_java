package algorytmy;

public class Rekurencja {
    public void stringOdTyluIteracyjnie(String tekst){
        for(int i =tekst.length()-1;i>=0;i--) {
            System.out.print(tekst.charAt(i) );
        }
    }
    public void stringOdTyluRekurencyjnie(String tekst,int indexTejRekurencji){
        if(indexTejRekurencji==tekst.length()){
            return;
        }
        stringOdTyluRekurencyjnie(tekst,indexTejRekurencji+1);
        System.out.print(tekst.charAt(indexTejRekurencji));
    }

    public static void main(String[] args) {
        Rekurencja rekurencja=new Rekurencja();
        String mojNapis="Ala ma kota!";

        rekurencja.stringOdTyluIteracyjnie(mojNapis);
        System.out.println();
        rekurencja.stringOdTyluRekurencyjnie(mojNapis,0);
    }
}
