public class KthMiddle {
    public int solve(ListNode A, int B) { // interview Bit

        ListNode curr = A;
        int length = 0;

    
    
    while(curr != null){
        
        curr = curr.next;
        length++;
    }
    
    
    // find the middle 
    
    int mid = length/2;
    
    //target
    
    int target = mid-B;
    
    
    if(target < 0){
        return -1;
    }
    
    curr = A; // the loop is started the curr variable A till the end
    
    
    for(int i=0; i<target; i++){ //loop run the till the target 
        curr = curr.next; // update the curr    
    }
    return curr.val;

    }
} 



