public class Queue<T>
{
    LinkedList<T> data = new LinkedList<>();

    //enqueue, dequeue

    public void enqueue(T item)
    {
        data.append(item);
    }

    public T dequeue(T item)
    {
        return data.removeFront();
    }
}
