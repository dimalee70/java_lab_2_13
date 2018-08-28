public class Main2
{
    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(5);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);//The stack is full
        System.out.println(myStack.peek());//3
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.peek());//2
        System.out.println(myStack.getSize());

        MyQueue myQueue= new MyQueue(2);
        myQueue.push(5);
        myQueue.push(2);
        myQueue.push(3);//The queue is full
        System.out.println( myQueue.peek());//5
        myQueue.pop();
        System.out.println(myQueue.peek());//2
        System.out.println(myQueue.getSize());//1

    }
}
