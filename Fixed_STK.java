package part1;

public class Fixed_STK implements Interface_STK {
    private int[] stack = new int[5];
    private int top;

    public Fixed_STK(int[] stack, int top){
        this.stack = stack;
        this.top = top;
    }
    public void push(int element) {
        if(isOverflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }
    public int pop() {
        if(isUnderflow()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int element = stack[top];
        top --;
        return element;
    }

    public void displayStack() {
        if(isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int x: stack) {
            System.out.println(x);
        }
    }

    public boolean isOverflow() {
        if(top == stack.length-1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isUnderflow() {
        if(top == -1) {
            return true;
        }
        return false;
    }
}
