package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> data;

    public LinkedListStack()
    {
        this.data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val)
    {
        this.data.addLast(val);
        return true;
    }

    @Override
    public T pop()
    {
        if(this.data.peek() == null)
            return null;
        return this.data.removeLast();
    }

    @Override
    public T peek()
    {
        if(this.data.peek() == null)
            return null;
        return this.data.getLast();
    }

    @Override
    public int size() {
        return data.size();
    }
}
