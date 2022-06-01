package practise;

public class IntagerNode {
    private IntagerNode Next = null;
    private int value = 0;


    public void setNext(IntagerNode next) {
        Next = next;
    }

    public IntagerNode getNext() {
        return Next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
