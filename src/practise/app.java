package practise;

public class app {

    public static void main(String[] args) {
        IntagerLinkedList MyList = new IntagerLinkedList();

        for (int i = 0; i < 10; i++) {
            MyList.add(i+1);
        }

        MyList.remove((MyList.size()/2));

        MyList.printList();





    }

}
