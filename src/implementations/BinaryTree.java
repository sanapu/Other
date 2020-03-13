package implementations;

public class BinaryTree {
    public Node rootNode;

    public void insert(int val){
        if(rootNode == null){
            rootNode = new Node(val);
        }else{
            Node curr = rootNode;
            recursivelyInsert(curr,val);
        }
    }

    private void recursivelyInsert(Node node, int val) {

            if (val < node.val) {
                if (node.leftNode != null)
                    recursivelyInsert(node.leftNode, val);
                else
                    node.leftNode = new Node(val);
            } else {
                if (node.rightNode != null)
                    recursivelyInsert(node.rightNode, val);
                else
                    node.rightNode = new Node(val);
            }

    }

    public void depthFirst(){
        if(rootNode == null){
           return;
        }else{
            Node curr = rootNode;
            recursivedeptFirst(curr);
        }
    }

    private void recursivedeptFirst(Node node) {
        if(node == null){
            return;
        }
        recursivedeptFirst(node.leftNode);
        System.out.println(" val : "+node.val);
        recursivedeptFirst(node.rightNode);
    }


    public void breathFirst(){
        if(rootNode == null){
            return;
        }else{
            Node curr = rootNode;
            recursivedeptFirst(curr);
        }
    }

    private void recursivebreathFirst(Node node) {
        if(node == null){
            return;
        }
        System.out.println(" val : "+node.val);
        recursivedeptFirst(node.leftNode);
        recursivedeptFirst(node.rightNode);
    }


    public void searchInOrder(){
        if(rootNode == null){
            return;
        }else{
            Node curr = rootNode;
            recursiveInOrder(curr);
        }
    }
    private void recursiveInOrder(Node node){
        if(node == null){
            return;
        }

       // if(node.leftNode!=null){
            recursiveInOrder(node.leftNode);
       // }
            System.out.println(node.val);

            recursiveInOrder(node.rightNode);
    }

    public void searchPreOrder(){
        if(rootNode == null){
            return;
        }else{
            Node curr = rootNode;
            recursivePreOrder(curr);
        }
    }
    private void recursivePreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val);

        // if(node.leftNode!=null){
        recursivePreOrder(node.leftNode);

        recursivePreOrder(node.rightNode);
    }


    public void searchPostOrder(){
        if(rootNode == null){
            return;
        }else{
            Node curr = rootNode;
            recursivePostOrder(curr);
        }
    }
    private void recursivePostOrder(Node node){

//        if(node.leftNode == null && node.rightNode==null){
//            System.out.println(node.val);
//            return;
//        }
        if(node == null){
            return;
        }


        // if(node.leftNode!=null){
        recursivePostOrder(node.leftNode);
        System.out.println(node.val);
        recursivePostOrder(node.rightNode);
        System.out.println(node.val);
    }



    public void delete(){

    }
}
