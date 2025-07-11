 public class Solution {
    public ListNode SortBinaryLinkedList(ListNode head) {  // interview Bit
        
        
        int zero = 0;
        int one = 0;
        
         
         ListNode curr = head;
        while(curr != null){
            
            if(curr.val == 0){
                
                zero++;
            }else{
                
                one++;
            }
            curr = curr.next;
        }
        
        curr = head;
        
        
        while(zero > 0){
            curr.val = 0;
            curr = curr.next;
            zero--; // head = head.next agan jay pachi tame 1 ave tyare zero -- karo ke 0 muki kadyo che
            
        }
        
        while(one > 0){
            curr.val = 1;
            curr = curr.next; // move forward karo update thayo
            one--; // one put karya pachi decrese karo
        }
        return head;
    }    
}

