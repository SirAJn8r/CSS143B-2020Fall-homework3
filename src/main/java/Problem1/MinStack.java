package Problem1;

public class MinStack extends ArrayStack<Integer>
{
    private int[] data;
    private int size;
    private int minIndex;

    public MinStack(int size)
    {
        super(size);
        this.data = new int[size];
        this.size = 0;
    }

    @Override
    public boolean push(Integer val)
    {
        if(this.size >= this.data.length)
            return false;
        if(this.size == 0 || val < this.data[this.minIndex])
            this.minIndex = size;
        this.data[this.size] = val;
        this.size = this.size < this.data.length ? size + 1 : size;

        return true;
    }

    @Override
    public Integer pop()
    {
        //I can't think of any way to do with without a loop, cause the minimum value might be popped off
        if(this.size-1 == this.minIndex)
        {
            int minI = 0;
            for(int i = 0; i < size-1; i++)
            {
                if(this.data[minI] > this.data[i])
                    minI = i;
            }
            this.minIndex = minI;
        }
        return this.data[(this.size--) -1];
    }

    public Integer getMin()
    {
        if(this.size == 0)
            return null;
        return this.data[minIndex];
    }
}

