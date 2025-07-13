import java.util.*;

public class xpown{

    public static int calcupow(int x , int n ){ 

        if(n==0){ // base case
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n % 2 == 0){ // means ke even  why use optimize TC (log n)

            xpown(x, n/2) * xpown(x, n/2);
            
           }else{
            xpown(x, n/2) * xpown(x, n/2) * x;
        }   

    public static void main(String[]args){

        int x = 3;
        int n = 3;
        int V = calcupow(x,n);
        System.out.println(V);
    }
}
