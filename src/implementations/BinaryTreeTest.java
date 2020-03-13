package implementations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insert() {

        BinaryTree bt = new BinaryTree();
        bt.insert(23);
        bt.insert(33);
        bt.insert(13);
        bt.insert(53);
        bt.insert(73);
        bt.insert(3);
        bt.insert(10);
        bt.insert(5);
        System.out.println(bt);
        System.out.println("searchInOrder");
        bt.searchInOrder();
        System.out.println(bt);
        System.out.println("searchPostOrder");
        bt.searchPostOrder();
        System.out.println(bt);
        System.out.println("searchPreOrder");
        bt.searchPreOrder();
        System.out.println(bt);
    }
}