class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode dummy = new ListNode(0);
   ListNode curr = dummy;
   int carry = 0;

while(l1 != null || l2 != null){
    
    int val1 = 0;
    if(l1 != null){
         val1 = l1.val;
    }else{
        
         val1 = 0;
    }
    int val2 = 0;
    
    if(l2 != null){
     val2 = l2.val;
    }else{
         val2 = 0;
    }



int sum = val1 + val2 + carry;
  carry = sum / 10;
   int digit = sum % 10;
   
   
   
 
   curr.next = new ListNode(digit);
   curr = curr.next;
   
    
   
   if(l1 != null){ // if l1 Not null
       l1 = l1.next;
       
   }else{
       
       l1 = null;
   }
   
   if(l2 != null){
       l2 = l2.next; // l2 not null l2 = l2.next
   }else{
       
       //l2 = null;
       l2 = null;
   }
} 
   
   if(carry > 0){
        curr.next = new ListNode(carry);
     
   }
   return dummy.next;
   
  }
 }  
   
     