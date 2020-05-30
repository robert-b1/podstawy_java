package dzidziczenie.animals.mammals;

import dzidziczenie.animals.interfaces.Prey;
import dzidziczenie.animals.interfaces.Vegetarian;
import dzidziczenie.animals.plants.Plant;

public class Deer extends Mammal implements Vegetarian, Prey {

    /**
     * Konstuktor tworzy/rodzi jelonka
     *
     * @param name imię jelonka
     */
    public Deer(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je %s", this.getName(), plant.getName().toLowerCase());
        // kod opisujacy wykonanie metody przez Deer
    }

}