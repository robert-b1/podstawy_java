package anonymous;

public class MathApp { public static int obliczBonus(MathOperation algorytm, int paramert1, int parametr2){
    return algorytm.calculation(paramert1,parametr2);
}

    public static void main(String[] args) {
        //definiowanie obiektu klasy anonimowej implementującej interfejs
        MathOperation dodawanie= new MathOperation() {// z klasy anonimowej utwożyliśmy obiekt 'dodawanie'
            @Override
            public int calculation(int a, int b) {
                return a+b;
            }
        };
        MathOperation mnozenie = new MathOperation() {
            @Override
            public int calculation(int a, int b) {
                return a*b;
            }
        };
        System.out.println("wynik dodawania "+dodawanie.calculation(4,5));
        System.out.println("wynik mnożenia "+mnozenie.calculation(4,5));
        System.out.println("wynik dodawania "+obliczBonus(dodawanie, 5,7));
        System.out.println("wynik mnożenia "+obliczBonus(mnozenie, 6,8));

        MathOperation algorytmBonusu = mnozenie;

        System.out.println("wynik mnożenia "+obliczBonus(algorytmBonusu, 5, 7));
    }
}
