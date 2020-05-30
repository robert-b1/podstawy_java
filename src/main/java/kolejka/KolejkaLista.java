package kolejka;

public class KolejkaLista {
    private KolejkaElem first;
    private KolejkaElem last;

    public KolejkaLista() {
        first = last = null;
    }

    public void add(int value) {
        KolejkaElem elem = new KolejkaElem(value, null);
        if (first == null) {//jeżeli kolejka jest pusta to zrób 'elem' jaką pierwszy i ostatni
            last = first = elem;
        } else {//jeżeli w kolejce są już jakieś elementy
            this.last.setNext(elem);
            this.last = elem;
        }
    }
    public int poll(){
        if(first==null){//jeżeli kolejka jest pusta
            System.out.println("Nie możesz usunąć, bo kolejka jest pusta!");
            return -1;
        }
        if(first.getNext()==null){//jeżeli ZARAZ kolejka będzie pusta, czyli mamy ostatni element
            last=null;
        }
        int value=this.first.getValue();//twożymy na chwilę nową zmienną(robimy miejsce na to co pobierzemy żeby go usunać)i przekazujemy następcy że jest 'first'
        this.first=this.first.getNext();
        return value;
    }
    public int peek() {
        if (first == null) {
            System.out.println("Ej, kolejka pusta, nic ci nie zwórcę");
            return -1;
        }
        return first.getValue();
    }
    public boolean isEmpty(){//jeżeli nic nie ma w kolejce to first jest null
        return first==null;
    }
    //inaczej
//        if(first==null){//jeżeli nic nie ma w kolejce to first jest null
//            return true;
//        }else {
//            return false;
//        }
//    }
    public void print(){
        KolejkaElem tymczasowa=first;
        while (tymczasowa.getNext()!=null){
            System.out.println(tymczasowa.getValue()+" ");
            tymczasowa=tymczasowa.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        KolejkaLista kolejkaLista=new KolejkaLista();
        kolejkaLista.add(100);
        kolejkaLista.add(5);
        kolejkaLista.add(9);
        //kolejkaLista.print();

        System.out.println("poll:"+kolejkaLista.poll());
        System.out.println("poll:"+kolejkaLista.poll());
        System.out.println("peek:"+kolejkaLista.peek());
        System.out.println("poll:"+kolejkaLista.poll());
        kolejkaLista.print();
    }
}
