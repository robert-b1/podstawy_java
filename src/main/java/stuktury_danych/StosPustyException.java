package stuktury_danych;

public class StosPustyException extends Exception {
    public StosPustyException(){
        super("Stos jest pusty! Nie wolno wykonać tej operacji");//super wywołuje metodę klasy nadrzędnej "Exception"
    }
}
