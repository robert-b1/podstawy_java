package stuktury_danych;

import java.util.Scanner;

public class StosLista {
    private StosElem top;

    public StosLista() {
        top = null;
    }

    public void push(int value) {
        top = new StosElem(value, top);
        //inaczej:
        //StosElem elem=new StosElem(value,top)
        //top=elem;
    }

    public int peek() {
        return top.getValue();
    }

    public int pop() throws StosPustyException {
        if(isEmpty()){
           throw  new StosPustyException();
        }
        int value = top.getValue();
        top = top.getPrev();
        return value;
    }

    public boolean isEmpty() {
        return top == null;
        //inaczej
//        if(top==null){
//            return true;
//        }else {
//            return false;
//        }

    }

    public void print() {
        StosElem tmp = top;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getPrev();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StosLista stos = new StosLista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0-wyjście z programu, 1-push, 2-pop, 3-peek, 4-isEmpty");
            int numer = scanner.nextInt();

            switch (numer) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj wartość:");
                    int wartosc = scanner.nextInt();
                    stos.push(wartosc);
                    break;
                case 2:
                    try {
                        int element = stos.pop();
                        System.out.println("Pop: " + element);
                    } catch (StosPustyException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("Peek: " + stos.peek());
                    break;
                case 4:
                    System.out.println("isEmpty: " + stos.isEmpty());
                    break;
                default:
                    System.out.println("Niepoprawna wartość");
                    break;
            }
            stos.print();
        }
    }
}
