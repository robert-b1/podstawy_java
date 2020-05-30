package dzidziczenie.animals;

public class Animal {
    private String name;
    private boolean escape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Konstruktor tworzenia zwierzęcia
     *
     * @param name
     */
    public Animal(String name) {

        this.name = name;
        this.escape = false;// na początku w konstruktorze ustawiamy
        // ze zwierze nie ucieka
        System.out.printf("\n%s urodził się", this.getName());
    }

    public boolean isEscape() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    /**
     * Metoda implementująca ucieczkę od zwierzęcia
     * @param animal
     */
    public void runAwayFrom(Animal animal) {
        System.out.printf("\n%s uciekł przed %s", this.getName(), animal.getName());
        this.setEscape(true);//zaznaczenie że udało się uciec
        // informacja zapisana w polu logicznym
    }
}

