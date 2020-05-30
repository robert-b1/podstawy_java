package dzidziczenie.animals.interfaces;

import dzidziczenie.animals.Animal;

public interface Prey {

    /**
     * Metoda ucieczki od danego zwięrzęcia
     * @param animal zwierze od którego uciekamy
     */
    void runAwayFrom(Animal animal);
}
