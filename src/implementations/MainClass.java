package implementations;

public class MainClass {

    Node rootNode ;
     MainClass (int val){
         rootNode = new Node(val);
    }
    MainClass(){

    }


        public static void main(String[] args) {
            MainClass mc = new MainClass();
            mc.rootNode = new Node(4);
            mc.rootNode.leftNode = new Node(3);
            mc.rootNode.rightNode = new Node(5);
            mc.rootNode.rightNode.rightNode = new Node(7);
            mc.rootNode.rightNode.leftNode = new Node(6);
            mc.rootNode.leftNode.rightNode = new Node(4);
            mc.rootNode.leftNode.leftNode = new Node(2);

            System.out.println(mc.toString());
    }

    @Override
    public String toString() {
        return "MainClass{" +
                "rootNode=" + rootNode +
                '}';
    }
}
