class Solution {
    public ListNode swapNodes(ListNode head, int k) {


        if(head == null || head.next == null){
            return head;
        }

          ListNode curr = head;
          int length = 1; // starting length is 1 and till the 5

          while(curr.next != null){
            curr = curr.next;
            length++; // length vadhati rahe che ane length ++ update thati rahe je tiNext Node avto rahe
            
          }

          // find the kth Node first
          ListNode first = head;
          for(int i=1; i<k; i++){
            first = first.next;
          }

          // find the kth Node second

          ListNode second = head;
          for(int i=1; i<length-k+1; i++){
            second = second.next;
          }


          int temp = first.val; // first Node ne temp ma muki dai che ane second Node ne temp ma muki dai che ane  first Node <--> second Node
          
          first.val = second.val;
          second.val = temp;
          return head;
          }
    }
