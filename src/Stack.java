public class Stack<T>  {
    protected LinkedList<T> data = new LinkedList<>();

    //pop, //peek, push, getSize, contains, clear
    public Stack()
    {

    }

    public T pop()
    {
        return data.removeFront();
    }

    public T peek()
    {
        return data.peek();
    }

    public T push(T item)
    {
        return data.addFront(item);
    }

    public int getSize()
    {
        return data.size();
    }

    public boolean contains(T item)
    {
        return data.contains(item);
    }

    public void clear()
    {
        while(data.size() != 0)
            data.removeFront();
    }
}
