






// import java.util.*;


// class copyRandomList{

//   public Node copyRandomList(Node head){

//     if(head == null){ // if the head null so return null
//       return null;
//     }



//     HashMap<Node , Node> map = new HashMap<>(); // <Node, Node> in oldtemp, and newtemp

//     Node newhead = new Node (head.val);
//     map.put(head, newhead);
//     Node oldtemp = head.next; // because when the oldtemp go to the next then copynode is make
//     Node newtemp = newhead;




//     while(oldtemp != null){
//       Node copyNode = new Node(oldtemp.val); // old temp na kar ne copy bati jay che
//       map.put(oldtemp, copyNode);
//       newtemp.next = copyNode; 
//       oldtemp = oldtemp.next;
//       newtemp = newtemp.next;
//     }


//     oldtemp = head;
//       newtemp = newhead;

//     // random
//     while(oldtemp != null){
//       newtemp.random = map.get(oldtemp.random);
//       oldtemp = oldtemp.next;
//       newtemp = newtemp.next;
      
//     }
//     return newhead;
//   }
// }




// import java.util.*;

// class copyRandomList{

//   public Node copyRandomList(Node head){

//     if(head == null){
//       return null;
//     }


//     HashMap<Node, Node> map = new HashMap<>(); // Node , Node  ma oldtemp ane newtemp store karva mate che

//     Node newhead = new Node(head.val);
//     map.put(head, newhead);

//     Node oldtemp = head.next; // oldtemp next thase to copyNode banse
//     Node newtemp = newhead; // newtemp ma newhead store kare che


//     while(oldtemp != null){

//       Node copyNode = new Node(oldtemp.val); // oldtemp.next thi copyNode banse
//       map.put(oldtemp, copyNode);
//       newtemp.next = copyNode; // jem jem newtemp.next thase tem tem copyNode banse

//       oldtemp = oldtemp.next;
//       newtemp = newtemp.next;
//     }

//     oldtemp = head;
//     newtemp = newhead;

//      // random

//      oldtemp = head;
//      newtemp = newhead;

//      while(oldtemp != null){
//       newtemp.random = map.get(oldtemp.random);
//       oldtemp = oldtemp.next;
//       newtemp = newtemp.next;

//      }
//      return newhead;
//   }
// }




import java.util.*;


class copyRandomList{
  public Node copyRandomList(Node head){

    if(head == null){ // if the head is null return null thay che
      return null; 
  }

  HashMap<Node, Node> map = new HashMap<>(); // Node, Node ma oldtemp ane newtemp store karuyu che

  Node newhead = new Node(head.val);// newhead ma head.val store thay che
 map.put(head, newhead);
 Node oldtemp = head.next; // jem jem head.next thato jay tem tem copyNode start thi banse
 Node newtemp = newhead;

  while(oldtemp != null){
    Node copyNode = new Node(oldtemp.val); // newhead e oldtemp.val ne copy karto jay ane agan Node banave che
    map.put(oldtemp, copyNode); // kem store karvayu map ma // oldtemp.next thi copyNode banse
    newtemp.next = copyNode;


    oldtemp = oldtemp.next;
    newtemp = newtemp.next;
  }


  // Random

  oldtemp = head;
  newtemp = newhead;

  while(oldtemp != null){

    newtemp.random = map.get(oldtemp.random);

    oldtemp = oldtemp.next;
    newtemp = newtemp.next;
  }
  return newhead;
   }
}







import java.util.*;

class Solution{

  public Node copyRandomList(Node head){

    if(head == null){
      return null;
    }


  HashMap<Node, Node> map = new  HashMap<>(); // basically store in map oldtemp and newtemp

  Node newhead = new Node(head.val); // head ni val thi newhead bane che
  map.put(head, newhead);

  Node oldtemp = head.next;
  Node newtemp = newhead;

  while(oldtemp != null){

    Node copyNode = new Node(oldtemp.val);
    newtemp.next = copyNode;

    map.put(oldtemp, copyNode);
    oldtemp = oldtemp.next;
    newtemp = newtemp.next;
  }


  // random pointer

  oldtemp = head;
  newtemp = newhead;

  while(oldtemp != null){

  newtemp.random = map.get(oldtemp.random);


  oldtemp = oldtemp.next;
  newtemp = newtemp.next;
   }
   return newhead; 
 }
}


