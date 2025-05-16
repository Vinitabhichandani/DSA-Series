// import java.util.*;

// class Git{

//     public static void quicksort(int arr[], int low, int high){

//         if(low < high){

//             int pi = partition(arr, low, high);

//             quicksort(arr, low, pi-1);
//             quicksort(arr, pi+1, high);

//         }
//     }

//         public static int partition(int arr[], int low, int high){

//             int pivot = arr[high];
//             int i = low-1 ;// jena lidhe partition possible cha thay cha 
             
//             for(int j=low; j<high; j++){

//                 if(arr[j] < pivot){ // pivot karta nana element avi jay agan 

//                     i++;
//                     // swap with smalle element
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }

//             i++;
//             // swap with biiger element
//             int temp = arr[i];
//             arr[i] = arr[high];
//             arr[high] = temp;
//             return i;
//         }

//         public static void main(String args[]){

//             int arr[] = {7, 8, 9, 4, 2, 9, 1};
//             int n = arr.length;
//             quicksort(arr, 0, n-1);

//             // print
//             for(int i =0; i<n; i++){
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
//     }



//     import java.util.*;

//     class Git{ // megerd sort divide and conquer ave j

//         public static void divide(int arr[], int si, int ei){

//             if( si >= ei){
//                 return;
//             }

//             int mid = si + (ei-si)/2; // ending idx e total length karata o chi hoy cha ei-si
//             divide(arr, si , mid);
//             divide(arr, mid + 1, ei);
//             conquer(arr,si, mid, ei );
//         }

//         public static void conquer(int arr[], int si, int mid, int ei){
    
//             int [] merged = new int [ei-si+1]; // starting idx e 0 thi start thay cha ane ending idx e total length krata o cho hoy cha
      
//             int idx1 = si;
//             int idx2 = mid +1;
//             int x = 0; 
 

//             while(idx1 <= mid && idx2 <= ei){
//                if(arr[idx1] < arr[idx2]){
//                 merged[x++] = arr[idx1++];
//                }else{

//                 merged[x++] = arr[idx2++];
//                }
//             }


//                while(idx1 <= mid){
//                 merged[x++] = arr[idx1++];
//                }

//                while(idx2 <= ei){
//                 merged[x++] = arr[idx2++];
//                }

//                for(int i=0, j= si; i<merged.length; i++,j++){
//                  arr[j] = merged[i];

//                   }                
//                }
    

//             public static void main(String args[]){

//                 int arr[] = {7, 67, 43, 21, 54, 678};
//                 int n = arr.length;
//                 divide(arr, 0, n-1);

//                 // print

//                 for(int i=0; i<n; i++){
//                     System.out.print(arr[i] + " ");
//                 }
//                 System.out.println();
//             }
//         }
        
    



//         import java.util.*;
// class Git{ // itreretive
//         public static void ReverseList(ListNode head){

//             if(head == null || head.next == null){
//                 return;
//             }

//             ListNode prevNode = head;
//             ListNode currNode = head.next;

//             while(currNode != null){
//                 ListNode nextNode = currNode.next;

//                 currNode.next = prevNode;

//                 // update
//                 prevNode = currNode;
//                 currNode = nextNode;
//             }

//            head.next = null;
//             return prevNode;
//         }
//     }

//     import java.util.*;

//     class Git{ // Recursive

//         public static ListNode ReverseRecursive(ListNode head){

//             if(head == null || head.next == null){
//                 return head;
//             }

//             ListNode newhead = ReverseRecursive(head.next);

//             head.next.next = head;
//             head.next = null;
//             return newhead;
//         }
//     }



//     import java.util.*;

//     class Git{

//         public static boolean isPalindromic(ListNode head){

//             if(head == null || head.next == null){
//                 return true;
//             }

//             ListNode FirstHalfStart = head;
//             ListNode FirstHalfEnd = getmiddle(head);
//             ListNode SecondHalfStart = reverse(FirstHalfEnd.next);

//             while(SecondHalfStart != null){
//                 if(FirstHalfStart.val != SecondHalfStart.val){
//                     return false;
//                 }

