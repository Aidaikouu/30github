class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Стек полон");
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return -1;
        }
        return stack[top];
    }
}

public class challange5 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Удалён элемент: " + stack.pop());
        System.out.println("Верхний элемент: " + stack.peek());
    }
}
