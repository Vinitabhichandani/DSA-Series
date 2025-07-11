


import java.util.*;


class  FindOcurrence{

    public static int first = -1;
    public static int last = -1;

    public static void FindOcurrence(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
           return; 
        }




        char currchar = str.charAt(idx);

        if(currchar == element){
            if(first == -1){
                 first = idx;
            }else{
                // if the first Not != -1
                last = idx;
            }
        }
        FindOcurrence(str, idx + 1, element);
    }

public static void main(String args[]){

    String str = "abaacdaefaah";
    FindOcurrence(str, 0, 'a');
}
}