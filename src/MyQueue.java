public class MyQueue implements IMyCollection
{

    private int [] arr;
    int index;
    public MyQueue(int size)
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
        int temp = arr[0];
        int [] tempArr = new int [arr.length];
        for (int i = 1; i < arr.length; i++)
        {
            tempArr[i-1] = arr[i];
        }
        arr = tempArr;
        index--;
        return temp;
    }

    @Override
    public int peek() {
        return arr[0];
    }

    @Override
    public int getSize() {
        return index;
    }
}
