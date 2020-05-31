package generic_typyGeneryczne;

public class BinaryMathOperationApp {
    //metoda parametryczna
    public static <T extends Number> T obliczBonus(BinaryMathOperation<T> algorytm,T parametr1, T parametr2 ){
        return algorytm.apply(parametr1, parametr2);
    }

    public static void main(String[] args) {
        BinaryMathOperation<Double> dodawanie=new BinaryMathOperation<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a+b;
            }
        };
        BinaryMathOperation<Integer> mnozenie=new BinaryMathOperation<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a*b;
            }
        };
        System.out.println("wynik mnożenia "+mnozenie.apply(4,5));
        System.out.println("wynik dodawania "+dodawanie.apply(4.5,5.5));
    }
}
