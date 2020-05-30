package abstarakcja.figury;

public class Kwadrat extends Prostokat {

    public Kwadrat(String nazwa) {
        super(nazwa);// wywołanie konstruktora rodzica/dziadka
    }

    public Kwadrat(int a){
        this("Kwadrat");
        this.a = a;
        this.b = a;
    }

}
