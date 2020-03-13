public class LinkedList<T>
{
    protected Node root = null;
    protected Node last = null;
    protected int size = 0;

    public T get(int index)
    {
        Node requestedNode = getNode(index);

        if(requestedNode != null)
            return requestedNode.data;
        else
            return null;
    }

    public T addFront(T item)
    {
        if(root == null)
            root = last = new Node(item);
        else
        {
            root = new Node(item, root);


//            Node oldRoot = root;
//            root = new Node(item);
//            root.next = oldRoot;
        }

        size++;
        return root.data;
    }

    public void append(T item)
    {
        if(last == null)
            root = last = new Node(item);
        else
            last.next = new Node(item);

        size++;
    }

    public void insert(T item, int index)
    {
        if(index < 0 || index >= size)
            return;

        if(index == 0)
            addFront(item);
        else if(index == (size - 1))
            append(item);
        else
        {
            Node previousNode = getNode(index - 1);
            previousNode.next = new Node(item, previousNode.next);
            size++;
        }
    }

    public boolean contains(T item)
    {
        Node currentNode = this.root;

        while(currentNode != null)
            if(currentNode.data.equals(item))
                return true;

        return false;
    }

    public T remove(int index)
    {
        T data = null ;
        //TODONE: WRITE ME
        if(index == 0){
            data = this.root.data;
            this.root = null;
        }else if(index == 1) {

             data = this.root.next.data;
            this.root.next =null;
        }else if(index == size-1) {
            Node node = this.root;
            int i =0;
            while(i < index-1){
                node = node.next;
                i++;
            }
            data = node.next.data;
            node.next=null;

        }else{
                Node node = this.root;
                for (int i = 0; i < index-1 && node.next != null; i++) {
                    node = node.next;
                }
                data = node.next.next.data;
                Node nextNode = node.next.next;
                node.next = nextNode;

        }
        size--;
        return data;
    }

    public T removeFront()
    {
        return remove(0);
    }

    public T removeLast()
    {
        return remove(this.size - 1);
    }

    public T peek()
    {
        if(root != null)
            return root.data;
        else
            return null;
    }

    public int size()
    {
        return this.size;
    }

    public void addAll(T ... vals)
    {
        last = root = new Node(vals[0]);

        for (int index = 1; index < vals.length; index++)
            last = last.next = new Node(vals[index]);
    }

    private Node getNode(int index)
    {
        Node currentNode = this.root;

        for(int currentIndex = 0; currentNode != null && currentIndex < index; currentIndex++)
            currentNode = currentNode.next;

        return currentNode;
    }

    private class Node
    {
        public Node next = null;
        public T data = null;

        public Node()
        {

        }

        public Node(T data)
        {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.next = next;
            this.data = data;
        }


    }




//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.addAll(1, 2, 3, 4, 5, 6, 7, 8, 9);
//    }

}