//                 SecondHalfStart = SecondHalfStart.next;
//                 FirstHalfStart = FirstHalfStart.next;
//             }
//             return true;
//         }

//             public static ListNode getmiddle(ListNode head){


//              ListNode hare = head;
//              ListNode turtle = head;

//              while(hare != null && hare.next != null){

//                 hare = hare.next.next;
//                 turtle = turtle.next;
//              }
//              return turtle;
//             }

//             public static ListNode reverse(ListNode head){

                

//                 ListNode prev = null;
//                 ListNode curr = head;

//                 while(curr != null){
//                     ListNode next = curr.next;

//                     curr.next =prev;

//                     // update
//                     prev = curr;
//                     curr = next;

//                 }
//                 return prev;
//             } 
//         }



    //     import java.lang.classfile.components.ClassPrinter.ListNode;
    //     import java.util.*;

    //     class Git{
    //         public static void PushAtBottom(int data, Stack<Integer> s){

    //         if(s.isEmpty()){
    //             s.push(data);
    //             return;
    //         }

    //         int top = s.pop();
    //         PushAtBottom(data, s);
    //        s.push(top);

    //     }

    //     public static void revers(Stack<Integer> s){

    //         if(s.isEmpty()){
    //             return;
    //         }

    //         int top = s.pop();
    //         revers(s);
    //         PushAtBottom(top, s);
    //     }
    //        public static void main(String args[]){
    //         Stack<Integer> s = new Stack<>();

    //         s.push(1);
    //         s.push(2);
    //         s.push(3);

    //         revers(s);

    //         /// print 
            
    //         while(!s.isEmpty()){
    //             System.out.println(s.peek());
    //             s.pop();
    //         }

    //     }
    // }



 //Q1
     

//      public static ListNode removeNthfromeend(ListNode head, int n){

//         if(head == null || head.next == null){
//             return head;
//         }

//         // size 
//         int size = 0;
//         ListNode curr = head;
//         while(curr != null){
//             curr = curr.next;
//             size++;
//         }

//         // if size is equal to the n
        
//         if(size == n){
//             return head.next;
//         }

//         // prev
//         int IndexToSearch = size-n;
//             ListNode prev  = head;
//             int i = 1; // bascaly i track for prev LL howmany times
//             while(i<IndexToSearch){
//                 prev = prev.next;
//                 i++;
//             }
//             prev.next = prev.next.next;
//             return head;  
//      } 


// // Q2

// public static boolean hasCycle(ListNode head){

//     if(head == null || head.next == null){
//         return false;
//     }

//     ListNode hare = head;
//     ListNode turtle = head;

//     while(hare != null && hare.next != null){

//         hare = hare.next.next;
//         turtle = turtle.next;


//         if(hare == turtle){
//             return true; // loops che
//         }
//     }
//     return false;
//   }  // ane jo na hoy to na return false;



//     public static ListNode removemeetingpoint(ListNode head, ListNode meeting){

//         ListNode hare = meeting; // kem ke hare vadhare run karcha atle hare malse turtle ne
//         ListNode turtle = head;

//         while(hare != turtle){

//             hare = hare.next;
//             turtle = turtle.next;
//         }
//         hare.next = null;
//         return head;
//     }





// cclass Solution {
//     public ListNode detectCycle(ListNode head) {
//         if (head == null || head.next == null) return null;

//         ListNode hare = head;     // ફાસ્ટ પોઈન્ટર – 2 સ્ટેપ્સ
//         ListNode turtle = head;   // સ્લો પોઈન્ટર – 1 સ્ટેપ

//         // સ્ટેપ 1: ફલોયડના એલ્ગોરિધમનો ઉપયોગ કરીને સાઇકલ શોધો
//         while (hare != null && hare.next != null) {
//             hare = hare.next.next; // હેરને 2 સ્ટેપ આગળ વધારવો
//             turtle = turtle.next;  // ટર્ટલને 1 સ્ટેપ આગળ વધારવો

//             if (hare == turtle) {
//                 // સાઇકલ શોધાઈ છે, હવે એન્ટ્રી પોઈન્ટ શોધો
//                 ListNode start = head; // સાઇકલના પ્રારંભિક બિંદુ માટે હેડથી પ્રારંભ કરો

