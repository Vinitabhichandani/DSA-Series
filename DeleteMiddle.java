



import java.util.*;

class Solution{

    public ListNode deleteMiddle(ListNode head){


        ListNode hare = head;
        ListNode prev = null;
        ListNode turtle = head;



        while(hare != null && hare.next != null){

            hare = hare.next.next;
            prev = turtle;
            turtle = turtle.next;
        }

        prev.next = prev.next.next;
        return head;
    }
}
