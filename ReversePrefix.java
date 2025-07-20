class Solution {
    public String reversePrefix(String word, char ch) {
 // starting index chalu karyu che -1 
        Stack<Character> S = new Stack<>();
           int i =0;

         while (i < word.length()) {
        S.push(word.charAt(i));
        if (word.charAt(i) == ch) {
            break;
        }
        i++;
    }


  if(i == word.length()){ // if the ch no this return word as it is
    return word;
  }

   // Stack to String 

  StringBuilder R = new StringBuilder();


  while (!S.isEmpty()) {
        R.append(S.pop());
    }

    R.append(word.substring(i + 1)); // i =3 ni agan vi value append kare che


    return R.toString();   // stsck to String      
    }
}
