class Solution {
    public String makeGood(String s) {


        Stack<Character> S = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);


          if(!S.isEmpty() && Math.abs(S.peek() - ch)== 32){ // 32 koi bhi lowecase and upper case na  ni badbaki 32 thay che 

                S.pop();
            }else{

                S.push(ch);
            }
        }
         
         StringBuilder R = new StringBuilder();

         for(int i=0; i<S.size(); i++){ // Stack sudhi loop chale che
            char c = S.get(i);// Stack ma character get kare che 
            R.append(c); // String ma appened kare che 
         }

         return R.toString(); // Stack e String ma convert kare che 
    }
}
