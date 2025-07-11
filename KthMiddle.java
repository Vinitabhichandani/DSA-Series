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



// **
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     public int val;
//  *     public ListNode next;
//  *     ListNode(int x) { val = x; next = null; }
//  * }
//  */




// public class KthMiddle {
// 	public ListNode detectCycle(ListNode head) {
        
        
//         ListNode hare = head;
//         ListNode turtle = head;
        
        
//         while(hare != null && hare.next != null){
            
//             hare = hare.next.next;
//             turtle = turtle.next;
            
            
//             if(hare == turtle){
                
//             turtle = head;
            
//             while(turtle != hare){
//                 turtle = turtle.next;
//                 hare = hare.next;
//             }
//             return turtle;
//         }
        
//       }
//       return null;
//    } 
// } 


// import java.util.*;

// class KthMiddle{

//     public static void printperm(String str, int idx, String perm){


//         if( str.length() == 0){
//             System.out.println(perm);
//             return;
//         }

//         for(int i=0; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             String newstr = str.substring(0, i) + str.substring(i+1); 
//             printperm(newstr, idx + 1,  perm + currchar);
//         }
//     }


//     public static void main(String args[]){

//         String str = "abc";
//         printperm(str, 0, "");
//     }
// }



// import java.util.*;

// class KthMiddle{

//     public static void printsub(String str, int idx, String sub, HashSet<String> set){


//         if(idx == str.length()){

//             if(set.contains(sub)){ //  if the set exist substring return  
//                 return;
//             }else{ // Not exist substring return print after checking the set
//              System.out.println(sub);
//                 set.add(sub);
//                 return;
//             }
            
//         }

//         char currchar = str.charAt(idx);

//         // include the character

//         printsub(str, idx + 1, currchar + sub, set);

//         // Not included
//         printsub(str, idx + 1, sub, set);
//     }

//     public static void main(String args[]){

//         HashSet<String> set = new HashSet<>();
//         String str = "aaa";
//         printsub(str, 0, "", set);
//     }
// }





// import java.util.*;

// class KthMiddle{

//     public static void printsub(String str, int idx, String sub){


//         if(idx == str.length()){
//             System.out.println(sub);
//                 return;
//             }
            
        

//         char currchar = str.charAt(idx);

//         // include the character

//         printsub(str, idx + 1, currchar + sub);

//         // Not included
//         printsub(str, idx + 1, sub);
//     }

//     public static void main(String args[]){

//         String str = "abc";
//         printsub(str, 0, "");
//     }
// }


// import java.util.*;

// class KthMiddle{

//     public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//     public static void printcomb(String str, int idx, String comb){

//         if(idx == str.length()){
//             System.out.println(comb);
//             return;
//         }

//     char currchar = str.charAt(idx);
//     String mapping = keypad[currchar - '0']; // use the static mapping array

//     for(int i = 0; i < mapping.length(); i++) {
//         printcomb(str, idx + 1, comb + mapping.charAt(i)); // append to comb, not currchar
//     }

//     }

//     public static void main(String args[]){

//         String str = "5";
//         printcomb(str, 0, "");
//     }
// }


// public class Solution {
//     public ListNode SortBinaryLinkedList(ListNode head) {  // interview Bit
        
        
//         int zero = 0;
//         int one = 0;
        
         
//          ListNode curr = head;
//         while(curr != null){
            
//             if(curr.val == 0){
                
//                 zero++;
//             }else{
                
//                 one++;
//             }
//             curr = curr.next;
//         }
        
//         curr = head;
        
        
//         while(zero > 0){
//             curr.val = 0;
//             curr = curr.next;
//             zero--; // head = head.next agan jay pachi tame 1 ave tyare zero -- karo ke 0 muki kadyo che
            
//         }
        
//         while(one > 0){
//             curr.val = 1;
//             curr = curr.next; // move forward karo update thayo
//             one--; // one put karya pachi decrese karo
//         }
//         return head;
//     }    
// }






// import java.util.*;

// class Hashing{

//     public  static boolean [] map = new boolean [26]; // boolean map ma 26 alphabates che A to Z

//     public static void printRemoveDuplicates(String str, int idx, String newstr){

//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }

//         char currchar = str.charAt(idx);

//         if(map[currchar - 'a']) { //0, 1, 3 = true, 
//             printRemoveDuplicates(str, idx + 1, newstr);
//         }else{

//             newstr += currchar;
//             map[currchar - 'a'] = true;
//             printRemoveDuplicates(str,  idx + 1, newstr );
//         }

//     }

//     public static void main(String args[]){
//         String str = "abbccda";
//         printRemoveDuplicates(str, 0, "");
//     }
// }


// import java.util.*;

// class Hashing{

//     public static void moveallX(String str, int idx, int counter, String newstr){


//         if(idx == str.length()){

//             for(int i=0; i<counter; i++){
//                 newstr += 'x';

//             }
//             System.out.println(newstr);
//             return;
//         }
//       char currchar = str.charAt(idx);

//         if(currchar == 'x'){
//             counter++;
//             moveallX(str, idx + 1, counter , newstr);

