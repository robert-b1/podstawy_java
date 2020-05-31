package inner;

public class Email {
    private String message;
    public Address address;
    private static final String MALPA = "@";

    public Email(String message, Address address) {
        this.message = message;
        this.address = address;
    }

    //klasa zewnętrzna ma dostęp do wszystkich pól klasy wewnętrznej statycznej dlatego możemy
    //wywołać metodę prywatną getAddress() z klasy Address
    public String getAddress() {
        return address.getAddress();
    }

    public static class Address {
        private String name;
        private String host;

        public Address(String name, String host) {
            this.name = name;
            this.host = host;
        }

        private String getAddress() {
            //klasa wewnętrza ma dostęp do wszystkich pól klasy zewnętrznej ale tylko statycznych
            return name + MALPA + host;
        }
    }
}
