


//Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

class Solution{
    public TreeNode  sortedListToBST(ListNode head){

        

        if(head == null){
            return null;
        }

        if(head.next == null){
            return new TreeNode(head.val);
        }


        ListNode mid = getmiddle(head);
        TreeNode root = new TreeNode(mid.val);
        
        if(head == mid){ // if the first Node mid root.left = null 

            root.left = null;
        }else{
            root.left = sortedListToBST(head);
        }

        root.right = sortedListToBST(mid.next);

        return root;
    }

public ListNode getmiddle(ListNode head){


    ListNode hare = head;
    ListNode turtle = head;
    ListNode prev = null;


    while(hare != null && hare.next != null){


        hare = hare.next.next;
        prev = turtle;
        turtle = turtle.next;
    }
    prev.next = null;
    return turtle;
}

}



    


