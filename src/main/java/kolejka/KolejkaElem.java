package kolejka;

public class KolejkaElem {
    private int value;
    private KolejkaElem next;

    public KolejkaElem(int value, KolejkaElem next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setKolejkaElem(KolejkaElem kolejkaElem) {
        this.next = kolejkaElem;
    }
}

