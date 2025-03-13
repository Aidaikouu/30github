import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private LinkedList<Integer> stackList = new LinkedList<>();

    public void push(int data) {
        stackList.addFirst(data);
    }
