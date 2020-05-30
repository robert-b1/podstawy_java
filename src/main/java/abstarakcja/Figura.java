package abstarakcja;

/**
 * Klasa abstrakcyjna posiada metody abstrakcyjne
 * które nie posiadają ciał metod
 */
public abstract class Figura {

    protected String nazwa;

    public Figura(String nazwa){
        // this - oznacze miejsce w którym jesteśmy
        // w tym przypadku tą klasę
        this.nazwa = nazwa;
    }

    /**
     * Metoda abstrakcyjna, ciało tej metody
     * będzie implementowana w klasie rozszerzajacej
     *
     * @return pole figury
     */
    public abstract int obliczPole();

    public abstract int obliczObwod();

    public String toString(){
        return nazwa +"\t | pole:"+ obliczPole();
    }
}