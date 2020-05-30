package dzidziczenie.animals.plants;

public class Plant {
    String name;

    /**
     * Konstruktor tworzenia/rośnięcia rośliny
     *
     * @param name
     */
    public Plant(String name) {
        this();// wywołanie konstruktora bezargumentowego
        this.name = name;
    }

    /**
     * Konstruktor bezargumentowy
     */
    public Plant() {
        // getSimpleName() - pobiera nazwę klasy
        System.out.println("\n" + getClass().getSimpleName() + " rosnie...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}