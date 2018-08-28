public class MyStack implements IMyCollection
{
    private int [] arr;
    int index;
    public MyStack(int size)
    {
        this.arr = new int[size];
        this.index = 0;
    }
    @Override
    public void push(int num)
    {
        if(index < arr.length)
        {
            arr [index] = num;
            index++;
        }
    }

    @Override
    public int pop()
    {
        index--;
        int temp = arr[index];
        return temp;
    }

    @Override
    public int peek() {
        return arr[index-1];
    }

    @Override
    public int getSize() {
        return index;
    }
}
