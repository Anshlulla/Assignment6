package part1;

import java.util.ArrayList;

public class Growable_STK implements Interface_STK {
    ArrayList<Integer> stack;
    int top;

    public Growable_STK(ArrayList<Integer> stack, int top) {
        this.stack = stack;
        this.top = top;
    }

    public boolean isUnderflow() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public boolean isOverflow() {
        System.out.println("Overflow condition not applicable for Growable Stack");
        return false;
    }

    public void push(int element) {
        stack.add(++top, element);
    }

    public int pop() {
        if(isUnderflow()) {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        int element = stack.get(top);
        stack.remove(top);
        top--;
        return element;
    }

    public void displayStack() {
        for(int x: stack) {
            System.out.print(x + "\t");
        }
    }
}
