package dzidziczenie.animals.snakes;

import dzidziczenie.animals.Animal;
import dzidziczenie.animals.mammals.Elephant;

public class Boa extends Snake {

    /**
     * Konstruktor
     * @param name
     */
    public Boa(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Deer
    }

    // metoda duszenia strangle(Animal animal)
    // nie może udusić słonia!

    /**
     * Metoda duszenia zwierząt
     * @param animal
     */
    public void strangle(Animal animal){

        if(animal instanceof Elephant){// instanceof - jest instancją(typem) Elephant(słonia)
            System.out.printf("\n\"%s\" nie da rady udusić \"%s\"",this.getName(),animal.getName());
        }else{
            System.out.printf("\n\"%s\" dusi \"%s\"",this.getName(),animal.getName());
        }
    }
}
