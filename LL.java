// import java.util.*;

// public class LL{


//     public static void main (String args[]){

//         LinkedList<String> list = new LinkedList<String>();


//         list.add("is");
//         list.add("a");
//         System.out.println(list);


//         list.addFirst("this");
//         System.out.println(list);

//         list.addLast("list");
//         System.out.println(list);

//         list.add(3, "Linked");
//         System.out.println(list);



//         System.out.println(list.get(0));
//         System.out.println(list.get(3));

//         list.remove(3);
//         System.out.println(list);

//         list.add("Linked");
//         System.out.println(list);


//         list.remove(4);
//         System.out.println(list);

//         list.removeLast();
//         list.removeFirst();
//         System.out.println(list);

       // int size = list.size();
       // System.out.println(size); 
       
//     }
// }





// import java.util.*;

// public class LL{

//     public static void main(String args[]){

//         LinkedList<Integer> list = new LinkedList<Integer>();


//         list.add(90);
//         list.add(9);
//         list.add(9000);
//         list.add(9);
//         System.out.println(list);



//         list.addFirst(0);
//         System.out.println(list);

//         list.addLast(33);
//         System.out.println(list);


//         list.removeFirst();
//         System.out.println(list);

//         list.removeLast();
//         System.out.println(list);


//         System.out.println(list.get(0));

//         System.out.println(list.get(3));


//         int size = list.size();
//         System.out.println(size);
//     }
// }

//import java.lang.classfile.components.ClassPrinter.ListNode;

/// scratch implementes 

// class LL{

//     Node head;

//     public class Node{

//         String data;
//         Node next;

    
        
//         Node (String data){

//             this.data = data;
//             this.next = null;
//             size++;

//         }
//     }

//     public void AddFirst (String data){

//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void AddLast(String data){
//       Node newNode = new Node(data);

//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node lastNode = head;
//         while(lastNode.next != null){
//             lastNode.next = newnode;
//         }

//         public printList(){
//             Node currNode = head;

//             while( currNode != null){
//                 System.out.print(currNode. data " -->");

//                 currNode = currNode.next;
//             }
//             System.out.println("null")
//         }

        
//         public void removeFirst (){

//             if(head == null){
//                 System.out.println("Empty line nothing to delate");
//                 return;
//             }
//             head = this.head.head.next;
//             size--;
//         }
        // public void removeLast(){

        //     if(head == null){
        //         System.out.println("Empty line nothing to delate");
        //         size--;
        //         return;
        //     }
        //     if(head.next == null){
        //         head = null;
        //         return;
     
        //     }

        //     Node currNode = head;
        //     Node LastNode = head.next;

        //     while(LastNode.next != null){

        //         currNode = currNode.next;
        //         Last Node = LastNode.next;
        //     }
        //     currNode.next = null;
//             size--;
//         }
//         public int getsize(){
//             return size;
//         }

//         public static void main(String args[]){

//             LL list = New LL();

//             list.addLast ("is");
//             list.addLast ("a");
//             list.addLast("list");

//             list.printList();

//             list.addFirst("this");
//             list.printList();

//             System.out.println(list.getsize());

//             list.removeFirst();

//             list.printList();
        
//         }
//     }
// }



// class LL{

//     Node head;

//     class Node{

//         String data;
//          Node next;


//         Node(String data){ // constructor

//             this.data = data;
//             this.next = null;
//         }
//     }


//     public void addFirst(String data){
// Node newnode = new Node(data);
    
// if(head == null){
//     head = newnode;
//     return;
// }

//         newnode.next = head;
//         head = newnode;
//     }


//     public void addLast(String data){

//         Node newnode = new Node(data);

//         if(head == null){
//             head = newnode;
//             return;
//         }
//         Node lastNode = head;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;

//         }
//         lastNode.next = newnode;
//     }

    
//     public void printList(){

//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + "-->");
//             currNode = currNode.next;

//         }
//         System.out.println("null");
//     }


//     public void RemoveFirst(){

//         if(head == null){
//         System.out.println("Empty list is nothig to delete");
//         return;
//         }

//         head = head.next;
//     }

//     public void RemoveLast(){
//         if(head == null){
//             System.out.println("Empty list nothig to delete");
//             return;
//         }

//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node Secondlast = head;
//         Node last = head.next;

//         while(last.next != null){

//          Secondlast = Secondlast.next;
//          last = last.next;
//         }
//         Secondlast.next = null;
//     }


//     public static void main(String args[]){

//         LL list = new LL();

//         list.addFirst("my");
//         list.addFirst("name");
//         list.addFirst("vinit");
//        list.printList();


//        list.addLast("vinit");
//        list.printList();


//        list.RemoveFirst();
//        list.printList();


//        list.RemoveLast();
//        list.printList();
//     }
// }






// public class LL {
//     Node head;
//     int size;

//     public class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }
    

//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node lastNode = head;
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//         }

//         lastNode.next = newNode;
//     }

//     public void printList() {
//         Node currNode = head;
//         while (currNode != null) {
//             System.out.print(currNode.data + " --> ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }

//     public void removeFirst() {
//         if (head == null) {
//             System.out.println("Empty list, nothing to delete.");
//             return;
//         }
//         head = head.next;
//         size--;
//     }

//     public void removeLast() {
//         if (head == null) {
//             System.out.println("Empty list, nothing to delete.");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             size--;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;
//         while (lastNode.next != null) {
//             secondLast = secondLast.next;
//             lastNode = lastNode.next;
//         }
//         secondLast.next = null;
//         size--;
//     }

//     public int getSize() {
//         return size;
//     }

//     public static void main(String[] args) {
//         LL list = new LL();

//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("list");

//         list.printList();

//         list.addFirst("this");
//         list.printList();

//         System.out.println("Size of list: " + list.getSize());

//         list.removeFirst();
//         list.printList();
//     }
// }


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







// import java.util.*;

// public class LL{

    
//     public static void main(String args[]){

//  LinkedList<String> list = new LinkedList<String>();
    
//         list.addFirst("vinit");
//         list.addFirst("name");
//         list.addFirst("my");
    
//         System.out.println(list);
//     }
// }




// import java.util.*;


// class LL{

//         public static void main(String args[]){



//                 LinkedList<Integer> ll = new LinkedList<>();

//                 ll.addFirst(1);
//                 ll.addLast(2);
//                 ll.addLast(3);
//                 ll.addLast(4);
//                 ll.addLast(5);


//                 System.out.println(ll);

//                 // remove the value    
//                 ll.remove(0); 
//                 System.out.println(ll);
//                  // get the value 
//                 System.out.println(ll.get(0));


//                   // delete the Node
                  
//                   ll.removeFirst();
//                   System.out.println(ll);


//                   // list
//                   System.out.println(ll);

//                   // add
//                   ll.addFirst(2);
//                   System.out.println(ll);


//                        // full LinkedList
//                   System.out.println(ll);


//                   // one by one element print 
//                   for(int i=0; i<ll.size(); i++){
//                         System.out.println(ll.get(i) + " "); // ll.get(i) means ll.get(i) means ke in ll get the value of
//                   }
//                   System.out.println();

//         }
// }


