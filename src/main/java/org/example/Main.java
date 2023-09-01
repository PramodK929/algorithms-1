package org.example;

import stack.Stack;
import stack.StackOfString;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("pramod");
        stack.push("praveen");
        stack.push("pradeep");

        try {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
        } catch(Exception e) {
            System.out.println("Stack is empty!!! "+ e.getMessage());
        }

//        if(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

//        StackOfString stack = new StackOfString(3);
//        stack.pop();
//        stack.push("praveen");
//        stack.push("pramod");
//        stack.push("pradeep");
//        stack.display();
//        stack.pop();
//        stack.display();
//        stack.push("pradeep2");
//        stack.push("pradeep3");
//        stack.push("pradeep4");
//        stack.display();
    }
}