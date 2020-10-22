package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print)
    {
        if(list.next == null)
            return;
        LinkedListStack<ListNode> stack = new LinkedListStack<>();
        ListNode pointer = list.next;
        while(pointer != null)
        {
            stack.push(pointer);
            pointer = pointer.next;
        }
        while(stack.peek() != null)
            print.print(stack.pop().val + " ");
    }
}
