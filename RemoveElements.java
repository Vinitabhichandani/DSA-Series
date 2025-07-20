class Solution {
    public ListNode removeElements(ListNode head, int val) {

    if(head == null){
        return head;
    }

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
         dummy.next = head;




    while(curr.next != null){
        if(curr.next.val == val){
            curr.next = curr.next.next;
        }else{
            curr = curr.next;
        }
    }
    return dummy.next;
  }
}


