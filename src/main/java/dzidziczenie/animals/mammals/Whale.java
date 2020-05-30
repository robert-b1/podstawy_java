package dzidziczenie.animals.mammals;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Predator;

public class Whale extends Mammal implements Predator {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Whale
    }
}
