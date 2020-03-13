import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

@Test
    public  void testAddTwoNums(){

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    OddEvenLinkedList oe1 = new OddEvenLinkedList();
    ListNode l1 = oe1.addAll(1,2,9);
    OddEvenLinkedList oe2 = new OddEvenLinkedList();
    ListNode l2 = oe2.addAll(1,2,3,9,9);

    ListNode l3 = addTwoNumbers.addTwoNumbers(l1,l2);
    System.out.println(oe1.toString(l3));

}

}