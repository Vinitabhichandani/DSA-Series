

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

      curr = curr.next; // basically a list vaddha ti rahe tena mate cur
    }
    return head;

   }
 }



 //🔄 વિઝ્યુલ ફ્લો:
//શરુઆતમાં:

//text
//Copy
//Edit
//curr = 1
//curr.child = null → એમાં કંઈ નહિ થાય

//હવે curr = curr.next → curr = 2

//પછી:

//text
//Copy
//Edit
//curr = 2
//curr.child = null → કંઈ નહિ થાય

//curr = curr.next → curr = 3

//પછી:

//text
//Copy
//Edit
//curr = 3
//curr.child = 7 → flatten(child) → 3 પછી 7 અને 8 જોડાય

//પછી curr = 8 (flatten અંત)

//પછી 4 જોડાય

//અને છેલ્લે curr = curr.next → curr = 4

//આ રીતે તમે આખા લિસ્ટ માં iterate કરો છો.








 

 class Flatten{


    public Node flatten(Node head){


        if(head == null){
            return head;
        }

        Node curr = head;

        while(curr != null){
            if(curr.child != null){

                Node next = curr.next;

                curr.next = flatten(curr.child);

                curr.next.prev = curr;
                curr.child =  null; // means ke bija sathe na joid i jay



                while(curr.next != null){

                    curr = curr.next;
             }

             if(next != null){

                curr.next = next;
                next.prev = curr;
             }
          }
          curr = curr.next;
        }
        return head;
    }
 }






   class flatten{

    public Node flatten(Node head){

        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                 
                Node next = curr.next;

                curr.next = flatten(curr.child);


                curr.next.prev = curr;
                curr.child = null;


                while(curr.next != null){

                    curr = curr.next;
                }

                if(next != null){

                    curr.next = next;
                    next.prev = curr;
            }
          }
          curr = curr.next;
        }
        return head;
    }

   }




   