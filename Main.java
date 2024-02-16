package part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("FIXED STACK:\n");
        System.out.println("Enter the length of fixed stack: ");
        int size = s.nextInt();
        int[] stack_fix = new int[size];
        int top = -1;
        Fixed_STK fixed_stk = new Fixed_STK(stack_fix, top);
        for(int i=0; i<stack_fix.length; i++) {
            System.out.print("Enter element to be pushed: ");
            int element = s.nextInt();
            fixed_stk.push(element);
        }
        fixed_stk.displayStack();
        int popped_element = fixed_stk.pop();
        System.out.print("Popped element: " + popped_element);

        System.out.println("\n\nGROWABLE STACK:\n");
        System.out.println("Enter the length of growable stack: ");
        int size1 = s.nextInt();
        ArrayList<Integer> stack_grow = new ArrayList<Integer>();
        Growable_STK growable_stk = new Growable_STK(stack_grow, top);
        for(int i=0; i<size1; i++) {
            System.out.print("Enter element to be pushed: ");
            int element = s.nextInt();
            growable_stk.push(element);
        }
        growable_stk.displayStack();
        popped_element = growable_stk.pop();
        System.out.print("\nPopped element: " + popped_element);
    }
}
