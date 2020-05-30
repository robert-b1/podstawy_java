package stuktury_danych;

import java.util.Arrays;

public class TablicaZadania {

    public int[] sumaDwochTablic(int[] a,int[] b) {
        if (a.length == b.length) {
            int[] tablicaSumujaca = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                tablicaSumujaca[i] = a[i] + b[i];
            }
            return tablicaSumujaca;

        } else {
            System.out.println("Sory, ale nierówne");
            return null;
        }
    }

    public static void main(String[] args) {
        int[]tablicaPierwsza={1,2,3,4,5,6};
        int[]tablicaDruga={6,5,4,3,2,1};

        TablicaZadania tablicaZadania=new TablicaZadania();
        int[] tablicaTrzecia=tablicaZadania.sumaDwochTablic(tablicaPierwsza, tablicaDruga);
        System.out.println(Arrays.toString(tablicaTrzecia));//Arrays.toString wypisuje cała tablice(nie musimy urzywać pętli do wypisania)
    }
}
