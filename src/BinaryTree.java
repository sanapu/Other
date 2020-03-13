public class BinaryTree
{
    protected Node root = null;
    protected int size = 0;

    public void insert(int value)
    {
        if(root == null)
            root = new Node(value);
        else
            recursivelyInsert(root, value);
    }

    protected void recursivelyInsert(Node node, int value)
    {
        if(value < node.data)
        {
            if(node.left == null)
                node.left = new Node(value);
            else
                recursivelyInsert(node.left, value);
        }
        else if(value > node.data)
        {
            if(node.right == null)
                node.right = new Node(value);
            else
                recursivelyInsert(node.right, value);
        }
        else
            return;

    }


    protected class Node
    {
        public Node left = null;
        public Node right = null;
        public int data;

        public Node() {
        }

        public Node(int data)
        {
            this.data = data;
        }

        public Node(Node left, Node right, int data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
}
