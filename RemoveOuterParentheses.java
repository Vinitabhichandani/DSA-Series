class Solution {
    public String removeOuterParentheses(String s) {


        Stack<Character> S = new Stack<>();

        StringBuilder R = new StringBuilder(); // StringBuilder  use means the pranthese to concatation very efficiently that why


        for(int i=0; i<s.length(); i++){// run the loop till the string length

            char ch = s.charAt(i); // 

            if(ch == '('){

                if(!S.isEmpty()){
                    R.append(ch); // Apend the only if out most (
                }

                S.push(ch);

            }else{ // ch == ')'
             S.pop();

             if(!S.isEmpty()){
                R.append(ch); // Apend only if the out most )
             }

            }
        }
        return R.toString(); // convert to the StringBilder to the string 
        
    }
}
