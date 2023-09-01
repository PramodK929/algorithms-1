package stack;
/**
 * @author #pramodkumar on 01/09/23
 * @project algorithms-1
 */
public class Stack {

    private Node first = null;
    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
