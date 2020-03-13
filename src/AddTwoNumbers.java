public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode result=null;
        ListNode current1 = l1;
        ListNode current2 = l2;

        int carryForward=0;
        int sum=0;
            while(current1 != null & current2 != null){
                sum = carryForward + (current1.val+current2.val);
               result = addNode(result,sum%10);
                if(sum>10){
                    carryForward = sum/10;
                }else {
                    carryForward = 0;
                }
                current1 = current1.next;
                current2= current2.next;
        }
        if(current1 != null ){
            result = restNode(current1,result,carryForward);
        }
        if(current2 != null ){
            result = restNode(current2,result,carryForward);
        }
        return result;
    }

    public ListNode restNode(ListNode l1, ListNode result, int carryForward){
        int sum =0;
        ListNode current1 = l1;
        while(current1 != null) {
            sum = carryForward + (current1.val);
            result = addNode(result, sum % 10);
            if (sum >= 10) {
                carryForward = sum / 10;
            } else {
                carryForward = 0;
            }
            current1 = current1.next;
        }
        if(carryForward != 0){
            result = addNode(result, carryForward);
        }
        return result;
    }


    public static ListNode addNode(ListNode l,int val){
        if(l== null){
            l = new ListNode(val);
        }else{
            ListNode current = l;
            while(current.next != null){
                current = current.next;
            }
            current.next = new ListNode(val);
        }
        return l;
    }
}
