

// Leetcode 628
 class Solution { 
    public int calPoints(String[] operations) {

        
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<operations.length; i++){

            String op = operations[i];

            if(op.equals("C")){
                s.pop();
            }
            else if(op.equals("D")){

            int last = s.peek();
             s.push(2 * last);

            }
            else if(op.equals("+")){

                int last = s.pop();
                int secondlast = s.peek();
                s.push(last);
                s.push(last + secondlast);
            }
            else{

                int val = Integer.parseInt(op);
                s.push(val);
            }
        }

        // final answer
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }
}

