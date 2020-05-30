package dzidziczenie;

import dzidziczenie.animals.birds.Eagle;
import dzidziczenie.animals.mammals.Deer;
import dzidziczenie.animals.mammals.Elephant;
import dzidziczenie.animals.mammals.Lion;
import dzidziczenie.animals.mammals.Squirrel;
import dzidziczenie.animals.plants.Grass;
import dzidziczenie.animals.plants.Sunflower;
import dzidziczenie.animals.snakes.Boa;

public class AnimalsMain {

    public static void main(String[] args) {
        /**
         * Zadanie: Utworz odpowiednie zwierzaki
         *
         * Classes:
         * Deer, - Mammal, Vegenarian
         * Squirrel, - Mammal, Vegenarian, Prey
         * Elephant, - Mammal, Vegenarian
         * Fox, - Mammal, Predator
         * Whale, - Mammal, Predator
         * Snake, - Animal, Predator
         * Eagle, - Bird, Predator
         * Stork, - Bird, Predator
         * Lion, - Mammal, Predator
         * Sunflower, - Plant
         * Grass, - Plant
         *
         * Interfaces:
         * Vegenarian, - methods: eat(Plant plant)
         * Predator, - methods: eat(Animal animal)
         * Prey, - methods: runAwayFrom(Animal animal)
         *
         * Extends classes:
         * Bird, - Animal
         * Animal,
         * Mammal, - Animal
         * Plant
         */

        /**
         * Ważne!!!
         * - Interfejsy nie posiadają ciał metod !
         * - W klasach implementujemy metody z interfejsów
         *
         */

        /**
         * Zadanie1: Stwórz wiewiórkę nazwij ją Pinky
         * Utwórz konstrukor ustawiający pole name;
         *
         * Uwaga. Konstruktor powinien być utworzony w klasie Animal
         * i będzie dostępny we wszystkich klasa które rozszerzają
         * klase Animal
         */
        printStage();
        Squirrel pinky = new Squirrel("Pinky");


        /**
         * Zadanie2: Utworz obiekt Eagle. Wykonaj metodę eat()
         * argumentem będzie wiewiórka z Zadania1.
         * Implementacja będzie wyglądać następująco
         * na konsolę program wypisze:
         *
         * 'imieWiewiorki' została zjedzona przez 'imieOrła'
         */
        printStage();
        Eagle baldEagle = new Eagle("Bald Eagle");
        baldEagle.eat(pinky);// orzeł zjada pinky

        /**
         * Zadanie3:Utworz obiekt Lion i Elephant.
         * Elephant ucieka.
         * Lion chce to zjeść.
         */
        printStage();
        Lion kingLion = new Lion("King Lion");
        Elephant dumboElephant = new Elephant("Dumbo");
        dumboElephant.runAwayFrom(kingLion);
        kingLion.eat(dumboElephant);

        /**
         * Zadanie4:Utworz jelonek 'Bambi'.
         * jelonek je trawe. Wystraszył się i ucieka.
         * Lew uciekł z ZOO i chce zjeść jelonka.
         *
         */
        printStage();
        Deer bambiDeer = new Deer ("Bambi");
        Grass grass = new Grass("Trawa");
        bambiDeer.eat(grass);

        bambiDeer.runAwayFrom(kingLion);
        kingLion.eat(bambiDeer);

        /**
         * Zadanie5: Boa 'Kaa' próbuje udusić jelonka. Udaje mu się. :(
         * Potem próbuje udusić słonia i ma problem.
         *
         */
        printStage();
        Boa kaaBoa = new Boa("Kaa");
        kaaBoa.strangle(bambiDeer);
        kaaBoa.strangle(dumboElephant);


        /**
         * Zadanie 6: Wiewiórka 'Benny"zjada słonecznik. Po chwili wąż zaczyna dusić wiewiórkę
         */
        printStage();
        Sunflower sunflower = new Sunflower();
        Squirrel benny = new Squirrel("Benny");
        benny.eat(sunflower);
        kaaBoa.strangle(benny);
    }

    private static int stage = 1;

    public static void printStage(){
        System.out.println("\n\n>>> Rozdział "+stage+". ===========================");
        stage++;
    }
}
