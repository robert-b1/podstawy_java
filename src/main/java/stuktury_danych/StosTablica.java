package stuktury_danych;

public class StosTablica {
    private int[]tab;
    private int top;

    public StosTablica(int rozmiar){
        tab =new int[rozmiar];//utworzenie tablicy o danym rozmiarze
        top = -1;
    }
    public void push(int value){//dokładanie do stosu
        if(isFull()){
            System.out.println("stos jest pełen");
            return;
        }
        tab[++top]=value;
        //inaczej
//        top++;
//        tab[top]=value;
    }
    public int peek(){//odczytuje informacje ale nie kasuje nic na stosie
        if(isEmpty()){
            System.out.println("stos jest pusty nie zrobisz peeka");
            return Integer.MIN_VALUE;
        }
        return tab[top];
    }
    public int pop(){//pobiera pierwszego z góry i kasuje go ze stosu
        if(isEmpty()){
        System.out.println("stos jest pusty nie zrobisz popa");
        return Integer.MIN_VALUE;
    }
        return tab[top--];
//        inacze
//        int valute=tab[top];
//        top--;
//        return valute;
    }
    public boolean isEmpty(){
        return top==-1;
        //inaczej:
       /* if(top==-1){
            return true;
        }else {
            return false;
        }*/
    }
    public boolean isFull(){
        return top==tab.length-1;
    }

    public static void main(String[] args) {
        StosTablica stos=new StosTablica(10);

        stos.push(5);
        stos.push(2);
        stos.push(1);

        System.out.println("peek"+stos.peek());
        System.out.println("pop"+stos.pop());
        System.out.println("peek"+stos.peek());
    }
}
