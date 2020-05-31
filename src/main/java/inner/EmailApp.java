package inner;

public class EmailApp {
    public static void main(String[] args) {
        //klasa wewnętrzna statyczna jest niezależna od klasy zewnętrznej
        //możemy tworzyć obiekty tej Address bez instancji klasy Email
        Email.Address address=new Email.Address("ala","op.pl");
        Email email = new Email("Hell",address );
        System.out.println(email.getAddress());

    }
}
