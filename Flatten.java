

class Node{

    int val;
    Node prev;
    Node next;
    Node child;

    public Node(int val){
        this.val = val;
    }
}


class flatten{

    public Node flatten(Node head){

        if(head == null){
            return head;
        }


   Node curr = head;

   while(curr != null){
    if(curr.child != null){

        Node next  = curr.next;

        curr.next = flatten(curr.child);

        curr.next.prev = curr;

        curr.child = null;


        // find  tail of the  childList

        while(curr.next != null){

            curr = curr.next;
        }


        if(next != null){

            curr.next = next;
            next.prev = curr;


        }        
      }

      curr = curr.next; // basically a list is update
    }
    return head;

   }
 }



 




   
