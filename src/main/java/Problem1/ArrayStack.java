package Problem1;

public class ArrayStack<T> implements Stack<T> {
    private T[] data;
    private int size;

    private ArrayStack() {  }

    public ArrayStack(int capacity)
    {
        this.data = (T[])new Object[capacity];
        this.size = 0;
    }

    @Override
    public boolean push(T val)
    {
        if(this.size >= this.data.length)
            return false;
        this.data[this.size++] = val;
        return true;
    }

    @Override
    public T pop()
    {
        return this.data[(this.size--) -1];
    }

    @Override
    public T peek()
    {
        return this.data[this.size-1];
    }

    @Override
    public int size()
    {
        return this.size;
    }
}
