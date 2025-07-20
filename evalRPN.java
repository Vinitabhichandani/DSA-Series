class Solutionn {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();
             int n = tokens.length;

        for(int i=0; i<n; i++){

            if(tokens[i].equals("+")){
               
                int a = s.pop();
                int b = s.pop();
               s.push(a + b);
                
            }else if(tokens[i].equals("*")){

                int a = s.pop();
                int b = s.pop();
                s.push(a * b);

            }else if(tokens[i].equals("/")){
                int b = s.pop(); // b i value big hovi joi jethi 0. ma na ave 1 ma ave
                int a = s.pop();

                s.push(a / b);


              }else if(tokens[i].equals("-")){

                int b = s.pop(); // b ni value e big hovi joi + answer ave che 
                int a = s.pop();

                s.push(a-b);

                
              }else{

                s.push(Integer.parseInt(tokens[i]));  // tokens[i] e String che  String ne Integer ma convert karava mate Integer.parseInt(tokens[i])
              }
            }
            return s.pop(); // Stack ma pop kari kado
            
        }
    }
