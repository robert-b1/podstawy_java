package inner;

public class CarApp {
    public static void main(String[] args) {
        Car maluch = new Car(25);
        System.out.println("moc silnika "+maluch.getPower());
        System.out.println("promień koła "+maluch.wheel.getDiameter());
        //tworzenie obiektu klasy wewnętrznej niestatycznej tylko na podstawie instancji klasy zewnetrznej
        //klasa zewnętrzna: Car
        //klasa wewnętrzna publiczna :Wheel
        Car.Wheel wheel= maluch.new Wheel(6);
    }
}
