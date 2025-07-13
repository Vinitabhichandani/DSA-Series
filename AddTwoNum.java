class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode dummy = new ListNode(0);
   ListNode curr = dummy;
   int carry = 0;

while(l1 != null || l2 != null){ // Linked List 1 and 2 first of all LL 1 and to make the val1 and val2 and after sum of
    
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



int sum = val1 + val2 + carry; // sum is val1 + val2 and carry  is sum of two number when the sum is upto 10=> then carry is Allowcated 10 is 1 is carry and 0 is Node
  carry = sum / 10;
   int digit = sum % 10; // sum two num make the new Linked List called digit  but where sum of LinkedList whare is the head head maintain and head not lost that why created dummy
   
   
   
 
   curr.next = new ListNode(digit); // dummy next means curr .next digit
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
   
   if(carry > 0){ // if the sum 10 means 1 is carry >0 curr.next 
        curr.next = new ListNode(carry);
     
   }
   return dummy.next;
   
  }
 }  
   
     
