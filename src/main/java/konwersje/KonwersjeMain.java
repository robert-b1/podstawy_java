package konwersje;

public class KonwersjeMain {
    public static void main(String[] args) {
        {
            int a = -5;
            double b = 13.5;
            double c = b / a;
            System.out.println(c);
        }
        {
            int a = 5;
            double b = 13.5;
            int c = (int) b / a;
            System.out.println(c);
        }
        {
            int a = -5;
            double b = 13.5;
            double c = b / (double) a;
            System.out.println(c);
        }
    }
}
