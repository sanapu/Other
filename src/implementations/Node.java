package implementations;

public class Node {
    Node leftNode;
    Node rightNode;
    int val;
    Node(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", val=" + val +
                '}';
    }
}
