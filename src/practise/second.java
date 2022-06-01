package practise;

public class second {
    public static void main(String[] args) {
        IntagerLinkedList MyList = new IntagerLinkedList();

        MyList.add(10);
        MyList.add(20);
        MyList.add(30);

        MyList.printList();

        MyList.remove(1);

        MyList.printList();

    }
}
