package tablice;

import interfejsy.User;

public class TabliceMain {
    public static void main(String[] args) {

        int tablicaPieciuLiczb[] = new int[5];
        tablicaPieciuLiczb[0] = 10;
        tablicaPieciuLiczb[1] = 20;
        tablicaPieciuLiczb[2] = 30;
        tablicaPieciuLiczb[3] = 40;
        tablicaPieciuLiczb[4] = 50;


        // Utworz tablice zawierajaca 5 liczb oraz 5 miast
        // Utworz tablice 3 userów

        String[] tablicaMiast = {"Toruń","Bydgoszcz","Poznań","Grudziądz","Warszawa"};

        User user1 = new User("Anna","Nowak",22);
        User user2 = new User("Ferdynand","Kiepski",44);
        User user3 = new User("Kapitan","Planeta",100);

        User uzytkownicyTablica[] = {user1,user2,user3};



    }
}
