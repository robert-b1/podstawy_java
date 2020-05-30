package operatory;

public class OperatoryMain {
    public static void main(String[] args) {
        PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Papier A4", 11.99f);
        PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Ołówki", 2.99f);
        PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Długopisy", 7.99f);

        float sumaPozycji = pozycja1.pobierzCena() + pozycja2.pobierzCena() + pozycja3.pobierzCena();

        // brakuje wypisania nazw poszczególnych pozycji
        // toString w klasie PozycjaZamowienia

        System.out.println("=============================\n\nLista zamówień:\n\n");
        System.out.println(pozycja1.pobierzNazwa());
        System.out.println(pozycja2.toString());// metoda toString zawiera informacje o cenie
        System.out.println(pozycja3);// domyślne użycie metody toString nie trzeba jej pisać

        // czyli wystarczy
        // znak enter \n
        System.out.println("-----------");
        System.out.println(pozycja1 + "\n" + pozycja2 + "\n" + pozycja3);// to co powyzej tylko w jednej linii
        System.out.println("Suma pozycji :" + sumaPozycji);

        //przypisania =, +=, -=, *= , /=

        int a = 1;
        int b = 2;
        int c = 3;

        c += 1;// c = 4 , czyli zwiększenie o 1
        c += 2;// c = 6 , czyli zwiększenie 4 o 2
        b -= 2; // b = 0, zmniejszenie o 2
        c *= 3; // c = 18, zwielokrotnienie ( c=6 powyżej)
        b /=2; // b = 0, podzielenie

        //arytmetyczne + * / - % ++ --
        a = 1;
        b = 2;
        c = 3;
        int d = a+b;
        int e = a-b;
        int f = a*b;
        int g = a/b;
        int h = c%b; // h = 1 reszta z dzielenia
        // 3 przez 2
        h++; // zwiększenie h o 1 czyli dostaniemy 2
        b--; // zmniejszenie b o 1 czyli dostaniemy 1

        //logiczne && || !
        boolean jestFajna = true;
        boolean jezdziBMW = true;
        boolean jestMila = true;
        boolean jestMojaDziewczyna = false;

        boolean czyAniaJestFajna;
        czyAniaJestFajna = jestFajna && jestMila;
        // Ania jest fajna

        boolean czyAniaJestDobra = !jestMila;

        boolean czyAniaBedzieMojaDziewczyna = jezdziBMW || jestMojaDziewczyna;
        // || = lub


        //relacji >,<,>=,<=,==,!=
        a = 1;
        b = 2;
        c = 3;

        boolean aWiekszeOdB = a > b;
        boolean aMniejszeOdB = a < b;
        boolean aWiekszeRowneodB = a >= b;
        boolean aMniejszeRowneOdB = a <=b;
        boolean aRowneB = a == b;
        boolean aRozneOdB = a != b;
        boolean aTakieSameJakB = aRowneB == !aRozneOdB;
        // a =1 b= 2
        // false == !true -> false == false -> są takie same

        Operacje operacje = new Operacje();

        int wynik1 = operacje.zmniejsz(3,2);
        System.out.println(wynik1);
        int wynik2 = operacje.zwieksz(3,2);
        System.out.println(wynik2);
        boolean wynik3 = operacje.liczbaParzysta(3);
        System.out.println(wynik3);
        boolean wynik4 = operacje.liczbaUjemna(-3);
        System.out.println(wynik4);

    }
}
