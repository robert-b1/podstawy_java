package dzidziczenie.animals.mammals;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Prey;
import dzidziczenie.animals.interfaces.Vegetarian;
import dzidziczenie.animals.plants.Plant;

public class Elephant extends Mammal implements Vegetarian, Prey {

    /**
     * Konstruktor tworzenia słonia
     * @param name imie słonia
     */
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        // kod opisujacy wykonanie metody przez Deer
    }

    @Override
    public void runAwayFrom(Animal animal) {

    }
}
