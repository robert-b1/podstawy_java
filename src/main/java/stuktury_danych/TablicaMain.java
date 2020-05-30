package stuktury_danych;

public class TablicaMain {

        public static void main(String[] args) {
            int mojaTab[] = {1, 2, 3, 4, 5, 6};
            TablicaMain tabObiekt = new TablicaMain();
            tabObiekt.parzysteIndeksy(mojaTab);
            System.out.println(" \n");
            tabObiekt.sumaLiczbPodzielnychPrzezTrzy(mojaTab);
            System.out.println("\n");
            tabObiekt.sumaPieciuLiczbMinusLiczbaOstatnia(mojaTab);


        }

        public void parzysteIndeksy(int[] tab) {
            for (int i = tab.length - 1; i >= 0; i--) {
                if (i % 2 == 0)
                    System.out.print(tab[i] + " ");
            }
        }

        public void sumaLiczbPodzielnychPrzezTrzy(int[] tab) {
            int suma = 0;
            for (int i = 0; i < tab.length; i++) {
                System.out.print(" ");
                if (tab[i] % 3 == 0) {

                    System.out.println("liczby podzielne przez 3: " + i + " ");
                    suma+=tab[i];//suma = suma + tab[i];
                }
            }
            System.out.println("suma liczb podzielnych przez 3: " + suma + " ");
        }

        public void sumaPieciuLiczbMinusLiczbaOstatnia(int[] tab) {
            int suma = 0, wynik = 0;
            for (int i = 0; i <5; i++) {
                suma = suma + tab[i];
            }
            wynik=suma-tab[tab.length-1];
            System.out.println("wynik to: "+wynik);
        }
    }



