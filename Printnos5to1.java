import java.util.*;
public class Printnos5to1 {
    public static int  printnumber(int n){
        System.out.println("the n vaue in recursion is"+n);
        if (n==1){
            return 0;
        }
        else{
            return printnumber(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        printnumber(n);

    }

    
}
