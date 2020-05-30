package dzidziczenie.animals.birds;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Predator;

public class Stork extends Bird implements Predator {

    public Stork(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Stork
    }
}

