import java.util.*;
public class permutations {
    public static int fact(int n){
        int pro=1;
        for (int i=1;i<=n;i++){

            pro *= i;
        }
        return pro;
    }
    public static int  permutation( int n, int r){
        int perm = fact(n)/(fact(n-r));
        return perm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int r=3;
        int k=permutation(n,r);
        System.out.println(k);
    }
}
