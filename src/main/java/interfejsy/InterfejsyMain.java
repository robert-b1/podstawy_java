package interfejsy;

public class InterfejsyMain {

    public static void main(String[] args) {
        // TypDanych nazwa = new Obiekt();
        McDonald mcDonaldNaDworcu = new DworzecMcDonaldImpl();// tworzenie obiektu implementacji interfejsu
        mcDonaldNaDworcu.poproszeFrytki(50); // wywolanie metody w mcdonald na dworcu

        User annaNowak21 = new User("Anna","Nowak",21);
        System.out.println(annaNowak21.toString());


    }
}