//         }else{
//             newstr += currchar;
//             moveallX(str, idx + 1, counter , newstr);
//         }
//     }

//     public static void main(String args[]){

//         String str = "axbcxxd";
//         moveallX(str, 0, 0, "");
//     }
// }
 




// import java.util.*;

// class KthMiddle{

//     public static boolean issorted(int arr[], int idx){


//         if(idx == arr.length-1){
//             return true;
//         }


//         if(arr[idx] < arr[idx + 1]){ // e.g idx 0 per 1 and idx+1 is 2 1<2 yes and 1 idx per 2 and idx + 1 per 3 2<3 true and  idx 3 and idx + 1per 4) 3 <4  
//             return issorted(arr, idx + 1);
//         }else{
//            return false;
//         }

//        //retur=n issorted(arr, idx + 1);
//     }

//     public static void main(String args[]){

//         int arr [] = {1, 2, 3, 4, 4};

//         System.out.println(issorted(arr, 0));
//     }
// }




// import java.util.*;


// class KthMiddle{

//     public static int first = -1;
//     public static int last = -1;

//     public static void FindOcurrence(String str, int idx, char element){

//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//            return; 
//         }




//         char currchar = str.charAt(idx);

//         if(currchar == element){
//             if(first == -1){
//                  first = idx;
//             }else{
//                 // if the first Not != -1
//                 last = idx;
//             }
//         }
//         FindOcurrence(str, idx + 1, element);
//     }

// public static void main(String args[]){

//     String str = "abaacdaefaah";
//     FindOcurrence(str, 0, 'a');
// }
// }

// // remove duplicates

// import java.util.*;

// class  KthMiddle{

//         public static boolean [] map = new boolean[26];

//         public static void Remove(String str, int idx, String newstr){

//                 if(idx == str.length()){
//                         System.out.println(newstr);
//                         return;
//                 }

//                 char currchar = str.charAt(idx);

//                 if(map[currchar - 'a']){ // true

//                         Remove(str, idx + 1, newstr);

//                 } else{

//                         newstr += currchar;
//                         map[currchar - 'a'] = true;
//                         Remove(str, idx + 1, newstr);
//                 }

//         }

//         public static void main(String args[]){

//                 String str = "abaacdeaefaaah";
//                 Remove(str, 0, "");
//         }
// }

// class Solution { Leetcode 628 baseball
//     public int calPoints(String[] operations) {

        
//         Stack<Integer> s = new Stack<>();

//         for(int i=0; i<operations.length; i++){

//             String op = operations[i];

//             if(op.equals("C")){
//                 s.pop();
//             }
//             else if(op.equals("D")){

//             int last = s.peek();
//              s.push(2 * last);

//             }
//             else if(op.equals("+")){

//                 int last = s.pop();
//                 int secondlast = s.peek();
//                 s.push(last);
//                 s.push(last + secondlast);
//             }
//             else{

//                 int val = Integer.parseInt(op);
//                 s.push(val);
//             }
//         }

//         // final answer
//         int sum = 0;
//         while(!s.isEmpty()){
//             sum += s.pop();
//         }
//         return sum;
//     }
// }



// // print in Reverse String 
// import java.util.*;

// class KthMiddle{


//     public static void printRev(String str, int idx){


//         if(idx == -1){
//             return;
//         }


//         char currchar = str.charAt(idx);
//         System.out.println(currchar);


//         printRev(str, idx - 1);
//     }

//     public static void main(String args[]){

//         String str = "vinit";
//         printRev(str, 4);
//     }
// }


// import java.util.*;

// class KthMiddle{

//     public ListNode reversed(ListNode head){

//         if(head == null || head.next == null){
//             return head;
//         }

//         ListNode prev = null;
//         ListNode curr = head;

//         while(curr != null){
//             ListNode next = curr.next;

//             curr.next = prev;

//             // update 
//             prev = curr;
//             curr = next;
//         }
//     }
//     return prev;
// }



// public Node ReverseRecursiveList(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }

//         Node newhead = ReverseRecursiveList(head.next);
//         head.next.next = head;
//         head.next = null;

//         return newhead;

//     }



// public Node RecurisiveList(Node head){

//     if(head == null || head.next == null){
//         return head;
//     }

//     Node newhead = RecurisiveList(head.next);

//     head.next.next = head;
//     head.next = null;
//     return newhead;
// }




// import java.util.*;

// class KthMiddle{

//     public ListNode removeNthfromeEnd(ListNode head, int n){

//         if(head == null || head.next == null){
//             return head;
//         }


//         // front size
//         int size = 0;
//         ListNode curr = head;
//         while(curr != null){
//       curr = curr.next;
//             size++;
//         }


//         if(n == size){ // if the n is equal to the head means traves the head and delete the head return the head.next

//             return head.next;
//         }

//             // back side // we need to find prev and delete the Node 

//             int IndexToSearch = size-n;
//             ListNode prev = head;
//             int i = 1; // basicaly i traching for the prev LL howmany times occures

//             while(i < IndexToSearch){

//           prev = prev.next;
//                  i++;
//             }

//             prev.next = prev.next.next;
//             return head;
//         }
//     }
