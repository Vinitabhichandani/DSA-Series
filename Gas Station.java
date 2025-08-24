

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

    int Gas = 0;
    int Cost = 0;


    for(int i=0; i<gas.length; i++){
        Gas += gas[i];
    }

    for(int i=0; i<cost.length; i++){

        Cost += cost[i]; 
    }
        if(Gas < Cost){
            return -1; // if the gase is the Not enough to go to the next pointer so gas is Not the return -1 stuck the point that
        } 



 int start = 0; // Start is the give me the starting index point
        int currgas = 0; // currgas how may gases are need to to the go to the next pointer 


    for(int i=0; i<gas.length; i++){

       
        currgas += (gas[i] - cost[i]); // give me the mines values of the currgas so Not stay one point and give me the positive value go to next point 


        if(currgas < 0){ // currgas is the value is the less then the zero  currgas less then the 0 means get the value is the is the -1, -2, -3
        start = i + 1; // go to the next pointer i is the index  
        currgas = 0;  //  reset kara va mate
    }
  }
    return start;
   }
} 
