 
public class Solution {
    public ListNode sortList(ListNode head) {
        
        
          if(head == null || head.next == null){
              return head;
          }
        
        
        ListNode middle = getMiddle(head);
        ListNode second = middle.next;
        middle.next = null;
        
        
        
        // left and right side
        
        ListNode left = sortList(head);
        ListNode right = sortList(second);
        
        
        return merge(left, right);
        
    }   
        
        public ListNode getMiddle(ListNode head){
            
            
            ListNode hare = head;
            ListNode turtle = head;
            
            while(hare.next != null && hare.next.next != null){
                
                hare = hare.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }
        
        
        public ListNode merge(ListNode a, ListNode b){
            
            ListNode dummy = new ListNode(0); // head maintain and find the head and that why make the head
            ListNode curr = dummy;  // curr make the dummy
            
            while(a != null && b != null){
            if(a.val < b.val){ // means a val is lesser then b.val  dummy next Node is lesser connect
                
                curr.next = a; // dummy.next connct karata smaller value sathe 
                a = a.next; // after a next is connect 
                
            }else{ // (b.val < a.val)
              
              curr.next =  b; // means ke b val is lesser then a.val dummy next Node is connect the lesser val
              b = b.next;  // after update the b.val               
                
            }
            curr = curr.next;
        }
   
        
      
        if(a != null){ // if the merge a and b and merging  a first Not null 
        
             curr.next = a;     // connect curr.next is a  
        }else{ // b != null
            curr.next = b; // connect curr.next = b
            
        }
        return dummy.next;
     }
}
