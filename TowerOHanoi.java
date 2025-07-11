import java.util.*;

class towerofhanoi{

  public static void towerofhanoi(int n , String src, String helper, String dest){


    if(n == 1){ // if the Minimum one disk is here so print
      System.out.println("transfer Disk" + n + "frome" + src + "to" + dest);
      return;
    }


    towerofhanoi(n-1, src, dest, helper);
    System.out.println("transfer Disk" + n + "frome" + src + "to" + dest);
     towerofhanoi(n-1,helper, src, dest);
      System.out.println("transfer Disk" + n + "frome" + src + "to" + dest);

  }

  public static void main(String args[]){

    int n = 2;
    towerofhanoi( n, "S", "H", "D");
  }
}