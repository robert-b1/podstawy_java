package dzidziczenie.animals.birds;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Predator;

public class Eagle extends Bird implements Predator {

    /**
     * Konstruktor tworzenia/rodzenia orła
     * @param name argument, czyli imie orła
     */
    public Eagle(String name) {
        // super - konstruktor który pochodzi z extends Bird
        super(name);
    }


    @Override
    public void eat(Animal animal) {
        System.out.printf("\n'%s' została zjedzona przez '%s'",animal.getName(),this.getName());
        // kod opisujacy wykonanie metody przez Eagle
    }
}

