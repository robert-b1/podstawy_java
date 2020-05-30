package dzidziczenie.animals.mammals;

import dzidziczenie.animals.interfaces.Prey;
import dzidziczenie.animals.interfaces.Vegetarian;
import dzidziczenie.animals.plants.Plant;

public class Squirrel extends Mammal implements Vegetarian, Prey {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getName(),plant.getName());
    }
}
