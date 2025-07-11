

import java.util.*;

class KeyPad{


  public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; // convert keypad to map

  public static void printcomb(String str, int idx, String comb){


    if(idx == str.length()){ // base case 
      System.out.println(comb);
      return;
    }


    char currchar = str.charAt(idx); // currchar 

    String map = keypad[currchar - '0'];

    for(int i=0; i<map.length(); i++){
      printcomb(str, idx + 1, comb + map.charAt(i));
    }

  }


  public static void main(String args[]){

    String str = "36";
    printcomb(str, 0, "");
  }
}




