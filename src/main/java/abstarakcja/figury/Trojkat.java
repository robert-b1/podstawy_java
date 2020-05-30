package abstarakcja.figury;

import abstarakcja.Figura;

public class Trojkat extends Figura {

    int a, b, c;

    public Trojkat(int a, int b, int c) {
        super("Trojkat rownoboczny");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int obliczPole() {
        return (a * b) / 2;
    }

    @Override
    public int obliczObwod() {
        return a + b + c;
    }

}

