import java.util.*;
class swapNodes{

    public ListNode swapNodes(ListNode head, int k){

        if(head == null || head.next == null){
            return head;
        }

        // 1, 2, 3, 4, 5, Question
        // 1, 4, 3, 2, 5 ans this swap the Node 2<->4 and the  
        
        //1) find first the kNode  
        //2)  find end KthNode
        // 3) swapNode


        ListNode curr = head;
        int length = 0; // length is the starting when the curr is store the head

        while(curr != null){
            curr = curr.next;
            length++;
        }

        // find the kth Node
         ListNode first = head;
        for(int i=1; i<k; i++){

            first = first.next;
        }

        // find the kth end Node

        ListNode second = head;
        for(int i=1; i<length-k+1){
            second = second.next;
        }


        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;

    }
}
