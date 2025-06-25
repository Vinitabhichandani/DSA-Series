







// class copyRandomList{

//   public Node copyRandomList(Node head){

//     if(head == null){ // if the head null so return null
//       return null;
//     }



//     HashMap<Node , Node> map = new HashMap<>(); // <Node, Node> in oldtemp, and newtemp

//     Node newhead = new Node (head.val);
//     map.put(head, newhead);
//     Node oldtemp = head.next; // because when the oldtemp go to the next then copynode 
//     Node newtemp = newhead;




//     while(oldtemp != null){
//       Node copyNode = new Node(oldtemp.val); // 
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




