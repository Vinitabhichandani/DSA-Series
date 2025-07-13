import java.util.*;

public class xpown{

    public static int calcupow(int x , int n ){ // new functions powwr hovathi return type int avse yad rakhava 

        if(n==0){ // base case
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpown = calcupow(x,n-1) * x;
        int xpownm1 = calcupow(x,n-1);
        return xpown;
    }

    public static void main(String[]args){

        int x = 3;
        int n = 3;
        int ans = calcupow(x,n);
        System.out.println(ans);
    }
}