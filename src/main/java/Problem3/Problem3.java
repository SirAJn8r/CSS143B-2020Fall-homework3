package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print)
    {
        LinkedListStack<ListNode> stack = new LinkedListStack<>();
        ListNode pointer = list;
        while(pointer.next != null)
        {
            stack.push(pointer);
            pointer = pointer.next;
        }
        while(stack.peek() != null)
            print.println(stack.pop().toString());
    }
}
