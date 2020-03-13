import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddEvenLinkedListTest {

    @Test
    public  void testOddEven(){
        OddEvenLinkedList oe = new OddEvenLinkedList();
        oe.addAll(1,2,3,4,5,6,7,8,9,10);

        ListNode node = oe.oddEven(oe.addAll(1,2,3,4,5,6,7,8,9,10));
        System.out.println(oe.toString(node));
    }


    @Test
    public  void testreverse(){
        OddEvenLinkedList oe = new OddEvenLinkedList();
        oe.addAll(1,2,3,4,5,6,7,8,9,10);

        ListNode node = oe.reverseList(oe.addAll(1,2,3,4,5,6,7,8,9,10));
        System.out.println(oe.toString(node));
    }

    @Test
    public  void testcycle(){
        OddEvenLinkedList oe = new OddEvenLinkedList();
        oe.addAll(1,2,3,4,5,6,7,8,9,10);

        ListNode node = (oe.addAllCreateCycle(1,2,3,4,5,6,7,8,9,10));
        //System.out.println(oe.toString(node));
        assertEquals(true,oe.findCycle(node));

    }

    @Test
    public  void testMerge(){
        OddEvenLinkedList oe = new OddEvenLinkedList();
       ListNode n1 =  oe.addAll(1,2,4);
        OddEvenLinkedList oe1 = new OddEvenLinkedList();
        ListNode n2 = oe1.addAll(1,3,4);

        ListNode node = (oe.mergeList(n1,n2));
        System.out.println(oe.toString(node));
    //    assertEquals(true,oe.findCycle(node));

    }



}