public class OddEvenLinkedList {

    public ListNode head;

    public ListNode oddEven(ListNode node){

        if(node == null || node.next ==null){
            return node;
        }

        ListNode oddNode = node;
        ListNode evenNode= node.next;
        ListNode temp = evenNode;
        while(evenNode != null && evenNode.next != null){

            oddNode.next = evenNode.next;
            oddNode = oddNode.next;

            evenNode.next = oddNode.next;
            evenNode = evenNode.next;

        }
        oddNode.next=temp;


        return node;
    }

    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode current = node;

        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev =current;
            current = next;
        }

        return prev;
    }

    public ListNode addAllCreateCycle(int... val){
        if(head == null)
            head = new ListNode(val[0]);
        ListNode current =head;
        ListNode cycle = null;
        for(int i=1;i<val.length;i++){
            if(i==3){
                cycle = current;
            }
            current.next = new ListNode(val[i]);
            current = current.next;
        }
        current.next = cycle;

        return head;
    }

    public boolean findCycle(ListNode node){

        ListNode slow = node;
        ListNode fast = node.next;
        while (fast != null || fast.next != null){
            if(slow == fast)
                return true;
            slow = slow.next;
            fast= fast.next.next;
        }


        return false;
    }

    public ListNode mergeList(ListNode node1,ListNode node2){
        ListNode n1 = node1;
        ListNode n2 = node2;

        while(n1.next != null || n2.next != null){

            if(n1.val >=n2.val){
              //  ListNode nextn1 = n1.next;
                ListNode nextn2=n2.next;
                n2.next = n1;
                n2=nextn2;

            }else{
                ListNode nextn1 = n1.next;
                n1.next = n2;
               n1= n2.next=nextn1;

            }

        }
        return node2;
    }



    public ListNode addAll(int... val){
        if(head == null)
            head = new ListNode(val[0]);
        ListNode current =head;
        for(int i=1;i<val.length;i++){
            current.next = new ListNode(val[i]);
            current = current.next;
        }

        return head;
    }

    public String toString(ListNode head){
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while(current.next != null){
            sb = sb.append(" -> "+current.val);
            current = current.next;
        }
        sb = sb.append(" -> "+current.val);

        return sb.toString();
    }




}

