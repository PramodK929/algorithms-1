package stack;
/**
 * @author #pramodkumar on 01/09/23
 * @project algorithms-1
 */
public class StackOfString {

    private int size;
    private int top = -1;
    private String[] stack;

    public StackOfString(int size) {
        this.size = size;
        this.top = -1;
        stack = new String[this.size];
    }

    public void push(String s) {
        if (top == size - 1) {
            System.out.println("Stack is Full!");
        } else {
            stack[++top] = s;
        }
    }

    public String pop() {
        if (top < 0) {
            System.out.println("Stack is EMPTY");
            return null;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        System.out.println("======================");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
        System.out.println("======================");
    }

}
