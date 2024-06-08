import java.util.*;
public class Printnos1to5 {
    public static void  printnumber(int n){
        if(n==0){
            return;
        }
        else{
            printnumber(n-1);
        }
        System.out.println("the no is"+n);
    }
    public static void main(String[] args) {
        int n=5;
        printnumber(n);

    }

    
}
