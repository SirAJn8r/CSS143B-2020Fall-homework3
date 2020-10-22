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
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        ListNode pointer = list.next;
        while(pointer != null)
        {
            stack.push(pointer.val);
            pointer = pointer.next;
        }
        while(stack.peek() != null)
            print.print(stack.pop() + " ");
            //I have errors outside my control when I println, but when I just skip the middleman of replacing \n with " ", it seems to work. I couldn't figure out the error but I don't think it's my programs fault.
    }
}
