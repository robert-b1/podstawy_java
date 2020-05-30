package dzidziczenie.animals.mammals;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Predator;

public class Fox extends Mammal implements Predator {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Fox
    }
}

