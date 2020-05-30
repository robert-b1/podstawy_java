package dzidziczenie.animals.mammals;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.interfaces.Predator;

public class Lion extends Mammal implements Predator {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal)
    {
        if (animal.isEscape())//zwierze ucieka
        {
            // pierwsze %s oznacza this.getName
            // drugie %s oznacza animal którego zjadamy
            System.out.printf("\n%s: %s uciekłeś mi :(",this.getName(),animal.getName());
        }
        else
        {
            System.out.printf("\n%s: %s złapałem Cię i zjadłem",this.getName(),animal.getName());
        }

        // kod opisujacy wykonanie metody przez Lion
    }
}

