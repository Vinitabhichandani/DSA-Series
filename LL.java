

class LL{

        Node head;
 

        public class Node{

                String data;
                Node next;

                Node(String data){

                        this.data = data;
                        this.next = null; // Not define LL so next null
                }
        }

public void AddFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
          head = newnode;
          return;
        }

        newnode.next = head;
        head = newnode;
}     


public void AddLast(String data){
Node newnode = new Node(data);

        if(head == null){
                head = newnode;
                return;
        }

        Node  currNode = head; // Never change the head head is the king of the LL and if you change the head and do the Next head first head.val is destroy

        while(currNode.next != null){
                currNode = currNode.next;
        }
        currNode.next = newnode;
}


public void printList(){

        Node currNode = head;



        while(currNode != null){
        System.out.print(currNode.data + "-->");
                
        currNode = currNode.next;
        }

        System.out.println("null");   
}


public void removeFirst(){

        if(head == null){
                System.out.println("Empty list is Nothing to declare");
                return;
        }

        head = head.next;
}


public void removeLast(){

        if(head == null){
                System.out.println("Empty list is nothing to declare");
                return;
        }


        Node secondlast = head;
        Node lastNode = head.next;


        while(lastNode.next != null){
                lastNode = lastNode.next;
                secondlast = secondlast.next;
        }

        secondlast.next = null;

}





public static void main(String args[]){

        LL list = new LL();
        list.AddFirst("this");
        list.AddLast("is");
        list.AddLast("a");
        list.AddLast("Linkedlist");
        list.printList();

        }
}