//                 while (start != turtle) {
//                     start = start.next;
//                     turtle = turtle.next;
//                 }

//                 return start; // સાઇકલનો પ્રારંભિક નોડ
//             }
//         }

//         return null; // સાઇકલ નથી
//     }
// }


 // sudoku
//  import java.util.*;

//  class Git{

// public static boolean isSafe(char[][]board, int row, int col, char dig){

//     // horizontal && vertical

//     for(int i =0; i<9; i++){
//         if(board[row][i] == dig || board[i][col] == dig){
//             return false;
//         }
//     }

//     // gird

//     int sr = (row/3) * 3;
//     int sc = (col/3) * 3;

//     for(int i=sr; i <=sr+2; i++){
//         for(int j=sc; j<=sc+2; j++){
//             if(board[i][j] == dig){
//                 return false;
//             }
//         }
//     }
// return true;

// }


// public static boolean helper(char[][]board, int row, int col ){


//     if(row == 9){
//         return true;
//     }

//     int nextrow = row;
//     int nextcol = col + 1;

//     if(nextcol == 9){
//         nextrow = row + 1;
//         nextcol =0;
//     }

//     if(board[row][col] != '.'){
//         // board[row][col] =dig;
//         //if(issafe(board, row, col))
//         return helper(board, nextrow, nextcol);
//     }


//     // place the dig

//     for(char dig='1'; dig<= '9'; dig++){
//         if(isSafe(board, row, col, dig)){
//             board[row][col] = dig;
//             if(helper(board, nextrow, nextcol)){
//             return true;
//         }
//         board[row][col] = '.';
//         }
        
//     }
//     return false;

// }


     


// public static void solvesudoku(char [][]board){
//     helper(board, 0, 0);
// }

// public static void main(String args[]){

//     char[][]board = { 
//             {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, 
//             {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//             {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//             {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//             {'4', '.', '.', '.', '.', '3', '.', '.', '1'},
//             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//             {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//             {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//             {'.', '.', '.', '.', '8', '.', '.', '7', '9'}          

//                                              };


//                             solvesudoku(board);

//                             // print

//                             for(int i=0; i<9; i++){
//                                 for(int j =0; j<9; j++){
//                                     System.out.print(board[i][j] + " ");
//                                 }
//                                 System.out.println();
//                             }
//                }
//           }


import java.util.*;

class Git{

    public static boolean isSafe(char [][]board, int row, int col){
int n = board.length;

        // horizonat & vertical

        for(int i=0; i<board.length; i++){
            if(board[row][i] == 'Q' || board[i][col] == 'Q'){
                return false;
            }
        }


        // upper left

        for(int r = row, c= col; r>=0 && c>=0; r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper righ
        for(int r = row, c=col; r>=0 && c<n; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower left
        for(int r = row, c= col; r<n && c>=0; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right

        for(int r =row, c= col; r<n && c<n; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void helper(char[][]board, List<List<String>> allboard, int col){
int n = board.length;
        if(col == board.length){
            saveboard(board, allboard);
            return;
        }



        // place the Queens

        for(int row =0; row<n; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                helper(board, allboard, col + 1);
                board[row][col] = '.';
            }
        }
        
    }


   
    
    public static void saveboard(char[][]board, List<List<String>> allboard){
int n = board.length;
        List<String> newboard = new ArrayList<>();
            for(int i=0; i<n; i++){
                String row = "";
                for(int j =0; j<n; j++){
                row +=board[i][j];
                }
                newboard.add(row);
            }
            allboard.add(newboard);
    }

    
    


   

    public static List<List<String>> solveNQueens(int n){
 

        List<List<String>> allboard = new ArrayList<>();
        char[][]board = new char[n][n];
        helper(board, allboard, 0);
        return allboard;
    }

        


    public static void main(String args[]){

        int n =5;

        List<List<String>> result = solveNQueens(n);

        for(List<String> board : result){
            for(String row : board){
                System.out.println(row);
        }
              System.out.println();
        }
    }

    }





    








    






    
    