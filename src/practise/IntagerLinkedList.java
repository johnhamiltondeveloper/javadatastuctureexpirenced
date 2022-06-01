package practise;

public class IntagerLinkedList {

    private IntagerNode Head = null;
    private int size = 0;

    public void add(int value) {
        if(Head == null) {
            Head = new IntagerNode();
            Head.setValue(value);
        }
        else {
            IntagerNode Temp = Head;
            Head = new IntagerNode();
            Head.setValue(value);
            Head.setNext(Temp);
        }

        size++;
    }

    public void remove(int index) {
        int CurrentNodeIndex = 0;
        IntagerNode LastNode = null;
        IntagerNode CurrentNode = Head;
        for (int i = 0; i < index; i++) {
            LastNode = CurrentNode;
            CurrentNode = CurrentNode.getNext();

        }

        LastNode.setNext(CurrentNode.getNext());

        size--;
    }

    public void printList() {
        System.out.println("Items In linked list");

        IntagerNode next = Head;
        while (next !=  null) {
            System.out.println(next.getValue());
            next = next.getNext();
        }
    }

    public int size() {
        return size;
    }

}
