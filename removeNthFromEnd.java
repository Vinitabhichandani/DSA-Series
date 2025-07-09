import java.util.*;
class removeNthFromeEnd{

    public ListNode removeNthFromEnd(ListNode head, int n){


        if(head == null || head.next == null){ // if the head == null means Empty and head.next == null means 1 delete return null
                   return null;
        }


        // size
           int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr= curr.next;
            size++;
        }

        if(size == n){  // means  travel the 1 to n  rech and delete to  head so     return head.next 
            return head.next;  
        }


        // if i want to delete 

        //prev

        int IdexToSearch = size-n;
        ListNode prev = head;
        int i = 1; // basically i is tracking to the prev Node times
        while(i<IndexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }
}





