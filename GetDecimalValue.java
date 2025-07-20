class Solution {
    public int getDecimalValue(ListNode head) {

               ListNode curr = head;
               int num = 0; // 0, 1, 2, 3, 4, .. untill get the 5  
               while(curr != null){
                num = (num <<1) + curr.val; //  this is decimal value so retun the decimal value
               curr = curr.next;  // num = 5 5<<1 + curr.val 1 and after is 0 and againe the 1
        }
        return num;
    }
}



